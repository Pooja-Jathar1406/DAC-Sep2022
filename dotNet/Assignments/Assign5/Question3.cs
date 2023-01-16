using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assign5
{
    internal class Question3
    {
        static void Main2(string[] args)
        {
            List<Employee2> empList = new List<Employee2>();
             
            empList.Add(new Employee2 { EmpNo = 11, Name = "Pragati", Age = 23 });
            empList.Add(new Employee2 { EmpNo = 22, Name = "Tanvi", Age = 24 });
            empList.Add(new Employee2 { EmpNo = 33, Name = "Kajal", Age = 23 });

            //Convert list to array
            Employee2[] empArr = empList.ToArray();

            //Print the emp array
            Console.WriteLine("Array of Employees :   ");
            Console.WriteLine("-------------------------");
            for (int i = 0; i < empArr.Length; i++)
            {
                Console.WriteLine("EmpNo: {0}, Name: {1}, Age: {2}", empArr[i].EmpNo, empArr[i].Name, empArr[i].Age);
            }
        }
    }
    class Employee2
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public int Age { get; set; }
    }
}
