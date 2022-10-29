import java.util.Scanner;
class P14{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:");
		for(int i=num;i>=1;i--)
	  {
			for(int j=1;j<=i;j++)
		  {
				System.out.print(j+" ");
			 }  
			System.out.println();  

		 }
	}
}

/*O/P:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/