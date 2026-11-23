public class DepositCommand implements Command {
    BankAccount account;
    float amount;

    public DepositCommand(BankAccount account, float amount){
        this.account = account;
        this.amount = amount;
    }

    public void execute() {
        // deposit amount
    }
}
