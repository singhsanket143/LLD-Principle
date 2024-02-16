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
        // unique txn id creation
        String txnId = UUID.randomUUID().toString();
        this.state = ATMState.CARD_READING;
        return txnId;
    }

}
