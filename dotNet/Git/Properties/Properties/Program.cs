namespace Properties
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Class1 o = new Class1();
            o.P1  = 1000;  //set will be called
            Console.WriteLine(o.P1); //get will be called
        }
    }

    public class Class1 {
        private int p1;  // varaible for property
        public int P1
        {
            set 
            {
                if (value < 100)  //value will depend upon the type of property(int here , line 18)
                {
                    p1 = value;
                }
                else {
                    Console.WriteLine("invalid value");
                }
            }
            get 
            {
                return p1;
            }
        }

        //Automatic property
        //no validations
        //compiler generates the code for get/set
        //compiler generates a variable
        public String P5 { get; set }
    }
}
