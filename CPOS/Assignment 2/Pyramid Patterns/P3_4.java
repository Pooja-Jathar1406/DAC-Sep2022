import java.util.Scanner;
class P3_4{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:"); 
		for(int i=1;i<=num;i++)//rows
	  { 
  			for(int j=i;j<=num;j++)//space at start
		  {
				System.out.print("  ");
			 }  
			for(int j=1;j<i;j++)  
		  {
				System.out.print(j+" ");
			 }
			for(int j=i-2;j>=1;j--)  
		  {
				System.out.print(j+" ");  
			 }  
 			System.out.println();  
		 }
	}
}

//O/p:
/*if num=5:
                         1
                      1 2 1
                   1 2 3 2 1
                1 2 3 4 3 2 1
             1 2 3 4 5 4 3 2 1
          1 2 3 4 5 6 5 4 3 2 1
       1 2 3 4 5 6 7 6 5 4 3 2 1
     1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/

