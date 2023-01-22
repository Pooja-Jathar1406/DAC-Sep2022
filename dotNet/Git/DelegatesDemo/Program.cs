namespace DelegatesDemo
{
    //step1; create a delegate class having the same sign as the fun to be called
    public delegate void Del1();
    public delegate int Del2(int a, int b);
    internal class Program
    {
        static void Main1(string[] args)
        {
            //step 2: create a object of delegate class and pass function to all (function name ) as a parameter
            Del1 objDel = new Del1(Display);

            //step3: call the function via the delegate reference
            objDel();
        }

        //another simpler way for delegates and =+ , -=
        static void Main2(string[] args)
        {
            Del1 objDel = Display;
            objDel();

            Console.WriteLine();
            objDel += Show;
            objDel();

            Console.WriteLine();
            objDel += Display;
            objDel();

            //Console.WriteLine();
            //objDel -= Show;
            //objDel();

            Console.WriteLine();
            objDel -= Display; 
            objDel();

        }

        //using inbult methods
        static void Main3() {

            Del1 objDel=(Del1)Delegate.Combine(new Del1(Display), new Del1(Show), new Del1(Display));
            objDel();

            Console.WriteLine();
            objDel = (Del1)Delegate.Remove(objDel, new Del1(Display));
            objDel();

            Console.WriteLine();
            objDel = (Del1)Delegate.RemoveAll(objDel, new Del1(Display));
            objDel();


        }


        //delegates for parameterised functions
        static void Main4() {

            Del2 objDel2 = Add;
            int ans = objDel2(1,2);
            Console.WriteLine(ans);

            Console.WriteLine(objDel2(10,30));
        }

        //delegates for static function of another class
        static void Main() {

            Del1 objDel3 = Class1.Display1;
            objDel3();

            Class1 obj = new Class1();
            objDel3 = obj.Show1;
            objDel3();

            Class1 obj2 = new Class1();
            Del2 objDel4 = obj2.Add1; 
            Console.WriteLine(objDel4(10, 30));
            
            objDel4 = obj2.Subtract1;
            Console.WriteLine(objDel4(40, 30));
        }

        static void Display() {
            Console.WriteLine("Display function inside Program class is called.");
        }

        static void Show()
        {
            Console.WriteLine("Show function inside Program class is called.");
        }

        static int  Add(int a, int b)
        {
            return a + b;
        }

    }
    public class Class1
    { 
        public static void Display1()
        {
            Console.WriteLine("Display1 function of class1");
        }
        
        public void Show1()
        {
            Console.WriteLine("Show1 function of class1");
        }

        public int Add1(int a, int b)
        {
            return a + b;
        }
        public int Subtract1(int a, int b)
        {
            return a - b;
        }
    }
}