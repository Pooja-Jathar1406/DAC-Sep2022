//*******  LCQ_P18
import java.util.Scanner;
class LCQ_P18{
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
/*
o/p:
7
7 6
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1
*/