import java.util.Scanner;

class SimpleInterest{

	public static void main(String args[]){
		System.out.println("Enter Principle amount, Rate of interest and Time: ");
		Scanner sc=new Scanner(System.in);
		double p=sc.nextDouble();
		double r=sc.nextDouble();
		double n=sc.nextDouble(); 
		
		double s= (p*r*n)/100;
		System.out.println("The Simple interest for given data is : Rs. "+s);
	}
}