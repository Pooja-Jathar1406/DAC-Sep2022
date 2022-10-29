import java.util.Scanner;
class P15{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:"); 
		for(int i=1;i<=num;i++)//rows
	  { 
  			
			for(int j=num;j>=i;j--)  // *
		  {
				System.out.print(j+" ");
			 }  
			 for(int j=1;j<=i;j++)//space at start
		  {
				System.out.print(" ");
			 }  
 			System.out.println();  
		 }
	}
}

// O/p:
/*if num=5:
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/

