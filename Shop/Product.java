
public abstract class Product {
    protected String name;
    protected int code;
    protected double price;

    public Product() {
    }

    public Product(String name, int code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public void setProd_name(String name) {
        this.name = name;
    }

    public void setProd_code(int code) {
        this.code = code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getCode() {
        return this.code;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Product Name Is : " + this.name + "\n" + " Product Code Is : " + this.code + "\n"
                + " Price Is : " + this.price);
    }

    public abstract void Array_of_product(int[] arr);

    public abstract void displayably(int[] arr);

}
