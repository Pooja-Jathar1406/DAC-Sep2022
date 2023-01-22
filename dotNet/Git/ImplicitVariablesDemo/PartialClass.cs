using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LanguageFeaturesDemo
{
    public partial class Class1 {
        public int i;
    }
    public partial class Class1
    {
        public int j;
    }
    internal class PartialClass
    {
        static void Main3(string[] args)
        {
            Class1 o1= new Class1();
            o1.i = 1;
            Class1 o2= new Class1();
            o2.i = 2;
        }
    }
}
