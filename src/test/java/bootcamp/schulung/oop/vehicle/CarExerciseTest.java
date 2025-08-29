package bootcamp.schulung.oop.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarExerciseTest {
    @Test
    public void start_outputShouldMatchExpected() {
        CarExercise carExercise = new CarExercise();
        assertEquals("Das Auto wurde gestartet.", carExercise.start());
    }

    @Test
    public void speed_outputShouldMatchExpected_whenCarSpeedUp() {
        CarExercise carExercise = new CarExercise();
        int expected = 0;
        assertEquals(expected, carExercise.getSpeed());
        carExercise.speedUp();
        expected++;
        assertEquals(expected, carExercise.getSpeed());
        carExercise.speedUp();
        expected++;
        assertEquals(expected, carExercise.getSpeed());
        carExercise.speedUp();
        expected++;
        assertEquals(expected, carExercise.getSpeed());
    }
}
