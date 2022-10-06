import java.util.*;

class Circle{
	double area,peri;
	
	//-------------method to calculate area-----------
	double area(double r1){
			area=3.14*r1*r1;
			System.out.println("Area of circle is : "+area);
			return 1;
		}
		
	//-------------method to calculate Perimeter-----------
	double perimeter(double r1){
			peri=2*3.14*r1;
			System.out.println("Perimeter of circle is : "+peri);
			return 1;
		}
		
	public static void main(String args[]){
		//-----take radius of circle------
		System.out.println("Enter the radius of circle : ");
		Scanner sc=new Scanner(System.in);
		double r =sc.nextFloat();
		
		Circle c1= new Circle();
		c1.area(r);               //calling area mehod
		c1.perimeter(r);       //calling perimeter method
		
	}
}
		