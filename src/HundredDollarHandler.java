public class HundredDollarHandler extends WithdrawalHandler {

    @Override
    public boolean handle(BankAccount account, float amount0) {
        int bills = (int) amount0 /100;
        float remaining = amount0 % 100;

        if (bills > 0) {
            System.out.println("Dispensing" + bills + " $100 bills");
        }

        if (nextHandler != null && remaining > 0) {
            return nextHandler.handle(account, remaining);
        }

        return true;
    }
}
