import java.util.*;

class Marks{
	double avg,per;
	
	//-------------method to calculate area-----------
	double Average(double m1,double m2, double m3,double m4,double m5){
			avg=(m1+m2+m3+m4+m5)/5;
			System.out.println("Average marks= "+avg);
			return 1;
		}
		
	//-------------method to calculate Perimeter-----------
	double Percentage(double m1,double m2, double m3,double m4,double m5){
			per=((m1+m2+m3+m4+m5)*100)/500;
			System.out.println("Percentage  = "+per+"%");
			return 1;
		}
		
	public static void main(String args[]){
		//-----take radius of circle------
		System.out.println("Enter the radius of circle : ");
		Scanner sc=new Scanner(System.in);
		double s1 =sc.nextFloat();
		double s2 =sc.nextFloat();
		double s3 =sc.nextFloat();
		double s4 =sc.nextFloat();
		double s5 =sc.nextFloat();
		double s6 =sc.nextFloat();
		
		Marks c1= new Marks();
		c1.Average(s1,s2,s3,s4,s5);               //calling area mehod
		c1.Percentage(s1,s2,s3,s4,s5);       //calling perimeter method
		
	}
}