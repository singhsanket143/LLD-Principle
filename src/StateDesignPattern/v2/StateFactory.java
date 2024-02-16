package StateDesignPattern.v2;

public class StateFactory {

    public static ATMState getState(ATMStateEnum state, ATM atm) {
        if(state.equals(ATMStateEnum.READY)) {
            return new ReadyState(atm);
        }
        if(state.equals(ATMStateEnum.CARD_READING)) {
            return new CardReadingState(atm);
        }
        if(state.equals(ATMStateEnum.WITHDRAWL_DETAILS_READING)) {
            return new WithdrawlReadingState(atm);
        }
        // ..
        return null;
    }
}
