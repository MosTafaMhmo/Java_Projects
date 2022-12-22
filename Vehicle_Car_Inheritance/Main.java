public class Main {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle("Jeep", "Black", 2022);
        Car c = new Car("Peugeot", "silver", 2022, "malaky", 250);
        veh.display();
        c.display();
    }
}
