package Lesson4_LiskovSubstitutionPrinciple.BetterCode;

import Lesson4_LiskovSubstitutionPrinciple.ProblematicCode.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InternationalPaymentCompatibleCreditCard> cards = new ArrayList<>();
        for(InternationalPaymentCompatibleCreditCard card : cards) {
            card.internationalPayment();
        }
    }
}
