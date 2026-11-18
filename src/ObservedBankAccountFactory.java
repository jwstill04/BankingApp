public class ObservedBankAccountFactory extends BankAccountFactory{
    @Override
    public BankAccount createAccount(String username, String password) {
        BankAccount account = super.createAccount(username, password);
        account.addObserver(new ConsoleAlertObserver());
        return account;
    }
}
