namespace ActionFuncPredicate
{
    internal class Program
    {
        //Action - for methods without return type
        static void Main1(string[] args)
        {
            Action o1 = Display;
            o1();

            Action<string> o2 = Display;
            o2("aaa");

            Action<string, int> o3 = Display;
            o3("bbb", 1);

        }
        //Func -  for methods having some return type
        static void Main(string[] args)
        {
            Func<string> o1 = GetCurrentTime;
            Console.WriteLine(o1());

            Func<int, int> o2 = GetDouble;
            Console.WriteLine(o2(10));

            Func<int, int, int> o3 = Add;
            Console.WriteLine(o3(10, 20));

            Func<int, bool> o4 = IsEven;
            Console.WriteLine(o4(20));


            //predicate - for functions with single parameter and return type = bool
            Predicate<int> o5 = IsEven; ;
            Console.WriteLine(o5(20));

        }

        static void Display()
        {
            Console.WriteLine("Display");
        }
        static void Display(string s)
        {
            Console.WriteLine("Display" + s);
        }
        static void Display(string s, int i)
        {
            Console.WriteLine("Display" + s + i);
        }

        static string GetCurrentTime()
        {
            return System.DateTime.Now.ToLongTimeString();
        }
        static int GetDouble(int a)
        {
            return a * 2;
        }
        static int Add(int a, int b)
        {
            return a + b;
        }
        static bool IsEven(int a)
        {
            if (a % 2 == 0)
                return true;
            else
                return false;
        }
    }
}