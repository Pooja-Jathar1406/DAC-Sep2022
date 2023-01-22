using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;

namespace LanguageFeaturesDemo
{
    internal class ExtenionMethods
    {
        static void Main(string[] args)
        {
            int i = 100;
            i.Display();

            i = i.Add(10);
            Console.WriteLine(i.ToString());

            string s = "abcd";
            s.Show();
        }
    }
     public static class Class2 {
        //step1 1 : create a static method in a static class
        //step 2 : the first parameter of the extension method must 
        //be the type for which u r creating the ext method preceded by 'this' keyword  

        public static void Display(this int i) {
            Console.WriteLine(i);
        }

        public static void Show(this String s)
        {
            Console.WriteLine(s);
        }

        public static int Add(this int i, int j)
        {
            return i + j;
        }
    }
}
