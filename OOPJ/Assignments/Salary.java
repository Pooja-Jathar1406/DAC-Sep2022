import java.util.*;
class Salary{
	public static void main(String args[]){
		System.out.println("Enter the basic salaray of employee: ");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		float hra,da,gs;
		
		if(b<10000){
			hra=(10*b)/100;
			da=(90*b)/100;
			gs=b+da+hra;
			System.out.println("Employees Gross salary is : Rs."+gs);
		}
		else if(b>=10000){
			hra=2000;
			da=(98*b)/100;
			gs=b+da+hra;
			System.out.println("Employees Gross salary is : Rs."+gs);
		}
	}
}