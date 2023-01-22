namespace TasksDemo

{
    internal class Program
    {
        static void Main1()
        {
            Task t1 = new Task(Func1);
            t1.Start();
            Console.ReadLine();   //to hold the line
        }
        static void Func1() {
            Console.WriteLine("Func1  ");
        }
    }
}

//calling a method with void return type using taskobj.start
namespace TasksDemo2
{
    internal class Program
    {
        static void Main3()
        {
            Task t1 = new Task(Func1);

            //this  is also similar to above line , just another way
            Action objAction2 = Func2;
            Task t2 = new Task(objAction2);

            t1.Start();
            t2.Start();
            Console.ReadLine();   //to hold the line
        }
        static void Func1()
        {
            for (int i = 0; i < 1000; i++) {
                Console.WriteLine("First Function called from {0}, {1} " , Thread.CurrentThread.ManagedThreadId, i);
            } 
        }
        static void Func2()
        {
            for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine("Second Function called from {0}, {1} ", Thread.CurrentThread.ManagedThreadId, i);
            }
        }
    }
}


//calling a method with void return type using Task.Run and Task.Factory.StartNew
namespace TasksDemo3
{
    internal class Program
    {
        static void Main()
        {
            //creating and starting at the same time
            Task t1 = Task.Run(Func1);
            Task t2 = Task.Factory.StartNew(Func2);

            Console.ReadLine();   //to hold the line
        }
        static void Func1()
        {
            for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine("First Function called from {0}, {1} ", Thread.CurrentThread.ManagedThreadId, i);
            }
        }
        static void Func2()
        {
            for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine("Second Function called from {0}, {1} ", Thread.CurrentThread.ManagedThreadId, i);
            }
        }
    }
}
