import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Book_37 {
    String title, author,genre;
    Book_37(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

        void msg() {
            System.out.println(title);
            System.out.println(author);
            System.out.println(genre);
        }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Title of the book: ");
        String title = obj.nextLine();
        System.out.println("Author: ");
        String author = obj.nextLine();
        System.out.println("Genre: ");
        String genre = obj.nextLine();

        System.out.println("Details of the book:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}
