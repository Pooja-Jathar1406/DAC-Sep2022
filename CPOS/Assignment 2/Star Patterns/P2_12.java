import java.util.Scanner;
class P2_12{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:");
		for(int i=num;i>=1;i--)
	  {
			for(int j=1;j<=i;j++)
		  {
				System.out.print("*");
			 }  
			System.out.println();  
		 }
		 for(int i=2;i<=num;i++)
	  {
			for(int j=1;j<=i;j++)
		  {
				System.out.print("*");
			 }  
			System.out.println();  
		 }
	}
}

/*O/P:
*****
****
***
**
*
**
***
****
*****

*/