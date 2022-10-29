/*Assignment 2 Q.5
5. Write a program to implement a class student with the following members. Name of the student. Marks of the
student obtained in three subjects. Function to assign initial values. Function to compute total average. Function to
display the students name and the total marks. Write an appropriate main() function to demonstrate the functioning
of the above.
*/

class Student{
	String name;
	double math, english, science, avg, total;
	Student(){}
    Student(String name,double math,double english,double science){
        this.name=name;
        this.math=math;
        this.english=english;
        this.science=science;
    }
    
	//******************** Method to calculate Average **************
    void average(){
        total=(math+english+science);
        avg=(total/3);
    }
	//******************** Method to display Result **************
    void displayResult(){
		System.out.println("Name of student : "+name);
        System.out.println("Average marks: "+avg);
        System.out.println("Total marks : "+total);
    }
}
class StudentResult{
    public static void main(String args[]){
  
        Student stud1=new Student("Pooja",75.0,85.0,79.3);
       // stud1.assignInitialValues();
        stud1.average();
        stud1.displayResult();
    }
}