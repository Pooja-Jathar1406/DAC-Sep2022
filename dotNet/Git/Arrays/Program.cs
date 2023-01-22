namespace Arrays
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            int[] arr = new int[5];
            int[] arr2 = { 10, 20, 30, 40, 50 };
            int[] arr3 = new int[] { 1, 2, 3 };

            //print arary 
            for (int i = 0; i < arr2.Length; i++)
            {

                //Console.WriteLine("Element at index  : " + i.ToString() + " is :");

                //placeholder
                //Console.WriteLine("Element at index  {0} " + i  );

                //string interpolation
                Console.WriteLine($"Element at index  {i} ");

                Console.WriteLine(arr2[i]);
            }
            Console.WriteLine("-----------------");

            //print using for eac
            foreach (int item in arr2)
            {
                Console.WriteLine($"Array2 element is {item}");
            }
            Console.WriteLine("-----------------");

            //Array methods
            Array.Clear(arr3);   //claers the array

            //int pos = Array.IndexOf(arr2,20);
            int pos = Array.LastIndexOf(arr2, 20);
            Console.WriteLine("Position of 20 : " + pos);

            int pos1 = Array.BinarySearch(arr2, 30);
            Console.WriteLine("Binary search for 30 : " + pos1);


            Console.WriteLine();
            foreach (int item in arr3)
            {
                Console.WriteLine($"Array3 element is {item}");
            }
            Console.WriteLine();
        }

        static void Main(string[] args)
        {
            Employee[] arr = new Employee[5];

        }

        public class Employee
        {
            public int EmpNo { get; set; }
            public string Name { get; set; }

        }
    }
}