import java.util.Scanner;

public class Book extends Product {
    protected String author;
    protected String BookType;
    protected String publishDate;

    public Book() {
    }

    public Book(String name, int code, double price, String author, String BookType, String publishDate) {
        super(name, code, price);
        this.author = author;
        this.BookType = BookType;
        this.publishDate = publishDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookType(String BookType) {
        this.BookType = BookType;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public void Array_of_product(int[] arr) {
        Scanner input = new Scanner(System.in);
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.println("ENTER Product Price  No : " + (i + 1));
            arr[i] = input.nextInt();
        }
    }

    @Override
    public void displayably(int[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("THE SUM OF PRODUCT IS : " + sum);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Author Name Is : " + this.author + "\n" + " Type Of Book Is : " + this.BookType + "\n"
                + " Publish Date : " + this.publishDate);
    }

}
