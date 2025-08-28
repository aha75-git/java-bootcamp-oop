package bootcamp.schulung.oop.person;

public class Person {
    private int age;
    private String name;
    private Gender gender;

    public Person(int age, String name, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public String introducePerson() {
        return String.format("Hallo, ich bin %s und %d Jahre alt.", this.name, this.age);
    }
}
