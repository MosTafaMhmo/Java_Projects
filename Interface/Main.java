import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Product Name : ");
        String p_name = input.nextLine();
        System.out.println("-----------------------------");

        System.out.print("Enter The Product Code : ");
        int p_code = input.nextInt();

        System.out.println("-----------------------------");

        System.out.print("Enter The Price Of The Product : ");
        Double pris = input.nextDouble();

        System.out.println("-----------------------------");

        input.nextLine();
        System.out.print("Enter The Item Of Cartoon : ");
        String itm = input.nextLine();
        System.out.println("-----------------------------");
        Cartoon c = new Cartoon(p_name, p_code, pris, itm);

        System.out.println("Enter The Number Of The Products : ");
        int size = input.nextInt();
        int[] arra = new int[size];
        c.Array_of_product(arra, itm);
        System.out.println("-----------------------------");

        c.displayably(arra, itm);
        System.out.println("-----------------------------");

        c.display();
    }
}
