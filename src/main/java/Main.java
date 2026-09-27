import Creational_Design_Patterns.Builder_Pattern.Car;

public class Main {
    static void main() {
        Car.CarBuilder builder = new Car.CarBuilder();

        Car newCar = builder.setCar_number(990).setTop_speed("300").build();

        System.out.println(newCar);
    }
}
