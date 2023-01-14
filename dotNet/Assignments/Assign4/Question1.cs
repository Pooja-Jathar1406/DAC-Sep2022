namespace Assign4
{
    internal class Question1
    {
        static void Main1(string[] args)
        {
            /* ------------------------ Question 1 -----------------------*/

            Console.WriteLine("Welcome to Cdac Mumbai !!!");
            Console.WriteLine("---------------------------");
            Console.WriteLine("Enter no of batches ");
            int batch = int.Parse(Console.ReadLine());

            int[][] arr = new int[batch][];

            for (int i = 0; i < arr.GetLength(0); i++)
            {

                Console.WriteLine($"Enter no students for Batch {i + 1}:");
                int s = int.Parse(Console.ReadLine());

                Student[] stud = new Student[s];
                for (int j = 0; j < stud.Length; j++)
                {
                    Console.WriteLine("Enter marks for student  {0}: ", j + 1);
                    int m = int.Parse(Console.ReadLine());

                    stud[j] = new Student();
                    stud[j].marks = m;
                }

                Console.WriteLine("Student marks of Batch {0}", i + 1);

                Console.WriteLine("Marks of Students : ");

                foreach (Student std in stud)
                {
                    Console.Write(std.marks + " ");
                }
                Console.WriteLine();

            }

        }
    }
    public class Student
    {
        public int marks;

    }

}