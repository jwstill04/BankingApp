public class TenDollarHandler extends WithdrawalHandler {

    @Override
    public boolean handle(BankAccount account, float amount0) {
        int bills = (int) amount0 /10;
        float remaining = amount0 % 10;

        if (bills > 0) {
            System.out.println("Dispensing" + bills + " $10 bills");
        }

        if (nextHandler != null && remaining > 0) {
            return nextHandler.handle(account, remaining);
        }

        return true;
    }
}
