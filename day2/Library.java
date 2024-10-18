package week1.day2;
//create a Java class with methods
public class Library {
	
	//define method addBook implement methods with parameter
	public String addBook(String bookTitle) {
		// TODO Auto-generated method stub
		System.out.println("Book added successfully");
		//return values from methods
		return bookTitle;
	}
	
	//define method issueBook and implement methods without parameter
	public void issueBook() {
		// TODO Auto-generated method stub
		System.out.println("Book issued successfully");
		
	}
	
		
		
	//to create and use objects to call methods within the same class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To access library method, create object for library class
		
		Library lib = new Library();
		String addBook = lib.addBook("java book");
		System.out.println("added book is " + addBook);
		lib.issueBook();
			

	}

}
