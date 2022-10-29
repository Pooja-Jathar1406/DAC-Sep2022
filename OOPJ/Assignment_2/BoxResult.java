/* Assignment 2, Q.6
6. Write a class “Box” that with three member-variables “height”, “width” and “breadth”. Write suitable
constructors to initialize them. Add functions like “getVolume” and “getArea” that will return volume and surface
area respectively. Instantiate two arbitrary boxes and then print their volume and surface area.
*/

class Box {
	double height;
	double width;
	double breadth;
	
	//*********** Constructors ************
	Box (){}
	Box(double height,double width,double breadth)
	{
		this.height=height;
	    this.width= width;
	    this.breadth=breadth;	
	}
	
	//*********** method for Volume ************
	double getVolume(){
		double volume=height*breadth*width;
		System.out.println("Volume of Box :  "+volume);
		return volume ;
		
	}
	
	//*********** Method for area ************
	double getArea()
	{
		double area=2*(breadth*width+height*breadth+width*height);
		System.out.println("Area of Box : "+area);
		return area ;
	}	
}

public class BoxResult
{
	public static void main (String args[])
	{
		Box b1=new Box(30.0,23.6,59.2);
		b1.getVolume();
		b1.getArea();
		
		Box b2=new Box(40.2,50.22,79.8);
		b2.getVolume();
		b2.getArea();

	}	
}