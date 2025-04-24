
//  Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, 
// and methods to add and remove books from a collection.
import java.util.ArrayList;

class Book {
    String title;
    String author;
    long ISBN;

    static ArrayList<Book> collectionBooks = new ArrayList<Book>();

    Book(String title, String author, long ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public static void addbook(Book book) {
        collectionBooks.add(book);
    }

    public static void removebook(Book book) {
        collectionBooks.remove(book);

    }

    public static ArrayList<Book> get_collectBooks() {
        return collectionBooks;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Book book1 = new Book("Romeo and Juliet", "William Shakespeare ", 97806717);
        Book book2 = new Book("Atomic Habit", "James Clear ", 978807555);
        Book book3 = new Book("Heart of Darkness", "Joseph Conrad", 978032501);

        

        Book.addbook(book1);
        Book.addbook(book2);
        Book.addbook(book3); 

        ArrayList<Book> bookcollection = Book.get_collectBooks();
        System.out.println("List of books:");
        
        for(Book book :bookcollection){      
        System.out.println(book.title + " written by " + book.author + " ISBN " + book.ISBN);
         
        } 
        System.out.println();
        System.out.println("Remove one book from the collection of books");
        Book.removebook(book1); 

        System.out.println("Now the collection of books are: "); 
        System.out.println();
        for(Book book :bookcollection){      
            System.out.println(book.title + " written by " + book.author + " ISBN " + book.ISBN);
             
            } 
    }
}
