//*******  LCQ_P22
import java.util.Scanner;
class LCQ_P22{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:"); 
		for(int i=1;i<=num;i++)//rows
	  { 
  			for(int j=i;j<=num;j++)//space at start
		  {
				System.out.print("1");
			 }  
			for(int j=1;j<=i;j++)  // *
		  {
				System.out.print(i);
			 }  
 			System.out.println();  
		 }
	}
}
/*
o/p:
11111111
11111122
11111333
11114444
11155555
11666666
17777777
*/