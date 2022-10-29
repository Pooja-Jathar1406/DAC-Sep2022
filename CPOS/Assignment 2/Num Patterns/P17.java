import java.util.Scanner;
class P17{
public static void main(String args[]){
		System.out.println("Enter  no of rows for generating itriangle pattern:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Pattern is:");
		int c=0; 
		for(int i=1;i<=num;i++)
	  {
			for(int j=1;j<=i;j++)
		  {   
	            c++;    
				System.out.print(c+" "); 
			 }   
			System.out.println();   

		 }
	}
}

/*O/P:

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/