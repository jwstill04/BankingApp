public class FiveDollarHandler extends WithdrawalHandler {

    @Override
    public boolean handle(BankAccount account, float amount0) {
        int bills = (int) amount0 /5;
        float remaining = amount0 % 5;

        if (bills > 0) {
            System.out.println("Dispensing" + bills + " $5 bills");
        }

        if (nextHandler != null && remaining > 0) {
            return nextHandler.handle(account, remaining);
        }

        return true;
    }
}
