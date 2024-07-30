package Library_Management_System;

public class LibraryLinearSearch {
    private Book[] books;
    private int size;

    public LibraryLinearSearch(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    public void addBook(Book book) {
        if (size == books.length) {
            System.out.println("Library is full. Cannot add more books.");
            return;
        }
        books[size++] = book;
    }

    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }
}
