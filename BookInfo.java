import java.util.Scanner;
public class BookInfo {


    static void book() {
        Scanner sc = new Scanner(System.in);

        String author, title;
        int isbn, date;
        float price;


        System.out.println("Who is the author of your book?");
        author = sc.nextLine();

        System.out.println("What is the title of your book:");
        title = sc.nextLine();

        System.out.println("When the book was published?");
        date = sc.nextInt();

        System.out.println("What is the price of your book?");
        price = sc.nextInt();

        System.out.println("Details of the book:");
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Published Date: " + date);
        System.out.println("Price: " + price);


    }

    public static void main(String[] args) {
        book();
    }
}
