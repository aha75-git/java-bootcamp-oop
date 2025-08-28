import bootcamp.schulung.oop.person.Gender;
import bootcamp.schulung.oop.person.Person;
import bootcamp.schulung.oop.vehicle.Car;

public class Main {
    public static void main(String[] args) {
        // Autos
        Car car = new Car();
        System.out.println(car.start());
        System.out.println();
        Car car2 = new Car();
        System.out.println(car2.start());
        car2.speedUp();
        System.out.println("Das Auto 2 beschleunigt sich. Die Geschwindigkeit ist " + car2.getSpeed());
        car2.speedUp();
        car2.speedUp();
        System.out.println("Das Auto 2 beschleunigt sich. Die Geschwindigkeit ist " + car2.getSpeed());
        System.out.println();

        // Personen
        Person andreas = new Person(50, "Andreas Haffner", Gender.MALE);
        Person helene = new Person(33, "Helene Meier", Gender.MALE);
        Person laura = new Person(23, "Laura Müller", Gender.MALE);
        Person alex = new Person(18, "Alexander Geld", Gender.MALE);

        System.out.println(andreas.introducePerson());
        System.out.println(helene.introducePerson());
        System.out.println(laura.introducePerson());
        System.out.println(alex.introducePerson());
    }
}
