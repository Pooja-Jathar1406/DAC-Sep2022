import java.util.Scanner;
class P2_16{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:"); 
		for(int i=1;i<num;i++)//rows
	  { 
  			for(int j=num-1;j>=i;j--)  //space
		  {
				System.out.print(" ");
			 }  
			System.out.print("*");
			for(int j=3;j<=i;j++)  //*
		  {
				System.out.print(" ");
			} 
			if(i>=2)
            System.out.print("*");			
 			System.out.println();  
		 }
		 for(int i=1;i<=num;i++){
			System.out.print("*");
		 }
	}
}

//O/p:
/*if num=5:
      *
    **
   * *
  *  *
*****
*/

