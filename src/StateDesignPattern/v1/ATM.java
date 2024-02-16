package StateDesignPattern.v1;
import java.util.UUID;

public class ATM {

    private final String deviceId;
    private ATMState state;

    public ATM(String deviceId) {
        this.deviceId = deviceId; // assume it will be coming from db
        this.state = ATMState.READY;
    }

    public String init() {
        if(this.state.equals(ATMState.CARD_READING)) {
            throw new IllegalArgumentException("old txn is in process, state: CARD_READING");
        }
        if(this.state.equals(ATMState.WITHDRAWL_DETAILS_READING)) {
            throw new IllegalArgumentException("old txn is in process, state: WITHDRAWL_DETAILS_READING");
        }
        if(this.state.equals(ATMState.CARD_EJECTING)) {
            throw new IllegalArgumentException("old txn is in process, state: CARD_EJECTING");
        }
        if(this.state.equals(ATMState.CASH_DISPENSING)) {
            throw new IllegalArgumentException("old txn is in process, state: CASH_DISPENSING");
        }
        // unique txn id creation
        String txnId = UUID.randomUUID().toString();
        this.state = ATMState.CARD_READING;
        return txnId;
    }

    public boolean cancelTxn(String txnId) {
        if(this.state.equals(ATMState.CARD_READING)) {
        }
        if(this.state.equals(ATMState.WITHDRAWL_DETAILS_READING)) {
        }
        if(this.state.equals(ATMState.CARD_EJECTING)) {
        }
        if(this.state.equals(ATMState.CASH_DISPENSING)) {
        }
        return true;
    }

    public void readCard(String txnId, String cardType, String cardNum, String cvv) {
        if(this.state.equals(ATMState.CARD_READING)) {
        }
        if(this.state.equals(ATMState.WITHDRAWL_DETAILS_READING)) {
        }
        if(this.state.equals(ATMState.CARD_EJECTING)) {
        }
        if(this.state.equals(ATMState.CASH_DISPENSING)) {
        }
    }

    public void withdrawCash(String txnId, int amount) {
        if(this.state.equals(ATMState.CARD_READING)) {
        }
        if(this.state.equals(ATMState.WITHDRAWL_DETAILS_READING)) {
        }
        if(this.state.equals(ATMState.CARD_EJECTING)) {
        }
        if(this.state.equals(ATMState.CASH_DISPENSING)) {
        }
    }

}
