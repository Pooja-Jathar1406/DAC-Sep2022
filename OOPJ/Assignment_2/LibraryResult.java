/*Assignement 2, Q.1
1. Implement a class for a Book. Book contains a title (a String), 
a list of authors (array of authors), number of pages (an integer), 
price (floating point number), publisher (a String) etc. 
Write suitable constructor and accessor/modifier methods. 
Implement a class for Library. A library contains a list of books (array of Book).
Write add (to add a book) and remove (to delete a book) methods for library. 
Write a main() function to create a  Library and add five Book to library. 
Print the total price of all books.
*/
 
import java.util.Scanner;
class Book{
	String title;
    String author[];
    int pages;
    float price;
    String publisher; 
	
	Book(){}
	Book(String title, String author[],int pages,float price, String publisher){
		this.title=title;
		this.author=author;
		this.pages=pages;
		this.price=price;
		this.publisher=publisher;
	}
	
}
class LibraryResult{
	int n;
	int count=0;
	Book[] arr;
	
	LibraryResult(){}
	LibraryResult(int n){
		this.n=n;
		arr=new Book[n];
	}
	
	void add(int id, String title,String[] author, double price, int page){
		 for(int i=0;i<book1.length;i++){	
	        if(book1[i]==null){	
				System.out.println("Enter the title-");
				String t=sc.nextLine();
			
				System.out.println("Enter the publication's name-");
				String pub=sc.nextLine();
			
				String au[]=new String[2];
				for(int j=0;j<2;j++){
					System.out.println("Enter the author-");
					au[j]=sc.nextLine();}
			
					System.out.println("Enter no of pages-");
					int p=sc.nextInt();
			
					System.out.println("Enter the price-");
					float pri=sc.nextFloat();
					sc.nextLine();
			        book1[i]= new Book(t,au,p,pri,pub);
		        }   
            }
	    }
	
	void remove(){
		System.out.println("Enter the title of book to be deleted:");
		String name=sc.nextLine();
		for(int i=0;i<book1.length;i++){
        	
			if(book1[i].title==name)
			{
				book1[i]=null;
			}
		}	
	}
	void show(){
		double totalPrice=0;
		 for(int i=0;i<book1.length;i++)
		 {
			System.out.println("-------------Book Details--------------");
	        System.out.println("Title of Book: "+book1[i].title);
			for(String s:book1[i].author){
				System.out.println(":-"+	s);
			}
			System.out.println("Pages="+book1[i].pages);
			System.out.println("Price="+book1[i].price);
		    totalPrice=totalPrice+book1[i].price;
			System.out.println("Publisher="+book1[i].publisher);
	    }
		System.out.println("Total Price of books="+totalPrice);
		System.out.println();
	}
	
	public static void main(String[]args){
        
	Scanner sc= new Scanner(System.in);
	
		System.out.println("1.Add Books \n2. Show Books\n3.Delete Book\n4.Leave");
		int choice=sc.nextInt();
		
		LibraryResult lb= new LibraryResult();
		 lb.add(); 
		 lb.show();
		 lb.delete();
	}
}	


 