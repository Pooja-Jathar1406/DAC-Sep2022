namespace Assign5
{
    internal class Question2
    {
        static void Main1(string[] args)
        {
            Employee1[] employeeArr = new Employee1[] {
                new Employee1 { EmpNo = 11, Name = "Pooja", Age = 23 , Salary=40000},
                new Employee1 { EmpNo = 22, Name = "Swapnil", Age = 24, Salary=80000 },
                new Employee1 { EmpNo = 33, Name = "Harika", Age = 23, Salary=50000 }
            }; 

            //Convert array  to list
            List<Employee1> empList = employeeArr.ToList();

            //Print the emp list
            Console.WriteLine("List of Employees :   ");
            Console.WriteLine("-------------------------");
            foreach (Employee1 employee in empList)
            {
                Console.WriteLine("EmpNo: {0}, Name: {1}, Age: {2}", employee.EmpNo, employee.Name, employee.Age, employee.Salary);
            }
        }
    }
    class Employee1
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public int Age { get; set; }
        public int Salary { get; set; }
    }
}