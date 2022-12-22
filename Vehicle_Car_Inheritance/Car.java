public class Car extends Vehicle {
    private String body;
    private int MaxSpeed;

    public Car() {
    }

    public Car(String make, String color, int ModelYear, String body, int MaxSpeed) {
        super(make, color, ModelYear);
        this.body = body;
        this.MaxSpeed = MaxSpeed;
    }

    public void setbody(String body) {
        this.body = body;
    }

    public void setMaxSpeed(int MaxSpeed) {
        this.MaxSpeed = MaxSpeed;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Style Body Is : " + this.body + "\n" + "MAx Speed = " + this.MaxSpeed + " k/hr\n");
    }

}