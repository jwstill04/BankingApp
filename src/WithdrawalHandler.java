
public abstract class WithdrawalHandler {

    protected WithdrawalHandler nextHandler;

    public void setNextHandler(WithdrawalHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract boolean handle(BankAccount account, float amount0);
}