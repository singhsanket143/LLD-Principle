package StateDesignPattern.v2;

public class CardReadingState implements ATMState{

    private final ATM atm;

    public CardReadingState(ATM atm) {
        this.atm = atm;
    }
    @Override
    public String init() {
        return null;
    }

    @Override
    public boolean cancelTxn(String txnId) {
        // logic to cancel current txn
        this.atm.changeState(StateFactory.getState(ATMStateEnum.READY, this.atm));
        return true;
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
