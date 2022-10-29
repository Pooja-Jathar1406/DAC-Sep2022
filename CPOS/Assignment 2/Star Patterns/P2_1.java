import java.util.Scanner;
class P2_1{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:");
		for(int i=1;i<=num;i++)
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

*
**
***
****
*****
*/