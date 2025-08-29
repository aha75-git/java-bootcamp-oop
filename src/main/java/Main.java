import bootcamp.schulung.oop.person.Gender;
import bootcamp.schulung.oop.person.Person;
import bootcamp.schulung.oop.vehicle.Car;
import bootcamp.schulung.oop.vehicle.CarExercise;
import bootcamp.schulung.oop.vehicle.Motorcycle;
import bootcamp.schulung.oop.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("#########  Instanz der Klasse Vehicle  ##########\r\n");
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2020);
        System.out.println(vehicle.displayInfo());

        System.out.println();

        System.out.println("#########  Instanz der Klasse Car  ##########\r\n");
        Car car = new Car("Honda", "Civic", 2021, 4);
        System.out.println(car.displayInfo());

        System.out.println();

        System.out.println("#########  Instanz der Klasse Motorcycle  ##########\r\n");
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2022, "Cruiser");
        System.out.println(motorcycle.displayInfo());
    }
}
