package Creational_Design_Patterns.Builder_Pattern;

public class Car {
    private int car_number;
    private int engine_number;
    private String model;
    private String top_speed;

    private Car (CarBuilder carBuilder){
        this.car_number = carBuilder.car_number;
        this.engine_number = carBuilder.engine_number;
        this.model = carBuilder.model;
        this.top_speed = carBuilder.top_speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car_number=" + car_number +
                ", engine_number=" + engine_number +
                ", model='" + model + '\'' +
                ", top_speed='" + top_speed + '\'' +
                '}';
    }

    public int getCar_number() {
        return car_number;
    }

    public int getEngine_number() {
        return engine_number;
    }

    public String getModel() {
        return model;
    }

    public String getTop_speed() {
        return top_speed;
    }

    public static class CarBuilder{
        private int car_number = 1234;
        private int engine_number = 546346;
        private String model = "2023";
        private String top_speed =  "280 km/h";

        public CarBuilder setCar_number(int car_number) {
            this.car_number = car_number;
            return this;
        }

        public CarBuilder setEngine_number(int engine_number) {
            this.engine_number = engine_number;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setTop_speed(String top_speed) {
            this.top_speed = top_speed;
            return this;
        }
        public Car build (){
            return  new Car(this);
        }
    }

}
