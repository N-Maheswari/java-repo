package library;

public class Book {
	     String title;
	     String author;
	     String isbn;
	     String genre;
	     boolean isIssued;

	  
	    public Book(String title, String author, String isbn, String genre) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	        this.genre = genre;
	        this.isIssued = false;
	    }

	   
	    public void markIssued() {
	        if (!isIssued) {
	            isIssued = true;
	            System.out.println(title + " has been issued.");
	        } else {
	            System.out.println(title + " is already issued.");
	        }
	    }

	   
	    public void markReturned() {
	        if (isIssued) {
	            isIssued = false;
	            System.out.println(title + " has been returned.");
	        } else {
	            System.out.println(title + " was not issued.");
	        }
	    }

	    public void displayInfo() {
	        System.out.println("Title  : " + title);
	        System.out.println("Author : " + author);
	        System.out.println("ISBN   : " + isbn);
	        System.out.println("Genre  : " + genre);
	        System.out.println("Status : " + (isIssued ? "Issued" : "Available"));
	        System.out.println("--------------------------");
	    }


	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public boolean isIssued() {
	        return isIssued;
	    }
	}


