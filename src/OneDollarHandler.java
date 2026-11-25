public class OneDollarHandler extends WithdrawalHandler {

    @Override
    public boolean handle(BankAccount account, float amount0) {
        int bills = (int) amount0;


        if (bills > 0) {
            System.out.println("Dispensing" + bills + " $1 bills");
        }

        return true;
    }
}

