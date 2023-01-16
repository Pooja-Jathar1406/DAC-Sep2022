using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assign5
{
    internal class Question1
    {
        static void Main(string[] args)
        {
            Dictionary<int, Employee> empDict = new Dictionary<int, Employee>();
            Boolean action = false;
            do
            {
                Employee emp = new Employee();

                //take details of employee 
                Console.Write("Enter EmpNo: ");
                emp.EmpNo = int.Parse(Console.ReadLine());

                Console.Write("Enter Name: ");
                emp.Name = Console.ReadLine();

                Console.Write("Enter Age: ");
                emp.Age = int.Parse(Console.ReadLine());

                Console.Write("Enter Salary: ");
                emp.Salary = int.Parse(Console.ReadLine());

                //add the employee to dict
                empDict.Add(emp.EmpNo, emp);

                Console.Write("If you want to add more employees then type true, otherwise false : ");
                action = Boolean.Parse(Console.ReadLine());

            } while (action);

            //print all employee details
            foreach (KeyValuePair<int, Employee> item in empDict)
            {
                Console.Write(item.Key + " "); //EmpNo 
                Console.Write(item.Value.Name + " ");  //Name
                Console.Write(item.Value.Age + " ");  //Age
                Console.Write(item.Value.Salary + " ");  //Salary

            }
            Console.WriteLine();
            Console.WriteLine("--------------------------------");
            Console.WriteLine();

            //search the employee
            Console.Write("Enter EmpNo of employee to be searched: ");
            int empNoToSearchEmp = int.Parse(Console.ReadLine());
            Employee empToSearch = empDict[empNoToSearchEmp];

            Console.WriteLine("Details of employee you are loking for :");
            Console.WriteLine("EmpNo: {0}, Name: {1}, Age: {2}, Salary: {3}", empToSearch.EmpNo, empToSearch.Name, empToSearch.Age, empToSearch.Salary);

            Console.WriteLine();
            Console.WriteLine("--------------------------------");
            Console.WriteLine();


            //employee with highest sal
            Employee[] empArray = empDict.Values.ToArray();
            
            decimal salary = 0;
            int index = 0;
            for (int i = 0; i < empArray.Length; i++)
            {
                if (empArray[i].Salary > salary)
                {
                    salary = empArray[i].Salary;
                    index = i;
                }
            }
            Console.WriteLine("------- Details of Employee with Highest Salary ---------");
            Console.WriteLine($"Employee {index + 1}: EmpNo: " + empArray[index].EmpNo + " Name : " + empArray[index].Name + " Age :" + empArray[index].Age + " Salary :" + empArray[index].Salary);
            Console.WriteLine();
            Console.WriteLine("--------------------------------");
        }
    }
    class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public int Age { get; set; }
        public int Salary { get; set; }
    }
}
