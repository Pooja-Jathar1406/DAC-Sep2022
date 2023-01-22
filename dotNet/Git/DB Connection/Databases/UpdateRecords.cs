using Microsoft.Data.SqlClient;
using Microsoft.VisualBasic;
using System;
using System.Data;

namespace Databases
{
    internal class UpdateRecord
    {
        static void Main2(string[] args)
        {
             
            Employee1 obj = new Employee1 { EmpNo = 101, Name = "Poojaaaa", Basic = 39000, DeptNo = 30 };
            //UpdateEmpUsingSP(obj);
            //UpdateEmpObj(obj);
            //UpdateEmpUsingParameter(obj);        
        }

        //don't use this , this method causes sql injection attack
        static void UpdateEmpObj(Employee1 obj)
        {

            SqlConnection cn = new SqlConnection();

            //Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True; Connect Timeout = 30; Encrypt = False; TrustServerCertificate = False; ApplicationIntent = ReadWrite; MultiSubnetFailover = False
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True;";
            try
            {
                cn.Open();
                SqlCommand cmdUpdate = new SqlCommand();
                cmdUpdate.Connection = cn;
                cmdUpdate.CommandType = CommandType.Text;
                cmdUpdate.CommandText = $"update Employees set Name = '{obj.Name}', Basic = {obj.Basic}, DeptNo = {obj.DeptNo} where EmpNo = {obj.EmpNo}";  

                int a = cmdUpdate.ExecuteNonQuery();
                Console.WriteLine(a + " record updated");


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

        //update Record - using parameters
        static void UpdateEmpUsingParameter(Employee1 obj)
        {

            SqlConnection cn = new SqlConnection();

            //Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True; Connect Timeout = 30; Encrypt = False; TrustServerCertificate = False; ApplicationIntent = ReadWrite; MultiSubnetFailover = False
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True;";
            try
            {
                cn.Open();
                SqlCommand cmdInsert = new SqlCommand();
                cmdInsert.Connection = cn;
                cmdInsert.CommandType = CommandType.Text;
                cmdInsert.CommandText = "update Employees set Name = @Name, Basic = @Basic, DeptNo = @DeptNo where EmpNo = @EmpNo";
                cmdInsert.Parameters.AddWithValue("@EmpNo", obj.EmpNo);
                cmdInsert.Parameters.AddWithValue("@Name", obj.Name);
                cmdInsert.Parameters.AddWithValue("@Basic", obj.Basic);
                cmdInsert.Parameters.AddWithValue("@DeptNo", obj.DeptNo);

                int a = cmdInsert.ExecuteNonQuery();
                Console.WriteLine(a + " record updated");
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

        //Update Record - using parameters
        static void UpdateEmpUsingSP(Employee1 obj)
        {

            SqlConnection cn = new SqlConnection();

            //Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True; Connect Timeout = 30; Encrypt = False; TrustServerCertificate = False; ApplicationIntent = ReadWrite; MultiSubnetFailover = False
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True;";
            try
            {
                cn.Open();
                SqlCommand cmdUpdate = new SqlCommand();
                cmdUpdate.Connection = cn;
                cmdUpdate.CommandType = CommandType.StoredProcedure;
                cmdUpdate.CommandText = "UpdateEmployee";

                cmdUpdate.Parameters.AddWithValue("@EmpNo", obj.EmpNo);
                cmdUpdate.Parameters.AddWithValue("@Name", obj.Name);
                cmdUpdate.Parameters.AddWithValue("@Basic", obj.Basic);
                cmdUpdate.Parameters.AddWithValue("@DeptNo", obj.DeptNo);

                int a = cmdUpdate.ExecuteNonQuery();
                Console.WriteLine(a + " record updated");
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
    }

    public class Employee1
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
    }
}