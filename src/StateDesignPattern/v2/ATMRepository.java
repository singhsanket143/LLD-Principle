package StateDesignPattern.v2;

import java.util.UUID;

public class ATMRepository {

    public static ATMStateEnum getAtmState(String deviceId) {
        // sql query,
        return ATMStateEnum.READY;
    }

    public static String createNewTxn(String deviceId) {
        // actually sql query
        return UUID.randomUUID().toString();
    }

    public static void saveCardDetails(){

    }
}
