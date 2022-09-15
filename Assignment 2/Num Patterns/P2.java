import java.util.Scanner;
class P2{
	public static void main(String args[]){
		System.out.println("Enter  no of rows for generating triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:");
		
		char a=65;    //using ASCII value to print A
		for(int i=1;i<=num;i++)
	  {
			for(int j=1;j<=i;j++)
		  {
				System.out.print(a+" ");
				a++;
			 }  
			 a=65;   //resetting a value to 65 as we need to start it from A in every row
			System.out.println();  

		 }
	}
}

/*O/P:

A
A B
A B C
A B C D
A B C D E
*/