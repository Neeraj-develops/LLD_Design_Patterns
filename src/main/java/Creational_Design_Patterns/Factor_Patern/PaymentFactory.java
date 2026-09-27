package Creational_Design_Patterns.Factor_Patern;

import static Creational_Design_Patterns.Factor_Patern.Payment_Type.*;

public class PaymentFactory {

    public static Payments create(Payment_Type type){
        return switch (type) {
            case UPI -> new UpiPayments();
            case CARD -> new CardsPayment();
            case Crypto -> new CryptoPayments();
            default -> throw new IllegalArgumentException("Invalid Payment Type");
        };
    }

}
