import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (;;) {
            System.out.println("Press ( 1 or 2) To Select Shape To Get Area :");
            System.out.println("1- Circle.\n" + "2- Cylinder");
            int SelectShape = input.nextInt();
            System.out.println(
                    "---------------------------------------------------------------------------------------------------");
            if (SelectShape == 1) {
                System.out.print("Enter The Radius of The Circle : ");
                Float radius = input.nextFloat();
                Circle c1 = new Circle(radius);
                System.out.println("The Area of The Circle = " + c1.getArea());
                System.out.println(
                        "---------------------------------------------------------------------------------------------------");
            } else if (SelectShape == 2) {
                System.out.print("Enter The Radius of The Base Of The Cylinder : ");
                Float radius = input.nextFloat();
                System.out.print("Enter The Height of The Side Of The Cylinder : ");
                Float height = input.nextFloat();
                Cylinder cy1 = new Cylinder(radius, height);
                System.out.println("The Area of The Cylinder = " + cy1.getArea());
                System.out.println(
                        "---------------------------------------------------------------------------------------------------");
            }
        }
    }
}
