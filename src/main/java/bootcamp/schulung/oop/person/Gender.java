package bootcamp.schulung.oop.person;

public enum Gender {
    MALE("Herr"),
    FEMALE("Frau"),
    OTHER("Andere");

    private final String message;

    Gender(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
