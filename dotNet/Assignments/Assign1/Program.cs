using Assignment1;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

//Create a Class Employee with the following specifications


//Properties
//----------
//string Name -> no blank names should be allowed
//int EmpNo -> must be greater than 0
//decimal Basic -> must be between some range
//short DeptNo -> must be > 0

//Methods
//-------
//decimal GetNetSalary() -> returns calculated net salary (Use any formula to get net salary based on Basic salary)


//Create constructors to accept initial values for Employee obj
//eg
//Employee o1 = new Employee(1, "Amol", 123465, 10);
//Employee o2 = new Employee(1, "Amol", 123465);
//Employee o3 = new Employee(1, "Amol");
//Employee o4 = new Employee(1);
//Employee o5 = new Employee();


namespace Assignment1
{

    internal class Emp
    {
        static void Main()
        {
            Employee1 o1 = new Employee1(1, "Amol", 123465, 10);
            Employee1 o2 = new Employee1(1, "Amol", 123465);
            Employee1 o3 = new Employee1(1, "Amol");
            Employee1 o4 = new Employee1(1);
            Employee1 o5 = new Employee1();


             display(o1);
            display(o2);
            display(o3);
            display(o4);
            display(o5);
        }
        public static void display(Employee1 e) { 
            Console.WriteLine(e.Name +" "+ e.EmpNo+" " + e.Basic+" " +e.DeptNo); 
        }

    }
    public class Employee1
    {
        private String name;
        private int empNo;
        private decimal basic;
        private int deptNo;

        public Employee1(int EmpNo = 111, String Name = "Noname", decimal Basic = 1000, int DeptNo = 1)
        {
            this.EmpNo= EmpNo;
            this.Name= Name;
            this.Basic= Basic;
            this.DeptNo= DeptNo;
        }

        public int EmpNo
        {
            set
            {
                if (value < 0)
                {
                    Console.WriteLine("Emp no cannot be less than 0");
                }
                else
                {
                    empNo = value;
                }
            }
            get
            {
                return empNo;
            }
        }
        public string Name
        {
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    Console.WriteLine("Name cannot be empty");
                }
                else
                {
                    name = value;
                }
            }
            get
            {
                return name;
            }
        }
       
        public decimal Basic
        {
            set
            {
                if (basic < 0 || basic > 100000)
                {
                    Console.WriteLine("Enter valid basic salary");
                }
                else
                {
                    basic = value;
                }
            }
            get
            {
                return basic;
            }
        }
        public int DeptNo
        {
            set
            {
                if (value < 0)
                {
                    Console.WriteLine("dept cannot be empty");
                }
                else
                {
                    deptNo = value;
                }
            }
            get
            {
                return deptNo;
            }

        }
        public decimal GetNetSalary()
        {
            decimal netSalary = basic * 0.5m;
            return netSalary;
        }
    }
}







