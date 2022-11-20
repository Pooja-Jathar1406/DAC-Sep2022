//*******  LCQ_P2
import java.util.Scanner;
class LCQ_P2{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:"); 
		for(int i=1;i<=(num*2)+3; i++){
			System.out.print("*");
	    }System.out.println();  
		for(int i=num;i>1;i--)//rows
	  { 
  			for(int j=num;j>=i;j--)  //space
		  {
				System.out.print(" ");
			 }  
			System.out.print("*");
			for(int j=3;j<=i;j++)  //*
		  {
				System.out.print("  ");
			} 
			if(i>=2)
            System.out.print("*");			
 			System.out.println();  
		}
		 
	}
}