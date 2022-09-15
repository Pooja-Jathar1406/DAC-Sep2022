import java.util.Scanner;
class P8{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:"); 
		int a=num;
		for(int i=num;i>=1;i--)
	  { 
  			for(int j=1;j<=i;j++) 
		  {
				System.out.print(" ");
				a--;
			 }  
			 a++;
			for(int j=i;j<num;j++)
		  {
				System.out.print(a+" ");
				a--;
			 }  
 			System.out.println();  
		 }
	}
}

// O/p:
/*if num=5:

*/

