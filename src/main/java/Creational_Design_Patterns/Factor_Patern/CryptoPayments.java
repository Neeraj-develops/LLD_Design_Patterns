package Creational_Design_Patterns.Factor_Patern;

public class CryptoPayments implements Payments{
    @Override
    public void Pay(double amount) {
        System.out.println("Paying via Crypto Amount: " + amount);
    }
}
