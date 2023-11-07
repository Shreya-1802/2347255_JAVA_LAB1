import java.util.*;
class Book {
    private String title;
    private String author;
    private int year;
    private String genre;
    public Book() {
        title = "";
        author = "";
        year = 0;
        genre = "";
    }
    public Book(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
    }
    public void updateBookInfo(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public void updateBookInfo(String title, String author, int year, String genre) {
        updateBookInfo(title, author, year);
        this.genre = genre;
    }
    public void updateBookInfo(String author) {
        this.author = author;
    }
	public static void main(String[] args) {
        ELibrary library = new ELibrary();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Drama");
        library.addBook(book1);
        library.addBook(book2);
        library.displayLibrary();
        book1.updateBookInfo("The Catcher in the Rye", "J.D. Salinger", 1951, "Coming-of-age");
        book2.updateBookInfo("Jane Eyre", "Charlotte Bronte", 1875);
        library.displayLibrary();
    }
}

class ELibrary {
    private ArrayList<Book> bookList;
    public ELibrary() {
        bookList = new ArrayList<>();
    }
    public void addBook(Book book) {
        bookList.add(book);
    }
    public void displayLibrary() {
        for (Book book : bookList) {
            book.displayBookInfo();
            System.out.println();
        }
    }
}