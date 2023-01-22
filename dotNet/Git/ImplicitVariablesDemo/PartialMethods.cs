using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LanguageFeaturesDemo
{
    internal class PartialMethods
    {
        static void Main4(string[] args)
        {
            Class1 o = new Class1();
            Console.WriteLine(o.Check());
            Console.ReadLine();
        }
    }

    public partial class Class1 {
        private bool isValid = true;
        partial void Validate();
        public bool Check() {
            Validate();
            return isValid;
        }
    }
}
