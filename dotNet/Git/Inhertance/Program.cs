﻿ 
namespace InheritanceExamples
{
    class Program
    {
        static void Main1()
        {
            //DerivedClass o = new DerivedClass();
            DerivedClass o2 = new DerivedClass(123, 456);
            Console.ReadLine();
        }
    }
    public class BaseClass
    {
        public int i;
        public BaseClass()
        {
            Console.WriteLine("base class no param cons");
            i = 10;
        }
        public BaseClass(int i)
        {
            Console.WriteLine("base class int cons");
            this.i = i;
        }
    }
    public class DerivedClass : BaseClass
    {
        public int j;
        public DerivedClass()
        {
            Console.WriteLine("derived class no param cons");
            //i = 10;
            j = 20;
        }
        public DerivedClass(int i, int j) : base(i)
        {
            Console.WriteLine("derived class int,int cons");
            //this.i = i;
            this.j = j;
        }
    }
}


namespace InheritanceExamples3
{
    internal class Program
    {
        static void Main1()
        {
            DerivedClass objDerived = new DerivedClass();
            //objDerived.Display1(); //base
            //objDerived.Display1("aaaa"); //derived

            objDerived.Display2();
            objDerived.Display3();
        }
        static void Main2()
        {
            BaseClass obj;

            obj = new BaseClass();
            obj.Display2();  //non virtual, early bound - depends on reference  
            obj.Display3(); //virtual, late bound - depends on object


            Console.WriteLine();
            obj = new DerivedClass();
            obj.Display2();  //non virtual, early bound - depends on reference  
            obj.Display3(); //virtual, late bound - depends on object

            Console.WriteLine();
            obj = new SubDerivedClass();
            obj.Display2();  //non virtual, early bound - depends on reference  
            obj.Display3(); //virtual, late bound - depends on object

            Console.WriteLine();
            obj = new SubSubDerivedClass();
            obj.Display2();  //non virtual, early bound - depends on reference  
            obj.Display3();

        }
    }
    public class BaseClass
    {
        public void Display1()
        {
            Console.WriteLine("base display1");
        }
        public void Display2()
        {
            Console.WriteLine("base display2");
        }
        public virtual void Display3()
        {
            Console.WriteLine("base display3");
        }
    }
    public class DerivedClass : BaseClass
    {
        public void Display1(string s) //overloading
        {
            Console.WriteLine("derived display1...." + s);
        }
        public new void Display2()  //hiding
        {
            Console.WriteLine("derived display2");
        }
        public override void Display3() //overriding
        {
            Console.WriteLine("derived display3");
        }
    }
    public class SubDerivedClass : DerivedClass
    {
        public sealed override void Display3()
        {
            Console.WriteLine("subderived display3");
        }
    }
    public class SubSubDerivedClass : SubDerivedClass
    {
        public new void Display3()
        {
            Console.WriteLine("subsubderived display3");
        }
    }

} 


//abstract class
namespace InheritanceExamples5
{
    class Program
    {
        static void Main()
        {
            //AbstractBaseClass1 o = new AbstractBaseClass1();  //error
            Console.ReadLine();
        }
    }
    public abstract class AbstractBaseClass1
    {
        public void Display()
        {
            Console.WriteLine("Display");
        }
    }
    public class DerivedClass : AbstractBaseClass1
    {

    }
    public abstract class AbstractBaseClass2
    {
        public void Display()
        {
            Console.WriteLine("Display");
        }
        public abstract void Display2();
        public abstract void Display3();
    }
    public class Derived2 : AbstractBaseClass2
    {
        public override void Display2()
        {
            Console.WriteLine("d2");
        }
        public override void Display3()
        {
            Console.WriteLine("d3");
        }
    }
    public abstract class Derived3 : AbstractBaseClass2
    {

    }

}