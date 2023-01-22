namespace Assignment2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");


            Employee o1 = new Employee("Amol", 123465, 10);
            Employee o2 = new Employee("Amol", 123465);
            Employee o3 = new Employee("Amol");
            Employee o4 = new Employee();

            Console.WriteLine(o1.EmpNo); // 1
            Console.WriteLine(o2.EmpNo); // 2
            Console.WriteLine(o3.EmpNo); // 3
            Console.WriteLine(o4.EmpNo); // 4
        }

        

    }
    class Employee
    {
        private static int nextEmpNo = 1; // variable to keep track of next EmpNo
        public string Name { get; set; }
        public readonly int EmpNo;
        public decimal Basic { get; set; }
        public short DeptNo { get; set; }

        public Employee(string name = "", int empNo = 0, decimal basic = 0, short deptNo = 0)
        {
            Name = string.IsNullOrWhiteSpace(name) ? throw new ArgumentException("Name cannot be blank.") : name;
            Basic = basic;
            DeptNo = deptNo <= 0 ? throw new ArgumentException("DeptNo must be greater than 0.") : deptNo;

            EmpNo = nextEmpNo++;
        }

        public decimal GetNetSalary()
        {
            // Example formula to calculate net salary
            return Basic * 0.9m;
        }
    }

   
}