using Microsoft.Data.SqlClient;
using System; 
using System.Data;

namespace Databases
{
    internal class InserRecords
    {
        static void Main1(string[] args)
        {
            //Connect();
            //Insert();

            Employee obj = new Employee { EmpNo=109, Name= "Eva", Basic=56000, DeptNo=30 };
            //InsertEmpObj(obj);
            //InsertEmpUsingParameter(obj);
            InsertEmpUsingSP(obj);
        }

        static void Connect() {

            SqlConnection cn = new SqlConnection();

            //Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True; Connect Timeout = 30; Encrypt = False; TrustServerCertificate = False; ApplicationIntent = ReadWrite; MultiSubnetFailover = False
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True;";
            try
            {
                cn.Open();
                Console.WriteLine("Connection created");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally {
                cn.Close();
            } 
        }

        //Insert record - using Text
        static void Insert()
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
                cmdInsert.CommandText = "insert into Employees values(107, 'Kavya',63000, 40)";

                int a = cmdInsert.ExecuteNonQuery();
                Console.WriteLine(a+" record inserted");
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

        //Insert Record - using object
        static void InsertEmpObj(Employee obj)
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
                cmdInsert.CommandText = $"insert into Employees values({obj.EmpNo},'{obj.Name}',{obj.Basic}, {obj.DeptNo})";

                int a = cmdInsert.ExecuteNonQuery();
                Console.WriteLine(a + " record inserted");
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

        //Insert Record - using parameters
        static void InsertEmpUsingParameter(Employee obj)
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
                cmdInsert.CommandText = $"insert into Employees values(@EmpNo, @Name, @Basic, @DeptNo)";
                
                cmdInsert.Parameters.AddWithValue("@EmpNo",obj.EmpNo);
                cmdInsert.Parameters.AddWithValue("@Name", obj.Name);
                cmdInsert.Parameters.AddWithValue("@Basic", obj.Basic);
                cmdInsert.Parameters.AddWithValue("@DeptNo", obj.DeptNo);

                int a = cmdInsert.ExecuteNonQuery();
                Console.WriteLine(a + " record inserted");
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

        //Insert Record - using parameters
        static void InsertEmpUsingSP(Employee obj)
        {

            SqlConnection cn = new SqlConnection();

            //Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True; Connect Timeout = 30; Encrypt = False; TrustServerCertificate = False; ApplicationIntent = ReadWrite; MultiSubnetFailover = False
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True;";
            try
            {
                cn.Open();
                SqlCommand cmdInsert = new SqlCommand();
                cmdInsert.Connection = cn;
                cmdInsert.CommandType = CommandType.StoredProcedure;
                cmdInsert.CommandText = "InsertEmployee";

                cmdInsert.Parameters.AddWithValue("@EmpNo", obj.EmpNo);
                cmdInsert.Parameters.AddWithValue("@Name", obj.Name);
                cmdInsert.Parameters.AddWithValue("@Basic", obj.Basic);
                cmdInsert.Parameters.AddWithValue("@DeptNo", obj.DeptNo);

                int a = cmdInsert.ExecuteNonQuery();
                Console.WriteLine(a + " record inserted");
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
        static void UpdateEmpUsingSP(Employee obj)
        {

            SqlConnection cn = new SqlConnection();

            //Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True; Connect Timeout = 30; Encrypt = False; TrustServerCertificate = False; ApplicationIntent = ReadWrite; MultiSubnetFailover = False
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True;";
            try
            {
                cn.Open();
                SqlCommand cmdInsert = new SqlCommand();
                cmdInsert.Connection = cn;
                cmdInsert.CommandType = CommandType.StoredProcedure;
                cmdInsert.CommandText = "InsertEmployee";

                cmdInsert.Parameters.AddWithValue("@EmpNo", obj.EmpNo);
                cmdInsert.Parameters.AddWithValue("@Name", obj.Name);
                cmdInsert.Parameters.AddWithValue("@Basic", obj.Basic);
                cmdInsert.Parameters.AddWithValue("@DeptNo", obj.DeptNo);

                int a = cmdInsert.ExecuteNonQuery();
                Console.WriteLine(a + " record inserted");
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

    public class Employee {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
    }
}