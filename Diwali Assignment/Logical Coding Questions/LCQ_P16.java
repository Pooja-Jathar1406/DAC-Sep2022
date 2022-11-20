//*******  LCQ_P16
import java.util.Scanner;
class LCQ_P16{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:");
		 
		for(int i=1;i<=num;i++) 
	  { 
  			for(int j=4*num-1;j>=i;j--)
		  {
				System.out.print(" ");
			 }  
			for(int j=i;j>=1;j--)  
		  {
				System.out.print("* ");
			 }  
 			System.out.println();  
		 }
		for(int i=3;i<=num+2;i++) 
	  { 
  			for(int j=4*num-1;j>=i;j--)
		  {
				System.out.print(" ");
			 }  
			for(int j=i;j>=1;j--)  
		  {
				System.out.print("* ");
			}  
 			System.out.println();  
		}
		for(int i=5;i<=num+4;i++) 
	  { 
  			for(int j=4*num-1;j>=i;j--)
		  {
				System.out.print(" ");
			}  
			for(int j=i;j>=1;j--)  
		  {
				System.out.print("* ");
			}  
 			System.out.println();  
		}
		for(int i=7;i<=num+6;i++) 
	  { 
  			for(int j=4*num-1;j>=i;j--)
		  {
				System.out.print(" ");
			}  
			for(int j=i;j>=1;j--)  
		  {
				System.out.print("* ");
			}  
 			System.out.println();  
		}
		for(int i=9;i<=num+8;i++) 
	  { 
  			for(int j=4*num-1;j>=i;j--)
		  {
				System.out.print(" ");
			}  
			for(int j=i;j>=1;j--)  
		  {
				System.out.print("* ");
			}  
 			System.out.println();  
		}
		for(int i=1;i<=num;i++) 
	  { 
  			for(int j=21;j<=7*num;j++)
		  {
				System.out.print(" ");
			}  
			for(int j=1;j<=num;j++)  
		  {
				System.out.print("* ");
			}  
 			System.out.println();  
		}
	}
}

/*
o/p:
                   *
                  * *
                 * * *
                * * * *
               * * * * *
                 * * *
                * * * *
               * * * * *
              * * * * * *
             * * * * * * *
               * * * * *
              * * * * * *
             * * * * * * *
            * * * * * * * *
           * * * * * * * * *
             * * * * * * *
            * * * * * * * *
           * * * * * * * * *
          * * * * * * * * * *
         * * * * * * * * * * *
           * * * * * * * * *
          * * * * * * * * * *
         * * * * * * * * * * *
        * * * * * * * * * * * *
       * * * * * * * * * * * * *
               * * * * *
               * * * * *
               * * * * *
               * * * * *
               * * * * *
*/