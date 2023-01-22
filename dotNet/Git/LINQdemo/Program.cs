
//------------ Query syntax ----------
namespace LINQdemo
{
    internal class Program
    {
        static List<Employee> lstEmp = new List<Employee>();
        static List<Department> lstDept = new List<Department>();
        private static IEnumerable<string> emps;

        static void AddRecs() {
            lstDept.Add(new Department { DeptNo = 10, DeptName = "Sales" }) ;
            lstDept.Add(new Department { DeptNo = 20, DeptName = "Mktg" }) ;
            lstDept.Add(new Department { DeptNo = 30, DeptName = "It" }) ;
            lstDept.Add(new Department { DeptNo = 40, DeptName = "HR" }) ;

            lstEmp.Add(new Employee { EmpNo=1, Name="Vikram", Basic =90000, DeptNo=10, Gender="M"});
            lstEmp.Add(new Employee { EmpNo=2, Name="Vikas", Basic =44000, DeptNo=10, Gender="M"});
            lstEmp.Add(new Employee { EmpNo=3, Name="Abhijit", Basic =55000, DeptNo=20, Gender="M"});
            lstEmp.Add(new Employee { EmpNo=4, Name="Mona", Basic =33000, DeptNo=20, Gender="F"});
            lstEmp.Add(new Employee { EmpNo=5, Name="Shweta", Basic =32000, DeptNo=20, Gender="F"});
            lstEmp.Add(new Employee { EmpNo=6, Name="Sanjay", Basic =52000, DeptNo=30, Gender="M"});
            lstEmp.Add(new Employee { EmpNo=7, Name="Arpan", Basic =100000, DeptNo=30, Gender="M"});
            lstEmp.Add(new Employee { EmpNo=8, Name="Pooja", Basic =78000, DeptNo=40, Gender="F"});
            lstEmp.Add(new Employee { EmpNo=9, Name="Shraddha", Basic =98900, DeptNo=40, Gender="F"});
        }

        //select whole object
         
        static void Main1(string[] args)
        {
            AddRecs();
            //LINQ queries
            //select whole object ----------------------------

            //var returnvalue = from single_object in collection select something;
            var emps = from emp in lstEmp select emp;
            //now emps contains the IEnumerable of employees , we can  loop thr it

            Console.WriteLine("Details of employees !! ");
            foreach (var emp in emps) { 
                Console.WriteLine(emp.EmpNo + " " + emp.Name + " " + emp.Basic + " " + emp.DeptNo + " " + emp.Gender);
            }
        }
         

        //select single properties
        static void Main2(string[] args)
        {
            AddRecs();
            //LINQ queries//select single properties 

            //var returnvalue = from single_object in collection select something;
            var emps = from emp in lstEmp select emp.Name;
            //now emps contains the IEnumerable of names , we can  loop thr it

            Console.WriteLine("Names of employees !! ");
            foreach (var emp in emps)
            {
                Console.WriteLine(emp);
            }
        }


        //select combination of properties- Anonymous type
        static void Main3(string[] args)
        {
            AddRecs();
            //LINQ queries
            //select combination of properties- Anonymous type-------------------

            //var returnvalue = from single_object in collection select something;
            var emps = from emp in lstEmp select new { emp.Name, emp.EmpNo };
            //now emps contains the IEnumerable of anonymous type , we can  loop thr it

            Console.WriteLine("Names of employees !! ");
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.EmpNo);
                Console.WriteLine(emp.Name);
                Console.WriteLine(emp.EmpNo+ " , " +emp.Name);
            }
        }

        //where---------
        static void Main4(string[] args)
        {
            AddRecs();
            var emps = from emp in lstEmp
                       where emp.Basic > 70000
                       select emp;
            Console.WriteLine("Details of employees with Basic>70000 !! ");
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.EmpNo + " " + emp.Name + " " + emp.Basic + " " + emp.DeptNo + " " + emp.Gender);
            }
        }

        //&& and || operators, starts with ...  ---------
        static void Main5(string[] args)
        {
            AddRecs();
            /*
            var emps = from emp in lstEmp
                       where emp.Basic > 70000 && emp.Basic <90000
                       select emp;
            Console.WriteLine("Details of employees with Basic between 70000 and 90000 !! ");
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.EmpNo + " " + emp.Name + " " + emp.Basic + " " + emp.DeptNo + " " + emp.Gender);
            }
            */

            /*
            var emps = from emp in lstEmp
                       where emp.DeptNo == 10 || emp.DeptNo == 30
                       select emp;
            Console.WriteLine("Details of employees with dept no = 10 or 40 !! ");
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.EmpNo + " " + emp.Name + " " + emp.Basic + " " + emp.DeptNo + " " + emp.Gender);
            }
            */

            //StartsWith 
            var emps = from emp in lstEmp
                       where emp.Name.StartsWith("V")
                       select emp;
            Console.WriteLine("Details of employees name starting with V !! ");
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.EmpNo + " " + emp.Name + " " + emp.Basic + " " + emp.DeptNo + " " + emp.Gender);
            }
             
        }
    }

    public class Employee {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
        public string Gender { get; set; }

        public override string ToString(){
            string s= Name+" , "+ EmpNo.ToString()+ " , "+Basic.ToString()+" , "+DeptNo+" , "+Gender.ToString() ;
            return s ;
        }
    }

    public class Department {
        public int DeptNo { get; set; }
        public string DeptName { get; set; }
    }
}


//------------ Shoter syntax - lambda syntax ----------
namespace LINQdemo2
{
    internal class Program
    {
        static List<Employee> lstEmp = new List<Employee>();
        static List<Department> lstDept = new List<Department>();
        private static IEnumerable<string> emps;

        static void AddRecs()
        {
            lstDept.Add(new Department { DeptNo = 10, DeptName = "Sales" });
            lstDept.Add(new Department { DeptNo = 20, DeptName = "Mktg" });
            lstDept.Add(new Department { DeptNo = 30, DeptName = "It" });
            lstDept.Add(new Department { DeptNo = 40, DeptName = "HR" });

            lstEmp.Add(new Employee { EmpNo = 1, Name = "Vikram", Basic = 90000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 2, Name = "Vikas", Basic = 44000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 3, Name = "Abhijit", Basic = 55000, DeptNo = 20, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 4, Name = "Mona", Basic = 33000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 5, Name = "Shweta", Basic = 32000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 6, Name = "Sanjay", Basic = 52000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 7, Name = "Arpan", Basic = 100000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 8, Name = "Pooja", Basic = 78000, DeptNo = 40, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 9, Name = "Shraddha", Basic = 98900, DeptNo = 40, Gender = "F" });
        }


        static Employee GetEmp1(Employee obj) {
            return obj;
        }
        static String  GetEmp2(Employee obj)
        {
            return obj.Name;
        }

        static Boolean IsBasicGreaterThan50000(Employee obj)
        {
            return obj.Basic > 50000;
        }
        //select whole object
        static void Main(string[] args)
        {
            AddRecs(); 
            
            //using query syntax
            //var emps = from emp in lstEmp select emp;
            
            //using function
            var emps1 =lstEmp.Select(GetEmp1);

            var emps2 = lstEmp.Select(GetEmp2);

            //anonymous method
            var emps3 = lstEmp.Select(delegate (Employee obj)
            {
                return obj;
            });

            //using lambda
            var emps4 = lstEmp.Select(obj => obj);

            var emps5 = lstEmp.Select(obj => obj.Name);

            var emps6 = lstEmp.Select(obj => new { obj.Name, obj.EmpNo });


            //where
            var emp7 = lstEmp.Where(IsBasicGreaterThan50000);

            //where using lambda
            var emp8 = lstEmp.Where(emp => emp.Basic > 50000);

            //order by
            var emps9 = lstEmp.OrderBy(emp => emp.DeptNo).ThenByDescending(emp => emp.Name);

            //-----------------------------------
            //--- joins 
            var emps10 = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => emp);
            var emps11 = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => dept);
            var emps12 = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => new { emp , dept });
            var emps13 = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => new { emp.Name, emp.DeptNo});

            Console.WriteLine("Details of employees !! ");
            foreach (var emp in emps9)
            {
                Console.WriteLine(emp.EmpNo + " " + emp.Name + " " + emp.Basic + " " + emp.DeptNo + " " + emp.Gender);
            }

            //-----------------------------------
            //--- group by
            Console.WriteLine("Group by ----------------- ");

            var emps14 = from emp in lstEmp
                         group emp by emp.DeptNo;

            foreach (var item in emps14) {

                Console.WriteLine(item.Key);

                foreach (var e in item) {
                    Console.WriteLine(e);
                }
                Console.WriteLine();
            }
            Console.WriteLine();

            var emps15 = from emp in lstEmp
                         group emp by emp.DeptNo into group1
                         select new { group1, Count = group1.Count(), Max = group1.Max(x => x.Basic), Min = group1.Min(x => x.Basic) };
            
            foreach (var emp in emps15) {
                Console.WriteLine("DeptNo : "+emp.group1.Key);  //DeptNo
                Console.WriteLine("Count : " + emp.Count);  //count
                Console.WriteLine("Min : " + emp.Min);   //Min
                Console.WriteLine("Max : " + emp.Max);    //Max
                Console.WriteLine();

                foreach (var e in emp.group1) { //e is an Employee
                    Console.WriteLine(e);
                }
                Console.WriteLine();
            }
        }

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
            string s = Name + " , " + EmpNo.ToString() + " , " + Basic.ToString() + " , " + DeptNo + " , " + Gender.ToString();
            return s;
        }
    }

    public class Department
    {
        public int DeptNo { get; set; }
        public string DeptName { get; set; }
    }
}