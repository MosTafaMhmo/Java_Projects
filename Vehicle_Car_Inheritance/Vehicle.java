public class Vehicle {
    private String make;
    private String color;
    private int ModelYear;

    public Vehicle() {
    }

    public Vehicle(String make, String color, int ModelYear) {
        this.make = make;
        this.color = color;
        this.ModelYear = ModelYear;
    }

    public void setMaker(String make) {
        this.make = make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelYear(int ModelYear) {
        this.ModelYear = ModelYear;
    }

    public void display() {
        System.out.println("The Vehicle Name Is : " + this.make + "\n" + " Vehicle Color Is : " + this.color + "\n"
                + " ModelYear : "
                + this.ModelYear);
    }

}