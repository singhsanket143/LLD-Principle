package StateDesignPattern.v2;

import java.util.UUID;

public class ReadyState implements ATMState{

    private final ATM atm;

    public ReadyState(ATM atm) {
        this.atm = atm;
    }
    @Override
    public String init() {
        String txnId = UUID.randomUUID().toString();
        this.atm.changeState(StateFactory.getState(ATMStateEnum.CARD_READING, this.atm));
        return txnId;
    }

    @Override
    public boolean cancelTxn(String txnId) {
        throw new IllegalArgumentException("No txn in process");
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
