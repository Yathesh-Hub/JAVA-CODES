import java.util.Scanner;

class Book {

    private String title;
    private String author;
    private double price;
    private int Copies;

    public void getBookDetails() {
        Scanner a = new Scanner(System.in);
        
        System.out.print("Enter the title of the book: ");
        title = a.nextLine();
        
        System.out.print("Enter the author of the book: ");
        author = a.nextLine();
        
        System.out.print("Enter the price of the book: ");
        price = a.nextDouble();
        
        System.out.print("Enter the number of copies available: ");
        Copies = a.nextInt();
    }
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Number of Copies: " +Copies);
        System.out.println();
    }
}

public class bookstore{
    public static void main(String[] args) {
        Book[] books = new Book[3];

        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();
            System.out.println("Enter details for book " + (i + 1) + ":");
            books[i].getBookDetails();
            System.out.println();
        }

        System.out.println("Details of the books entered:");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + (i + 1) + ":");
            books[i].display();
        }
    }
}
