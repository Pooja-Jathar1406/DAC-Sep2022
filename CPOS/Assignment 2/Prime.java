import java.util.Scanner;

class Prime{
	public static void main(String args[]){
        System.out.println("Enter Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a ,c=0;
		for(a=1;a<=num;a++){
			if(num%a==0){
			   c++;
			}
		}
		if(c==2)
			System.out.println("Given no. is a prime number!");
		else
			System.out.println("Given no. is not a prime number!");
	}
}