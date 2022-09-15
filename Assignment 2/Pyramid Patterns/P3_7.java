import java.util.Scanner;
class P3_7{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:");
		
        for(int i=num;i>=1;i--)//rows
	  { 
  			for(int j=num-1;j>=i;j--)
		  {
				System.out.print(" ");
			 }    
			for(int j=1;j<=i;j++)  // *
		  {
				System.out.print(i+" ");
			 }  
 			System.out.println();  
		 }
	}
}

/*O/P:
* * * * * * * * *
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *
*/