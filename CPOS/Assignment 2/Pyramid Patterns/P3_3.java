import java.util.Scanner;
class P3_3{
public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:"); 
		for(int i=1;i<=num;i++)//rows
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
	}
}

//Expected O/p:
/*if num=5:
        *
       ***
      *****
     *******
    *********
   ***********
  *************
 ***************
*****************
*/