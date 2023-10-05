package inheritance;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic Vehicle", 2020);
        Car car = new Car("Toyota", 2022, 4);
        Vehicle carFromVehicle = new Car("Ford Fusion", 2015, 5);



        System.out.println("Vehicle Info:");
        vehicle.displayInfo();

        System.out.println("\nCar Info:");
        car.displayInfo();

        System.out.println("\nCar made from vehicle Info:");
        carFromVehicle.displayInfo();

        car.start();
        car.honk();
        car.stop();
    }
}
