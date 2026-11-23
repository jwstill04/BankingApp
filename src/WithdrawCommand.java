public class WithdrawCommand implements Command {
    BankAccount account;
    float amount;

    public WithdrawCommand(BankAccount account, float amount){
        this.account = account;
        this.amount = amount;
    }

    public void execute() {
        // withdraw amount
    }
}
