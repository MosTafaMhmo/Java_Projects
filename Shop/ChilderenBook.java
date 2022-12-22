
public class ChilderenBook extends Book {
    protected int no_of_book_part;

    public ChilderenBook(String name, int code, double price, String author, String Book_Typr,
            String publishDate, int no_of_book_part) {
        super(name, code, price, author, Book_Typr, publishDate);
        this.no_of_book_part = no_of_book_part;
    }

    public ChilderenBook() {
    }

    public void setNo_of_book_part(int no_of_book_part) {
        this.no_of_book_part = no_of_book_part;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("No Of Parts Of Book Is : " + this.no_of_book_part);
    }
}
