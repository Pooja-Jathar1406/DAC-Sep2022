class Student{
	//--------Data members-------
	    int roll;
		String name,div,location;
		double marks,chmarks;
		 
	//-------Member Functions-------	
		void printDetails( int roll, String name, double marks){
			System.out.println("Details of Student are: ");
			System.out.println("Roll no: "+roll);
			System.out.println("Name: "+name);
			System.out.println("Marks: "+marks);
		}
		void changeMarks(double chmarks){
			marks=marks+chmarks;
			System.out.println("Changed marks are : "+marks);
		}
		void addDetails(String div,String location){
			System.out.println("Newly added details are: ");
			System.out.println("Division: "+div);
			System.out.println("Location of student : "+location);
		}
		
	public static void main(String args[]){
		Student S1=new Student();
		S1.printDetails(002, "Pooja", 78.7);
		S1.changeMarks(82);
		S1.addDetails("A","Ahmednagar");
	}
}