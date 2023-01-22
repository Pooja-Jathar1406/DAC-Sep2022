using Microsoft.Data.SqlClient;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Databases
{
    internal class SelectRecords
    {
        static void Main(string[] args)
        {
            //SelectSingleValue();
            //SelectAllDataReader();

            //Employee3 empobj2= GetSingleUsingDataReader(101);
            //Console.WriteLine(empobj2.Name+" "+empobj2.Basic+" "+empobj2.DeptNo);

            //MARS();


        }
        static void SelectSingleValue()
        {

            SqlConnection cn = new SqlConnection();

            //Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True; Connect Timeout = 30; Encrypt = False; TrustServerCertificate = False; ApplicationIntent = ReadWrite; MultiSubnetFailover = False
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True;";
            try
            {
                cn.Open();
                SqlCommand cmdSelSingleVal = new SqlCommand();
                cmdSelSingleVal.Connection = cn;
                cmdSelSingleVal.CommandType = CommandType.Text;
                
                //cmdSelSingleVal.CommandText = "select * from  Employees ";
                cmdSelSingleVal.CommandText = "select count(*) from  Employees ";

                //ExecuteScalar returns a single value - 1col 1 row
                object returnVal = cmdSelSingleVal.ExecuteScalar(); //101
                Console.WriteLine(returnVal);

                Console.WriteLine( "Single record selected");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
        }

        //Data Reader
        static void SelectAllDataReader()
        {

            SqlConnection cn = new SqlConnection();

            //Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True; Connect Timeout = 30; Encrypt = False; TrustServerCertificate = False; ApplicationIntent = ReadWrite; MultiSubnetFailover = False
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True;";
            try
            {
                cn.Open();
                SqlCommand cmdSelSingleVal = new SqlCommand();
                cmdSelSingleVal.Connection = cn;
                cmdSelSingleVal.CommandType = CommandType.Text;

                cmdSelSingleVal.CommandText = "select * from  Employees ; select * from  Department";

                SqlDataReader dr = cmdSelSingleVal.ExecuteReader();

                //dataReader returns object
                Console.WriteLine("Employees---------------------------");

                while (dr.Read()) { 
                    Console.WriteLine(dr[0]);//selecting 1st column
                    Console.WriteLine(dr["Name"]);//selecting Name column
                    
                    Console.WriteLine(dr.GetInt32(0));//EmpNo
                    Console.WriteLine(dr.GetInt32("EmpNo"));//EmpNo
                    Console.WriteLine(dr.GetString("Name"));//Name
                     
                } 
                Console.WriteLine("Record selected from employees");
                

                Console.WriteLine("Deps---------------------------");
                
                dr.NextResult();//moves to the next set of records - resultset (result of query)
                while (dr.Read())
                { 
                    Console.WriteLine(dr.GetInt32(0));//DeptNo
                    Console.WriteLine(dr.GetInt32("DeptNo"));//DeptNo
                    Console.WriteLine(dr.GetString("DeptName"));//dept name
                     
                }
                Console.WriteLine("Record selected from department");
                Console.WriteLine();


                dr.Close();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
        }

        static Employee3  GetSingleUsingDataReader(int EmpNo)
        {
            Employee3 empObj = new Employee3();    

            SqlConnection cn = new SqlConnection();

            //Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True; Connect Timeout = 30; Encrypt = False; TrustServerCertificate = False; ApplicationIntent = ReadWrite; MultiSubnetFailover = False
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True;";
            try
            {
                cn.Open();
                SqlCommand cmdSel = new SqlCommand();
                cmdSel.Connection = cn;
                cmdSel.CommandType = CommandType.Text;

                cmdSel.CommandText = "select * from  Employees where EmpNo=@EmpNo";
                cmdSel.Parameters.AddWithValue("@EmpNo",EmpNo);

                SqlDataReader dr = cmdSel.ExecuteReader();

                //it will return a record if found , so either 0 record or 1 record
                if (dr.Read())
                {
                    //record found
                    empObj.Name = (string)dr["Name"];
                    empObj.Basic = (decimal)dr["Basic"];
                    empObj.DeptNo = (int)dr["DeptNo"]; 
                    //Console.WriteLine(dr["Name"]);
                }
                else { 
                    //record not found
                }

                
                Console.WriteLine("Records selected");

                dr.Close();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
            return empObj;
        }

        //MARS- Multiple Active Result Set - print dep and all the employees for that dept
        static void MARS()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\MsSqlLocalDb;Initial Catalog=JkJan23;Integrated Security=true;MultipleActiveResultSets=true;";
            cn.Open();

            SqlCommand cmdDepts = new SqlCommand();
            cmdDepts.Connection = cn;
            cmdDepts.CommandType = CommandType.Text;
            cmdDepts.CommandText = "Select * from Department";

            SqlCommand cmdEmps = new SqlCommand();
            cmdEmps.Connection = cn;
            cmdEmps.CommandType = CommandType.Text;

            SqlDataReader drDepts = cmdDepts.ExecuteReader();
            while (drDepts.Read())
            {
                Console.WriteLine((drDepts["DeptName"]));

                cmdEmps.CommandText = "Select * from Employees where DeptNo = " + drDepts["DeptNo"];
                SqlDataReader drEmps = cmdEmps.ExecuteReader();
                while (drEmps.Read())
                {
                    Console.WriteLine(("    " + drEmps["Name"]));
                }
                drEmps.Close();
            }
            drDepts.Close();
            cn.Close();

        }
         
    }
    public class Employee3
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
    }
}
