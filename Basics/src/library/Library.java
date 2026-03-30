package library;

public class Library {
	     String name;
	     Book[] books;
	     int bookCount;
	     
	    public Library(String name) {
	        this.name = name;
	        this.books = new Book[20];
	        this.bookCount = 0;
	    }
		
	    public void addBook(Book b) {
	        if (bookCount < books.length) {
	            books[bookCount++] = b;
	            System.out.println("Book added: " + b.getTitle());
	        } else {
	            System.out.println("Library is full!");
	        }
	    }

	    public Book findByTitle(String title) {
	        for (int i = 0; i < bookCount; i++) {
	            if (books[i].getTitle().equalsIgnoreCase(title)) {
	                return books[i];
	            }
	        }
	        System.out.println("Not found");
	        return null;
	    }

	    public void findByAuthor(String author) {
	        boolean found = false;
	        for (int i = 0; i < bookCount; i++) {
	            if (books[i].getAuthor().equalsIgnoreCase(author)) {
	                books[i].displayInfo();
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No books found by this author.");
	        }
	    }

	    public void issueBook(String title) {
	        Book b = findByTitle(title);
	        if (b != null) {
	            if (!b.isIssued()) {
	                b.markIssued();
	            } else {
	                System.out.println("Book already issued.");
	            }
	        }
	    }

	    public void returnBook(String title) {
	        Book b = findByTitle(title);
	        if (b != null) {
	            if (b.isIssued()) {
	                b.markReturned();
	            } else {
	                System.out.println("Book was not issued.");
	            }
	        }
	    }

	    public void displayAllBooks() {
	        System.out.println("\n--- Library Books ---");
	        for (int i = 0; i < bookCount; i++) {
	            books[i].displayInfo();
	        }
	    }


	    public int countAvailable() {
	        int count = 0;
	        for (int i = 0; i < bookCount; i++) {
	            if (!books[i].isIssued()) {
	                count++;
	            }
	        }
	        return count;
	    }
	}


