using Microsoft.Data.SqlClient;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.VisualBasic;
namespace Databases
{
    internal class DeleteRecords
    {
     
        static void Main3(string[] args)
        { 
            //DeleteEmpUsingParameter(110);
            DeleteEmpUsingSP(104);
        }


        //delete Record - using parameters
        static void DeleteEmpUsingParameter(int EmpNo )
        {

            SqlConnection cn = new SqlConnection();

            //Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True; Connect Timeout = 30; Encrypt = False; TrustServerCertificate = False; ApplicationIntent = ReadWrite; MultiSubnetFailover = False
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True;";
            try
            {
                cn.Open();
                SqlCommand cmdDel = new SqlCommand();
                cmdDel.Connection = cn;
                cmdDel.CommandType = CommandType.Text;
                cmdDel.CommandText = "delete from Employees  where EmpNo = @EmpNo";
                cmdDel.Parameters.AddWithValue("EmpNo",EmpNo);

                int a = cmdDel.ExecuteNonQuery();
                Console.WriteLine(a + " record deleted");
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
        static void DeleteEmpUsingSP(int EmpNo)
        {

            SqlConnection cn = new SqlConnection();

            //Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True; Connect Timeout = 30; Encrypt = False; TrustServerCertificate = False; ApplicationIntent = ReadWrite; MultiSubnetFailover = False
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True;";
            try
            {
                cn.Open();
                SqlCommand cmdDel = new SqlCommand();
                cmdDel.Connection = cn;
                cmdDel.CommandType = CommandType.StoredProcedure;
                cmdDel.CommandText = "DeleteEmployee";
                cmdDel.Parameters.AddWithValue("EmpNo", EmpNo);

                int a = cmdDel.ExecuteNonQuery();
                Console.WriteLine(a + " record deleted");
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

     
}