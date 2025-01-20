// LibrarySystem.java

// Placeholder code for Library Management System
import java.util.HashMap;
import java.util.Map;

public class LibrarySystem {
    static class Library {
        Map<String, Integer> books = new HashMap<>();

        public void addBook(String bookTitle, int quantity) {
            books.put(bookTitle, books.getOrDefault(bookTitle, 0) + quantity);
            System.out.println(quantity + " copies of '" + bookTitle + "' added.");
        }

        public void borrowBook(String bookTitle) {
            if (books.containsKey(bookTitle) && books.get(bookTitle) > 0) {
                books.put(bookTitle, books.get(bookTitle) - 1);
                System.out.println("'" + bookTitle + "' borrowed.");
            } else {
                System.out.println("'" + bookTitle + "' is not available.");
            }
        }

        public void returnBook(String bookTitle) {
            if (books.containsKey(bookTitle)) {
                books.put(bookTitle, books.get(bookTitle) + 1);
                System.out.println("'" + bookTitle + "' returned.");
            } else {
                System.out.println("'" + bookTitle + "' does not belong to this library.");
            }
        }

        public void displayBooks() {
            if (books.isEmpty()) {
                System.out.println("No books available.");
            } else {
                System.out.println("Books available in the library:");
                for (Map.Entry<String, Integer> entry : books.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue() + " copies");
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System!");
        Library library = new Library();
        library.addBook("Python Programming", 3);
        library.addBook("Data Structures", 5);
        library.borrowBook("Python Programming");
        library.displayBooks();
        library.returnBook("Python Programming");
        library.displayBooks();
    }
}
