package Creational_Design_Patterns.Factor_Patern;

public class UpiPayments implements Payments{
    @Override
    public void Pay(double amount) {
        System.out.println("Paying via UPI Amount: " + amount);
    }
}
