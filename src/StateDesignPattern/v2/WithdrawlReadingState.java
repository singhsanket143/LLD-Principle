package StateDesignPattern.v2;

public class WithdrawlReadingState implements ATMState{
    private final ATM atm;

    public WithdrawlReadingState(ATM atm) {
        this.atm = atm;
    }
    @Override
    public String init() {
        return null;
    }

    @Override
    public boolean cancelTxn(String txnId) {
        return false;
    }

    @Override
    public void ejectCard() {

    }

    @Override
    public boolean readCard(String txnId, String cardNum, String cardType, String cardCVV) {
        return false;
    }

    @Override
    public boolean readWithdrawlDetails(float amount, String txnId, int pin) {
        return false;
    }

    @Override
    public boolean dispenseCash(String txnId) {
        return false;
    }
}
