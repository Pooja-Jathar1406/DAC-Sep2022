import java.util.Scanner;
class P2_7{
public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:"); 
		for(int i=1;i<=num;i++)//rows for 1st triangle
	  { 
  			for(int j=num-1;j>=i;j--)
		  {
				System.out.print(" ");
			 }  
			for(int j=i;j>=1;j--)  
		  {
				System.out.print("*");
			 }
			for(int j=1;j<=i-1;j++)  
		  {
				System.out.print("*");
			 }
            System.out.println();  			 
		 }
		 for(int i=num-1;i>=1;i--)  // rows for 2nd triangle
	  {
			for(int j=num-1;j>=i;j--)
		  {
				System.out.print(" ");
			 }  
			 for(int j=1;j<=i;j++){
				 System.out.print("*");
			 }
			 for(int j=1;j<i;j++)
		  {
				System.out.print("*");
			 }  
			System.out.println();  

		 }
	}
}

//Expected O/p:
/*if num=5:
      *
     ***
   *****
 *******
*********
 *******
  *****
   ***
    *
*/