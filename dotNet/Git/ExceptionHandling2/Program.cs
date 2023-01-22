using System.Runtime.CompilerServices;

namespace ExceptionHandling2
{
    internal class Program
    {
        /*
        static void Main(string[] args)
        {
            Class1 objClass1 = new Class1();
            objClass1.InvalidP1 += objClass1_InvalidP1;
            //+= idicates if there are already defined other event handlers are present then add this event otherwise =

            objClass1.P1= 1000;
        }
        static void objClass1_InvalidP1() {
            Console.WriteLine("Event Handling code");
        }
        */

        // the above code can be written in more easier way as
        static void Main() { 
            Class1 obj = new Class1();
            obj.InvalidP1 += Obj_InvalidP1;
        }

        private static void Obj_InvalidP1()
        {
            Console.WriteLine("Event handled here");
        }
    }
    //step 1: create a delegate class having the same signature as the event handler
    public delegate void InvalidP1EventHandler();

    public class Class1 {

        //step2: create a delegate object (event)
        public event InvalidP1EventHandler InvalidP1; 
        //here the word event is required just to show that this is not normal delegate obj , it is for event

        private int p1;
        public int P1 
        {
            get{
                return p1;
            }
            set {
                if (value < 100)
                {
                    p1 = value;
                }
                else {
                    //step 3 : raise the event - call the delegat object
                    InvalidP1();
                }
            }
        }
    }
    //public class InvalidP1Exception : ApplicationException {
    //    public InvalidP1Exception(string message) : base(message){ 

    //    }  
    //}
}