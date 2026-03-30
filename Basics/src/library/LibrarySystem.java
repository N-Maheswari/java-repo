/*Part 4: Object Arrays — Library System
Create a Book class: Include title, author, ISBN (String), genre, and isIssued (boolean). Include a constructor, displayInfo(), markIssued(), and markReturned().
Create a Library class: Include name, an array of Book objects (e.g., Book[] books with a maximum size of 20), and bookCount (int).
Library Methods:
addBook(Book b)
findByTitle(String title): Returns the Book object or prints "Not found".
findByAuthor(String author): Prints all matching books.
issueBook(String title): Marks the book as issued if it is available.
returnBook(String title)
displayAllBooks()
countAvailable()
Testing (in main): Create a Library. Add 6 books. Issue 2 books. Return 1 book. Search for a specific book. Finally, print all books along with their current issue status.
*/
package library;

public class LibrarySystem {

	public static void main(String[] args) {


		        Library lib = new Library("City Library");
		       
		        lib.addBook(new Book("JAVA", "James Gosling", "101", "Programming"));
		        lib.addBook(new Book("Python", "Guido van Rossum", "102", "Programming"));
		        lib.addBook(new Book("C++", "Bjarne Stroustrup", "103", "Programming"));
		        lib.addBook(new Book("Data Structures", "Mark Allen", "104", "CS"));
		        lib.addBook(new Book("Algorithms", "CLRS", "105", "CS"));
		        lib.addBook(new Book("Operating Systems", "Galvin", "106", "CS"));

		        lib.issueBook("Java");
		        lib.issueBook("Algorithms");

		        lib.returnBook("Java");
        
		        Book b = lib.findByTitle("Python");
		        if (b != null) {
		            b.displayInfo();
		        }
		       
		        lib.displayAllBooks();

		        System.out.println("Available books: " + lib.countAvailable());
		    }
}


	


