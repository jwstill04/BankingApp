import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        CommandController controller = new CommandController();

        while (true) {
            System.out.println("What would you like to do?\n" +
                    "Type W for withdraw, D for deposit, or A to make an account:");
            String action = sc.nextLine().toUpperCase();

            switch (action) {
                case "W":
                    if (account == null) {
                        System.out.println("You must create an account first!");
                        break;
                    }
                    if (account.balance <= 0) {
                        System.out.println("You don't have enough balance to withdraw!");
                        break;
                    }

                    System.out.println("Your current balance is " + account.balance
                            + "\nHow much would you like to withdraw?");
                    float amount = sc.nextFloat();

                    Command withdrawCommand = new WithdrawCommand(account, amount);
                    controller.setCommand(withdrawCommand);
                    controller.executeCommand();

                    // Give out cash ********************************

                    System.out.println("Your new balance is " + account.balance);

                    break;
                case "D":
                    if (account == null) {
                        System.out.println("You must create an account first!");
                        break;
                    }
                    // check account total and fire deposit command     *****************
                    break;
                case "A":
                    BankAccountFactory accountFactory = new BankAccountFactory();

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