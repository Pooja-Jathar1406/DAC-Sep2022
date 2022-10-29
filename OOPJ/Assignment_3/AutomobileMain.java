/*
//Assignement 3, Q.4
4. Create a base class Automobile. An Automobile contains data members make, type, maxSpeed,
price, mileage, registrationNumber etc. with their reader/writer methods. Now create two sub-classes
Track and Car. Track has data members capacity, hoodType, noOfWheels etc. Car has data
members noOfDoors, seatingCapacity and their reader/writer methods. Create a main() function to
demonstrate this.
*/

class Automobile {
	private String make, type,registrationNumber;
	private double maxspeed,price,mileage;
	
	public Automobile(String make, String type, String registrationNumber, double maxspeed, double price,
			double mileage) {
		this.make = make;
		this.type = type;
		this.registrationNumber = registrationNumber;
		this.maxspeed = maxspeed;
		this.price = price;
		this.mileage = mileage;
	}

	public String getMake() {
		return make;
	}

	public String getType() {
		return type;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public double getMaxspeed() {
		return maxspeed;
	}

	public double getPrice() {
		return price;
	}

	public double getMileage() {
		return mileage;
	}
}
class Truck extends Automobile {
	private int capacity,noOfWheels;
	private String hoodType;
	
	public Truck(String make, String type, String registrationNumber, double maxspeed, double price, double mileage,
			int capacity, int noOfWheels, String hoodType) {
		super(make, type, registrationNumber, maxspeed, price, mileage);
		this.capacity = capacity;
		this.noOfWheels = noOfWheels;
		this.hoodType = hoodType;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public String getHoodType() {
		return hoodType;
	}
	void printTruck() {
		System.out.println("Maker : "+getMake());
		System.out.println("Type : "+getType());
		System.out.println("Registration Nummber : "+getRegistrationNumber());
		System.out.println("Capacity : "+getCapacity()+"tons");
		System.out.println("No Of Wheels : "+getNoOfWheels());
		System.out.println("Hood Type : "+getHoodType());
		System.out.println("Mileage : "+getMileage()+"kmpl");
		System.out.println("Max Speed : "+getMaxspeed()+"kmph");
		System.out.println("Price : "+getPrice()+"lac.");
		System.out.println("-------------------------------------------------------------");
	}
}
class Car extends Automobile {
	private int noOfDoors, seatingCapacity;

	public Car(String make, String type, String registrationNumber, double maxspeed, double price, double mileage,
			int noOfDoors, int seatingCapacity) {
		super(make, type, registrationNumber, maxspeed, price, mileage);
		this.noOfDoors = noOfDoors;
		this.seatingCapacity = seatingCapacity;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}
 
	void printCar() {
		System.out.println("Maker : "+getMake());
		System.out.println("Type : "+getType());
		System.out.println("Registration Nummber : "+getRegistrationNumber());
		System.out.println("Seating Capacity : "+getSeatingCapacity());
		System.out.println("No Of Doors : "+getNoOfDoors());
		System.out.println("Mileage : "+getMileage()+"kmpl");
		System.out.println("Max Speed : "+getMaxspeed()+"kmph");
		System.out.println("Price : "+getPrice()+"lac.");
		System.out.println("-------------------------------------------------------------");
	}
}
public class AutomobileMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck t1 = new Truck("TESLA","Electric","ZZX198237456",80.5,220.6,349,50,12,"type1");
		t1.printTruck();
		Car c1 = new Car("Pagani","SuperCar", "ILP000009",235.7,398.7,12.6,2,2);
		c1.printCar();
		
	}

}
