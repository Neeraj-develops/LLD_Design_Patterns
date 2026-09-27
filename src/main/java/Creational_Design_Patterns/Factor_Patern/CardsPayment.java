package Creational_Design_Patterns.Factor_Patern;

public class CardsPayment implements Payments{

    @Override
    public void Pay(double amount) {
        System.out.println("Paying via Card Amount: " + amount);
    }
}
