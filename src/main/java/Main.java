import Creational_Design_Patterns.Factor_Patern.CryptoPayments;
import Creational_Design_Patterns.Factor_Patern.PaymentFactory;
import Creational_Design_Patterns.Factor_Patern.Payment_Type;
import Creational_Design_Patterns.Factor_Patern.Payments;

public class Main {
    static void main() {

        Payments payments = PaymentFactory.create(Payment_Type.Crypto);

        payments.Pay(22.2);
    }
}
