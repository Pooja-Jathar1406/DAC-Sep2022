import java.util.Scanner;
class P16{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:"); 
		for(int i=num;i>=1;i--)//rows
	  { 
  			
			for(int j=num;j>=i;j--)  // *
		  {
				System.out.print(j+" ");
			 }  
 			System.out.println();  
		 }
	}
}

// O/p:
/*if num=5:
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/

