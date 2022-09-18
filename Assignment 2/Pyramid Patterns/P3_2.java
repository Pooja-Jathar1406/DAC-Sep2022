import java.util.Scanner;
class P3_2{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:"); 
		for(int i=1;i<=num;i++)//rows
	  { 
  			for(int j=i;j<=num;j++)//space at start
		  {
				System.out.print(" ");
			 }  
			for(int j=1;j<=i;j++)  // *
		  {
				System.out.print(j+" ");
			 }  
 			System.out.println();  
		 }
	}
}

// O/p:
/*if num=5:
            1
          1 2
         1 2 3
        1 2 3 4
      1 2 3 4 5
     1 2 3 4 5 6
    1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
*/

