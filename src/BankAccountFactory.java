public class BankAccountFactory extends BankComponentFactory {
    public BankAccount createAccount(String username, String password) {
        return new BankAccount(username, password);
    }
}