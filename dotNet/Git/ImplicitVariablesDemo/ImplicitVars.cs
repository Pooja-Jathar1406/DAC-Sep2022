namespace LanguageFeaturesDemo
{
    internal class ImplicitVars
    {
        static void Main1(string[] args)
        {
            //regular method
            //int i = 0;

            //using implicit vars
            var i = 10;

            Console.WriteLine(i);
            Console.WriteLine(i.GetType());

        }
    }
}