import java.util.ArrayList;

public class BankAccount {
    public String username;
    public String password;
    public float balance;
    private ArrayList<AccountObserver> observers = new ArrayList<>();

    public BankAccount(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 1000;
    }

    public void addObserver(AccountObserver observer){ observers.add(observer); }

    public void removeObserver(AccountObserver observer){ observers.remove(observer); }

    private void notifyObservers(TransactionType type, float amount){
        for (AccountObserver observers : new ArrayList<>(observers)){
            observers.onTransaction(this, type, amount, balance);
        }
    }

    public void deposit(float amount){
        balance += amount;
        notifyObservers(TransactionType.DEPOSIT, amount);
    }

    public void withdraw(float amount){
        balance -= amount;
        notifyObservers(TransactionType.WITHDRAW, amount);
    }

}