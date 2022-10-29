import java.util.Scanner;
class P18{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:"); 
		char a=65;
		for(int i=1;i<=num;i++)//rows
	  { 
  			
			for(int j=num;j>=i;j--)  // *
		  {
				System.out.print(a+" ");
				a++;
			 }  
			 for(int j=1;j<=i;j++)//space at start
		  {
				System.out.print(" ");
			 }  
			 a=65;
 			System.out.println();  
		 }
	}
}

// O/p:
/*if num=5:
A B C D E
A B C D
A B C
A B
A
*/

