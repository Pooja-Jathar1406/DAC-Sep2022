using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LanguageFeaturesDemo
{
    internal class AnonymousClass
    {
        static void Main2(string[] args)
        {
            var o1 = new { Id = 10, Name = "AAA", IsRetired = false };
            var o2 = new { Id = 20, Name = "BBB"  };
        
            Console.WriteLine(o1.Id);
            Console.WriteLine(o1.GetType());
            Console.WriteLine(o2.GetType());
        }
    } 
}
