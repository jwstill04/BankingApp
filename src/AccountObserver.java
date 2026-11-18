public abstract class AccountObserver {
    public abstract void onTransaction(BankAccount account, TransactionType type, float amount, float newBalance);

}
