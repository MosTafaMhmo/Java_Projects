
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To The Bank");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.print("Enter Your Name : ");
        String name = input.nextLine();
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.print("Enter Your Balance : ");
        double bal = input.nextDouble();
        System.out.print("Enter Your Account ID : ");
        int accId = input.nextInt();
        BankAccount acc1 = new BankAccount(name, accId, bal);

        for (;;) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Pres To Select The Operation That you Need : ");
            System.out.println("1- Deposite ");
            System.out.println("2- Withdrow ");
            System.out.println("3- Check ");
            System.out.println("4- Display ");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Eneter Your Amount : ");
                    double Damo = input.nextDouble();
                    acc1.deposit(Damo);
                    break;
                case 2:
                    System.out.print("Enter Your Amount : ");
                    double Wamo = input.nextDouble();
                    acc1.withdraw(Wamo);
                    break;
                case 3:
                    acc1.CheckBalance();
                    break;
                case 4:
                    acc1.display();
                    break;
            }
        }
    }
}
