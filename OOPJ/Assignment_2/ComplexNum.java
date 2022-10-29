/*Assignement 2, Q.3
Q3. Write a class to represent complex numbers with necessary constructors. 
Write member functions to add, multiply two complex numbers. 
There should be three constructors: (i) to initialize real and imaginary parts to 0; 
(ii) to initialize imaginary part to 0 but to initialize the real part to user defined value; 
(iii) to initialize the real part and the imaginary part to user defined values. 
Also, write a main() function to (i) create two complex numbers 3+2i and 4-2i; 
(ii) to print the sum and product of those numbers.
*/

class ComplexNum{
	float real,imaginary;
	//***************************  Constructors  ************************
	ComplexNum(){
		real=0;
		imaginary=0;
	}
	ComplexNum(float real ){
		this.real=real;
		imaginary=0;
	}
	ComplexNum(float real, float imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	
	//***************************  add complex numbers  ************************
	public ComplexNum add(ComplexNum cn){
		ComplexNum temp=new ComplexNum();
        temp.real =real + cn.real;
        temp.imaginary =imaginary+ cn.imaginary;
        return temp;
	}
	
	//***************************   multiply complex numbers   ************************
	public ComplexNum multiply(ComplexNum cn){
		ComplexNum temp=new ComplexNum();
        temp.real =real * cn.real;
        temp.imaginary =imaginary* cn.imaginary;
        return temp;
	}
	
	//***************************   print method   ************************
	public void print() {
         System.out.println(real+ " + i"+imaginary);
    }
	
	//***************************   main   ************************
	public static void main(String[] args) {
		ComplexNum cn1= new ComplexNum(2, 4);
		ComplexNum cn2= new ComplexNum(15,-3);
		
		ComplexNum cn3= cn1.add(cn2);
		System.out.print("Sum of the Complex Numbers : ");
        cn3.print();

        ComplexNum cn4 = cn1.multiply(cn2);
        System.out.print("Product of the Complex Numbers : ");
        cn3.print();
		
	}
}