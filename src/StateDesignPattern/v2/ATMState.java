package StateDesignPattern.v2;

public interface ATMState {

    String init();

    boolean cancelTxn(String txnId);

    void ejectCard();

    boolean readCard(String txnId, String cardNum, String cardType, String cardCVV);

    boolean readWithdrawlDetails(float amount, String txnId, int pin);

    boolean dispenseCash(String txnId);

}
