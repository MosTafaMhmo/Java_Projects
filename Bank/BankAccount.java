
public class BankAccount {

    private String account_name;
    private int account_id;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String account_name, int account_id, double balance) {
        this.account_name = account_name;
        this.account_id = account_id;
        this.balance = balance;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public void setAccount_id(int id) {
        account_id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Amount Should Be Positive");
        } else {
            balance += amount;
            System.out.println("The Balance : " + balance);
        }

    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Amount Should Be Positive");
        } else {
            if (balance < amount) {
                System.out.println("Insufficient Balance");
            } else {
                balance -= amount;
                System.out.println("The Balance : " + balance);
            }
        }
    }

    public void CheckBalance() {
        System.out.println("THE BALANCE IS : " + this.balance);
    }

    public void display() {
        System.out.println("Account Name : " + this.account_name + "\n" + "Account-Num : " + account_id + "\n"
                + "Your Balance Is : " + this.balance);
    }
}
