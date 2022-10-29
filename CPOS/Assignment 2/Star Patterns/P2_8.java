import jaa.util.Scanner;
class P2_8{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:"); 
		for(int i=1;i<=num-1;i++)//rows for 1st triangle
	  {  
			for(int j=1;j<=i;j++)//cols for 1st triangle
		  {
				System.out.print("* ");
			 }
 			System.out.println();  
	    }
	    for(int i=num;i>=1;i--)  //rows for 2nd triangle
	  {  
			for(int j=1;j<=i;j++)//cols for 2nd triangle
		  {
				System.out.print("* ");   
			 }  
 			System.out.println();  
		 }
	}
}

//Expected O/p:
/*if num=5:
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*

*/