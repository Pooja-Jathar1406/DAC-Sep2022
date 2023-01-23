using Microsoft.Data.SqlClient;
using System.Data;

namespace ConsoleApppDataset
{
    internal class Program
    {

        static DataSet ds;
        static void Main(string[] args)
        {
            selectEmp();
            Console.WriteLine("--------------");
            insertEmp();
            Console.WriteLine("--------------");
            deleteEmp();
            Console.WriteLine("--------------");
        }

        static void selectEmp()
        {
            SqlConnection conn = new SqlConnection();
            conn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True;";

            try
            {
                conn.Open();
                SqlCommand cmdSelect = conn.CreateCommand();
                cmdSelect.Connection = conn;
                cmdSelect.CommandType = CommandType.Text;

                SqlDataAdapter da = new SqlDataAdapter();

                ds = new DataSet();

                cmdSelect.CommandText = "select * from Employees";
                da.SelectCommand = cmdSelect;
                da.Fill(ds, "Emp");


                cmdSelect.CommandText = "select * from Department";
                da.SelectCommand = cmdSelect;
                da.Fill(ds, "Dept");

                DataRowCollection drc = ds.Tables["Emp"].Rows;

                foreach (DataRow dr in drc)
                {
                    Console.WriteLine(dr["EmpNo"]);
                    Console.WriteLine(dr["Name"]);
                    Console.WriteLine(dr["Basic"]);
                    Console.WriteLine(dr["DeptNo"]);
                    Console.WriteLine();
                }

                Console.WriteLine("--------------");
                DataRowCollection drc1 = ds.Tables["Dept"].Rows;

                foreach (DataRow dr in drc1)
                {
                    Console.WriteLine(dr["DeptName"]);
                    Console.WriteLine(dr["DeptNo"]);
                    Console.WriteLine();
                }
            }
            catch (Exception ex) { Console.WriteLine(ex.Message); }

        }


        static void insertEmp()
        {

            SqlConnection conn = new SqlConnection();
            conn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True;";
            try
            {
                conn.Open();

                SqlCommand cmdInsert = conn.CreateCommand();
                cmdInsert.Connection = conn;
                cmdInsert.CommandType = CommandType.Text;

                SqlDataAdapter da = new SqlDataAdapter();
                cmdInsert.CommandText = "insert into Employees values(@EmpNo,@Name,@Basic,@DeptNo)";
                Console.WriteLine("Enter the object");
                cmdInsert.Parameters.Add(new SqlParameter { ParameterName = "@Name", SourceColumn = "Name", SourceVersion = DataRowVersion.Current });
                cmdInsert.Parameters.Add(new SqlParameter { ParameterName = "@Basic", SourceColumn = "Basic", SourceVersion = DataRowVersion.Current });
                cmdInsert.Parameters.Add(new SqlParameter { ParameterName = "@DeptNo", SourceColumn = "DeptNo", SourceVersion = DataRowVersion.Current });
                cmdInsert.Parameters.Add(new SqlParameter { ParameterName = "@EmpNo", SourceColumn = "EmpNo", SourceVersion = DataRowVersion.Current });

                da.InsertCommand = cmdInsert;
                ds.Tables["Emp"].Rows.Add(new object[] { int.Parse(Console.ReadLine()), Console.ReadLine(), decimal.Parse(Console.ReadLine()), int.Parse(Console.ReadLine()) });


                da.Update(ds, "Emp");

            }
            catch (Exception ex) { Console.WriteLine(ex.Message); }
            finally { conn.Close(); }

        }

        static void deleteEmp()
        {

            SqlConnection conn = new SqlConnection();
            conn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = JkJan23; Integrated Security = True;";

            try
            {
                conn.Open();

                SqlCommand cmdDelete = conn.CreateCommand();
                cmdDelete.Connection = conn;
                cmdDelete.CommandType = CommandType.Text;

                SqlDataAdapter da = new SqlDataAdapter();
                cmdDelete.CommandText = " delete from Employees where EmpNo = @EmpNo";
                cmdDelete.Parameters.Add(new SqlParameter { ParameterName = "@EmpNo", SourceColumn = "EmpNo", SourceVersion = DataRowVersion.Original });
                da.DeleteCommand = cmdDelete;

                DataRowCollection drc = ds.Tables["Emp"].Rows;

                Console.WriteLine("ENter the Emp no");
                int n = int.Parse(Console.ReadLine());
                DataRow drdel = null;
                foreach (DataRow dr in drc)
                {
                    Console.WriteLine(dr["EmpNo"]);

                    if (int.Parse(dr["EmpNo"].ToString()) == n)
                    {

                        drdel = dr;
                        dr.Delete();
                        break;
                    }

                }

                // ds.Tables["Emp"].Rows.Remove(drdel);
                da.Update(ds, "Emp");

            }
            catch (Exception ex) { Console.WriteLine(ex.Message); }
            finally { conn.Close(); }

        }



    }
}