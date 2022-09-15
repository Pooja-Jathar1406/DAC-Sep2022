import java.util.Scanner;
class P2_2{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:"); 
		for(int i=1;i<=num;i++)//rows
	  { 
  			for(int j=num-1;j>=i;j--)//space at start
		  {
				System.out.print(" ");
			 }  
			for(int j=i;j>=1;j--)  // *
		  {
				System.out.print("*");
			 }  
 			System.out.println();  
		 }
	}
}

//O/p:
/*if num=5:
     *
    **
   ***
  ****
 *****
*/

