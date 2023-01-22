namespace ConstructorAndObjectInitializers
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Class1 obj = new Class1();
            obj.P1 = 10;
            obj.P2 = 20;
            obj.P3 = 30;


            //Object initializer
            Class1 o1 = new Class1() { P1 = 10, P2 = 20, P3 = 30 };
            //Another way of writing object initializer
            Class1 o2 = new Class1{ P1 = 10, P2 = 20, P3 = 30 };

            //parameterized constructr
            Class1 o3 = new Class1(1, 2, 3);
        }
    }

    public class Class1
    {
        public int P1 { get; set; }
        public int P2 { get; set; }
        public int P3 { get; set; }

        public Class1(int P1 = 10, int P2 = 20, int P3 = 30)
        {
            this.P1 = P1;
            this.P2 = P2;
            this.P3 = P3;
        }
    }
}