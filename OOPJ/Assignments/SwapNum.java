import java.util.*;
class SwapNum{
	public static void main(String args[]){
		System.out.println("Enter two numbers: ");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		System.out.println("Before Swapping n1= "+n1+" and n2= "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After Swapping n1= "+n1+" and n2= "+n2);
		
	}
}