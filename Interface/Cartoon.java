public class Cartoon extends Book {
    String item;

    public Cartoon() {
    }

    public Cartoon(String prod_name, int prod_code, double price, String item) {
        super(prod_name, prod_code, price);
        this.item = item;

    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public void displayably(int[] arr, String item) {
        super.displayably(arr, item);
        System.out.println("The Item IS : " + this.item);
    }

}