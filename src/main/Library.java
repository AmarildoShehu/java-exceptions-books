package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addBooks(int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <n; i++) {
            try {
                System.out.println("Inserisci il titolo");
                String title = scanner.nextLine();

                System.out.println("Insersci numero di pagine");
                int numeberOfPages = Integer.parseInt(scanner.nextLine());

                System.out.println("Inserisci L'autore");
                String author = scanner.nextLine();

                System.out.println("Inserisci pubbicazione ");
                String publisher = scanner.nextLine();
                Book book = new Book(title, numeberOfPages, author, publisher);
                addBook(book);
            } catch (IllegalAccessError e) {
                System.out.println("Errore: " + e.getMessage());
                i--;

            }
        }
    }

}
