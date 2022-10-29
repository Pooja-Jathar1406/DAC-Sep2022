/* 
//Assignement 3, Q.2
2. Write a class for "Account" containing data members 'accountNumber', 'holderName', 'balance' and add 
constructors and necessary accessor/modifier functions for these data members. Now create two class 
"SavingsAccount" and "CurrentAccount" extending from this class. SavingsAccount will have a member 
variable 'interestRate' and member function 'calculateYearlyInterest'. Write another class "Manager" that 
contains a list Account. Also write a main() function to create an instance of Manager class. Add two 
SavingsAccount and three CurrentAccount to Manager. Calculate interest of each SavingsAccount. Print 
the details of all accounts.
*/

abstract class Account{
	
	int accountNumber;
	String holderName;
	double balance;
	
	Account(){
		
	}
	
	Account(int accountNumber,String holderName,double balance){
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
	
	void printAccountDetails(){
		System.out.println("Account Number is: "+accountNumber);
		System.out.println("Account holder name is: "+holderName);
		System.out.println("Account balance is: "+balance);
		System.out.println("------------------------------------------------------------------ ");
	}
	
	abstract void calculateYearlyInterest();
}
class SavingsAccount extends Account{
	SavingsAccount(int accountNumber,String holderName,double balance){
		super(accountNumber,holderName,balance);
	}
	
	static double interest=4.5;
	
	void calculateYearlyInterest(){
		System.out.println("Account number is: "+accountNumber);
		System.out.println("Yearly interest of these saving Account  is: "+balance/100*interest);
		System.out.println("------------------------------------------------------------------");
	}
}
class CurrentAccount extends Account{
	static double interest=5.0;
	
	void calculateYearlyInterest(){
		System.out.println("Account number is: "+accountNumber);
		System.out.println("Yearly interest of these current Account is: "+balance/100*interest);
	}
	
	CurrentAccount(int accountNumber,String holderName,double balance){
		super(accountNumber,holderName,balance);
	}
}
class Manager{
	
	static int count=0;
	Account[] list;
	
	Manager(){
		list =new Account[5];
	}
	
	Manager(int n){
		list =new Account[n];
	}
	
	void addSaving(int accountNumber,String holderName,double balance){
		list[count++]=new SavingsAccount(accountNumber,holderName,balance);
	}
	
	void addCurrent(int accountNumber,String holderName,double balance){
		list[count++]=new CurrentAccount(accountNumber,holderName,balance);
	}
	
	void printAllAcountDetails(){
		for(Account a: list){
			a.printAccountDetails();
		}
	}
	
	void printAllAcountInterest(){
		for(Account a: list){
			a.calculateYearlyInterest();
		}
	}
	
}
public class  AccountMain{
	public static void main(String[] args){
		Manager m1=new Manager(5);

		m1.addSaving(213401,"Pooja Jathar",234567.50);
		m1.addSaving(213402,"Pragati Gaje",234457.);
		m1.addSaving(213403,"Diksha Ingale",233467);
		m1.addCurrent(213404,"Pallavi Mapari",23454.90);
		m1.addCurrent(213405,"Nikita Kamble",2723);
		m1.printAllAcountDetails();
		System.out.println("------------------------------------------------------------------");
		m1.printAllAcountInterest();	
	}
}
