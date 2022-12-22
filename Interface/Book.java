import java.util.Scanner;

public class Book implements Product {
    String prod_name;
    int prod_code;
    double price;

    public Book(String prod_name, int prod_code, double price) {
        this.prod_name = prod_name;
        this.prod_code = prod_code;
        this.price = price;
    }

    public Book() {
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public void setProd_code(int prod_code) {
        this.prod_code = prod_code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void display() {
        System.out.println("Product Name Is : " + this.prod_name + " Product Code Is : " + this.prod_code
                + " Price Is : " + this.price);
    }

    @Override
    public void Array_of_product(int[] arr, String item) {
        Scanner input = new Scanner(System.in);
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.println("ENTER Product Price  No : " + (i + 1));
            arr[i] = input.nextInt();
        }
    }

    @Override
    public void displayably(int[] arr, String item) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The Sum Of Product is : " + sum);
    }

}
