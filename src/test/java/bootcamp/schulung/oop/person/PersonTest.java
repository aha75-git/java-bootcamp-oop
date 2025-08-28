package bootcamp.schulung.oop.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void introducePersonTest_outputShouldMatchExpected() {
        String output = "Hallo, ich bin Alexander Geld und 18 Jahre alt.";
        Person person = new Person(18, "Alexander Geld", Gender.MALE);
        assertEquals(output, person.introducePerson());
    }
}