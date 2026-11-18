import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account;

        while (true) {
            System.out.println("What would you like to do?\n" +
                    "Type W for withdraw, D for deposit, or A to make an account:");
            String action = sc.nextLine().toUpperCase();

            switch (action) {
                case "W":
                    // check account total and fire withdraw command    *****************
                    break;
                case "D":
                    // check account total and fire deposit command     *****************
                    break;
                case "A":
                    BankAccountFactory accountFactory = new ObservedBankAccountFactory();

                    System.out.println("Please enter a username:");
                    String username = sc.nextLine();

                    System.out.println("Please enter a password:");
                    String password = sc.nextLine();

                    account = accountFactory.createAccount(username, password);

                    System.out.println("Account created successfully!");
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }
}