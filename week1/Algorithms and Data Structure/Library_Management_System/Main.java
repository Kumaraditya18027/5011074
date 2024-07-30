package Library_Management_System;

public class Main {
    public static void main(String[] args) {
        LibraryBinarySearch library = new LibraryBinarySearch(10);

        Book b1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        Book b2 = new Book("B002", "To Kill a Mockingbird", "Harper Lee");
        Book b3 = new Book("B003", "1984", "George Orwell");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println("Linear Search for '1984':");
        Book searchResult1 = library.linearSearchByTitle("1984");
        System.out.println(searchResult1 != null ? searchResult1 : "Book not found");

        library.sortBooksByTitle();

        System.out.println("\nBinary Search for '1984':");
        Book searchResult2 = library.binarySearchByTitle("1984");
        System.out.println(searchResult2 != null ? searchResult2 : "Book not found");
    }
}
