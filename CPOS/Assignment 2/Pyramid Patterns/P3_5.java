import java.util.Scanner;
class P3_5{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:"); 
		for(int i=num;i>1;i--)//rows
	  { 
  			for(int j=2;j<i;j++)//space at start
		  {
				System.out.print("  ");
			 }  
			for(int j=i-1;j<=num-1;j++)  // *
		  {
				System.out.print(j+" ");
			 }
		    for(int j=num-2;j>=i-1;j--)  // *
		  {
				System.out.print(j+" ");
			 }
			 
 			System.out.println();  
		 }
	}
}

//O/p:
/*if num=5:
                        9
                     8 9 8
                  7 8 9 8 7
               6 7 8 9 8 7 6
            5 6 7 8 9 8 7 6 5
         4 5 6 7 8 9 8 7 6 5 4
      3 4 5 6 7 8 9 8 7 6 5 4 3
   2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/

