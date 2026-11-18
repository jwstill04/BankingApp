public class ConsoleAlertObserver extends AccountObserver{
    @Override
    public void onTransaction(BankAccount account, TransactionType type, float amount, float newBalance) {
        System.out.printf("Alert - %s on account %s: $%.2f (new balance: $%.2f)%n",type, account.username, amount, newBalance);
    }
}
