/* Assignment 2, Q4
4. Create a class Room which will hold the height, width and breadth of the room in three fields. This class
also has a method volume() to calculate the volume of this room. Create another class RoomDemo which will
use the earlier class, create instances of rooms, and display the volume of room.
*/

import java.util.Scanner;
class Room{
	double height;
	double width;
	double breadth;
	
	//***************************  Display Volume  method ************************
	void DisplayVolume(){
	  double volume =height*width*breadth;
		System.out.println("Volume of room: "+volume);
	}
	
	//***************************  Method to accept dimensions ************************
	void AcceptTheDimention(){
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter the height of room");
         height=sc.nextDouble();
		 System.out.println("Enter the width of Room");
         width=sc.nextDouble();
		 System.out.println("Enter the breadth of Room");
         breadth=sc.nextDouble();
	}
}
public class RoomDemo{
	//****************  main methd  ****************
	public static void main (String args[]){
		Room r1= new Room();

		r1.AcceptTheDimention();
		r1.DisplayVolume();
	}
}