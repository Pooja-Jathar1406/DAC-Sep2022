using System.Diagnostics;

namespace PLINQdemo
{
    internal class Program
    {
        static List<Employee> lstEmp = new List<Employee>();

        static void Main(string[] args)
        {
            AddRecs();  

            Stopwatch stopwatch = new Stopwatch();
            stopwatch.Start();

            //LINQ
            var emps1 = lstEmp.Select(emp => new { Name = LongRunningFunc(emp.Name), emp.EmpNo });
            
            //PLINQ
            var emps2 = lstEmp.AsParallel().WithDegreeOfParallelism(2).Select(emp => new { Name = LongRunningFunc(emp.Name), emp.EmpNo });

            foreach (var emp in emps2) {
                Console.WriteLine("Name : "+emp.Name + ", EmpNo : " + emp.EmpNo);
            }
            Console.WriteLine();

            stopwatch.Stop();
            Console.WriteLine("Elapsed Time is {0} ms", stopwatch.ElapsedMilliseconds);
            Console.WriteLine();
        }
        public static void AddRecs() {
            for (int i = 0; i < 200; i++) {
                lstEmp.Add(new Employee { EmpNo =i+1, Name= "Vikram"+i, Basic =10000, DeptNo= 10+i, Gender="M"});
            }
        }
        public static String LongRunningFunc(String s) { 
            System.Threading.Thread.Sleep(10);
            return s.ToUpper();
        }
    }

    public class Department
    {
        public int DeptNo { get; set; }
        public string DeptName { get; set; }
    }
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
        public string Gender { get; set; }
        public override string ToString()
        {
            string s = Name + "," + EmpNo.ToString() + "," + Basic.ToString() + "," + DeptNo.ToString();
            return s;
        }
    }
}