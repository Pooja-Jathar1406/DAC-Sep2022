import java.util.Scanner;
class P13{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:");
		
		char a=65;    //using ASCII value to print A
		for(int i=1;i<=num;i++)
	  {
		   for(int j=num-1;j>=i;j--)//space at start
		  {
				System.out.print(" ");
			 }  
			for(int j=1;j<=i;j++)
		  {
				System.out.print(a+" ");

			 }  
			 a++;//resetting a value to 65 as we need to start it from A in every row
			System.out.println();  

		 }
	}
}

/*O/P:
    A
   B B
  C C C
 D D D D
E E E E E
*/