package Library_Management_System;

import java.util.Arrays;

public class LibraryBinarySearch {
    private Book[] books;
    private int size;

    public LibraryBinarySearch(int capacity) {
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

    public void sortBooksByTitle() {
        Arrays.sort(books, 0, size, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    }

    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
