package week1.day2;

public class LibraryManagement {

	// create and use objects to call methods from a different class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To access library method, create object for library class
		Library lib = new Library();
		String addBook = lib.addBook("selenium book");
		System.out.println("added book is " + addBook);
		lib.issueBook();
		
	}

}
