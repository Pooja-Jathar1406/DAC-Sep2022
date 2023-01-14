using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace Assign4
{
    internal class Question2
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Employee Details!!!");
            Console.WriteLine("---------------------------");

            Console.WriteLine("Enter no of employees ");
            int noOfEmp = int.Parse(Console.ReadLine());

            Employee[] empArr = new Employee[noOfEmp];


            /*--------- Enter employee details ---------*/
            for (int i = 0; i < empArr.Length; i++)
            {
                Console.WriteLine("Enter details for Employee " + (i + 1) + ":");

                Console.WriteLine("Enter EmpNo: ");
                int empNo = int.Parse(Console.ReadLine());

                Console.WriteLine("Enter Name: ");
                string name = Console.ReadLine();

                Console.WriteLine("Enter Salary: ");
                int salary = int.Parse(Console.ReadLine());

                empArr[i] = new Employee(empNo, name, salary);
            }
            Console.WriteLine();

            Console.WriteLine("Details of all employees!!!1");
            Console.WriteLine("-----------------");
            foreach (Employee emp in empArr)
            {
                Console.Write(emp.EmpNo + " ");
                Console.Write(emp.Name + " ");
                Console.Write(emp.Salary + " ");
                Console.WriteLine("----------------- ");
            }

            /*--------- Employee with highest salary ---------*/
            int highestSal = empArr[0].Salary;
            int highestSalIndex = 0;

            for (int i = 1; i < empArr.Length; i++)
            {
                if (empArr[i].Salary > highestSal)
                    highestSal = empArr[i].Salary;
                highestSalIndex = i;
            }
            Console.WriteLine();
            Console.Write("Highest salary : "+highestSal);

            Console.WriteLine();

            Console.WriteLine("------- Details of Employee with Highest Salary ---------");
            Console.WriteLine($"Employee {highestSalIndex + 1}: Id: " + empArr[highestSalIndex].EmpNo + " Name : " + empArr[highestSalIndex].Name + " Salary :" + empArr[highestSalIndex].Salary);


            /*--------- Search employee ---------*/

            Console.WriteLine();
            Console.WriteLine("Enter EmpNo to search the employee: ");
            int empNoTosearch = int.Parse(Console.ReadLine());
            for (int i = 1; i < empArr.Length; i++)
            {
                if (empArr[i].EmpNo == empNoTosearch)
                {
                    Console.WriteLine($"Employee {i + 1}: Id: " + empArr[i].EmpNo + " Name : " + empArr[i].Name + " Salary :" + empArr[i].Salary);
                }

            }
        }

        public class Employee
        {
            public int EmpNo { get; set; }
            public string Name { get; set; }
            public int Salary { get; set; }
            public Employee(int empNo, string name, int salary)
            {
                EmpNo = empNo;
                Name = name;
                Salary = salary;
            }
        }
    }
}
