using System;

namespace ThreadingDemo
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Thread t1 = new Thread(new ThreadStart(Func1));
            Thread t2= new Thread(new ThreadStart(Func2));

            t1.Start();
            t2.Start();

            for (int i = 0; i < 10; i++) { 
                Console.WriteLine("Main "+i);
            }
            Console.WriteLine();
        }

        //Make the thread as background thread
        static void Main2(string[] args)
        {
            Thread t1 = new Thread(new ThreadStart(Func1));
            Thread t2 = new Thread(new ThreadStart(Func2));

            t1.IsBackground= true; //main does not wait for this thread to complete
            t2.IsBackground= true;

            t1.Start();
            t2.Start();

            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("Main " + i);
            }
            Console.WriteLine();
        }

        //Priority
        static void Main3(string[] args)
        {
            Thread t1 = new Thread(new ThreadStart(Func1));
            Thread t2 = new Thread(new ThreadStart(Func2));

            t1.Priority = ThreadPriority.Highest;
            t2.Priority = ThreadPriority.Lowest; 

            t1.Start();
            t2.Start();

            for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine("Main " + i);
            }
            Console.WriteLine();
        }

        //join
        static void Main4(string[] args)
        {
            Thread t1 = new Thread(new ThreadStart(Func1));
            Thread t2 = new Thread(new ThreadStart(Func2));

            t1.Priority = ThreadPriority.Highest;
            t2.Priority = ThreadPriority.Lowest;

            t1.Start();
            t2.Start();

            for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine("Main " + i);
            }
            t1.Join(); //main will wait till T2 completes
            Console.WriteLine("Running after T1-------");
        }

        //ThreadState
        static void Main5(string[] args)
        {
            Thread t1 = new Thread(new ThreadStart(Func1));
            Thread t2 = new Thread(Func2);

            t1.Priority = ThreadPriority.Highest;
            t2.Priority = ThreadPriority.Lowest;

            t1.Start();
            t2.Start();

            for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine("Main " + i);
            }
            Console.WriteLine();
        }
        static void Func1()
        {
            for (int i = 0; i<1000; i++){ 
                Console.WriteLine("First "+i);
            }
        }

        static void Func2()
        {
            for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine("Second " + i);
            }
        }
    }
}

// Parameterized threadStart
namespace ThreadingDemo2
{
    internal class Program
    {
        static void Main6(string[] args)
        {
            Thread t1 = new Thread(new ParameterizedThreadStart(Func1));
            Thread t2 = new Thread(Func2); 

            t1.Start("AAA");
            t2.Start("BBB");

            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("Main " + i);
            }
            Console.WriteLine();
        }
        static void Func1(object obj)
        {
            for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine("First " + i +" "+ obj.ToString());
            }
        }

        static void Func2(object obj)
        {
            for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine("Second " + i +" " + obj.ToString());
            }
        }

    }

}

//Threadpool
namespace ThreadingDemo3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ThreadPool.QueueUserWorkItem(PoolFunc1, "AAA");
            ThreadPool.QueueUserWorkItem(new WaitCallback(PoolFunc2));

            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("Main " + i.ToString() );
            }
            Console.WriteLine();
        }
        static void PoolFunc1(object obj)
        {
            for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine("First " + i + " " + i.ToString());
            }
        }

        static void PoolFunc2(object obj)
        {
            for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine("Second " + i + " " + obj.ToString());
            }
        }

    }

}

