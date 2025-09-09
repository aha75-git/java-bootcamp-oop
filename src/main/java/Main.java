import bootcamp.schulung.oop.course.Course;
import bootcamp.schulung.oop.course.University;
import bootcamp.schulung.oop.course.UniversityService;
import bootcamp.schulung.oop.person.Gender;
import bootcamp.schulung.oop.person.Person;
import bootcamp.schulung.oop.person.Student;
import bootcamp.schulung.oop.person.Teacher;
import bootcamp.schulung.oop.vehicle.Car;
import bootcamp.schulung.oop.vehicle.CarExercise;
import bootcamp.schulung.oop.vehicle.Motorcycle;
import bootcamp.schulung.oop.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*

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

         */

        Teacher teacher = new Teacher("1", "Dr. Prof. Herr Müller", "Mathe");
        List<Student> students = new ArrayList<>();
        //students.add(new Student("1", "Mario Möller", "Musterstr. 5, 44444 Musterstadt", "2"));
        //students.add(new Student("2", "Marina Möller", "Petersstr. 7, 44444 Musterstadt", "4"));
        //students.add(new Student("3", "Peter Maier", "Kloppstr. 17, 44433 Musterstadt-Löhne", "4"));

        students.add(Student.builder().id("1").name("Mario Möller").grade(2).address("Musterstr. 5, 44444 Musterstadt").build());
        students.add(Student.builder().id("2").name("Marina Möller").grade(4).address("Petersstr. 7, 44444 Musterstadt").build());
        students.add(Student.builder().id("3").name("Peter Maier").grade(1).address("Kloppstr. 17, 44433 Musterstadt-Löhne").build());

        //Course course = new Course("1", "Algebra", teacher, students);
        Course course = Course.builder().id("1").students(students).teacher(teacher).name("Algebra").build();

        Teacher teacher2 = new Teacher("2", "Dr. Prof. Frau Balzert", "Informatik");
        List<Student> students2 = new ArrayList<>();

        students2.add(Student.builder().id("4").name("Mona Lisa").grade(1).address("Musterstr. 5, 44444 Musterstadt").build());
        students2.add(Student.builder().id("5").name("Barbara Möller").grade(2).address("Petersstr. 7, 44444 Musterstadt").build());
        students2.add(Student.builder().id("6").name("Peter Geld").grade(1).address("Kloppstr. 17, 44433 Musterstadt-Löhne").build());
        students2.add(Student.builder().id("7").name("Peter Loch").grade(2).address("Kloppstr. 17, 44433 Musterstadt-Löhne").build());
        students2.add(Student.builder().id("8").name("Ilona Mask").grade(3).address("Kloppstr. 17, 44433 Musterstadt-Löhne").build());

        Course course2 = Course.builder().id("2").students(students2).teacher(teacher2).name("Informatik").build();

        University university = new University("1", "ATU Dortmund", List.of(course, course2));
        UniversityService  universityService = new UniversityService();

        System.out.println("Durchschnittsgrad des Kurses 1: " + String.format("%.2f", universityService.averageGradeOfCourse(course)));
        System.out.println("Durchschnittsgrad des Kurses 2: " + String.format("%.2f", universityService.averageGradeOfCourse(course2)));
        System.out.println("Durchschnittsgrad der gesamten Universität: " + String.format("%.2f", universityService.averageGradeOfUniversity(university)));
        System.out.println();
        System.out.println("alle Studenten einer Universität mit einer Mindestnote von 2/”Gut”: ");
        universityService.retrieveAllStudentsOfUniversityWithMinGradeOfGood(university, 2.0).stream().distinct().forEach(System.out::println);
    }
}
