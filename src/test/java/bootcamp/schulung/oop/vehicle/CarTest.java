package bootcamp.schulung.oop.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void start_outputShouldMatchExpected() {
        Car car = new Car();
        assertEquals("Das Auto wurde gestartet.", car.start());
    }

    @Test
    public void speed_outputShouldMatchExpected_whenCarSpeedUp() {
        Car car = new Car();
        int expected = 0;
        assertEquals(expected, car.getSpeed());
        car.speedUp();
        expected++;
        assertEquals(expected, car.getSpeed());
        car.speedUp();
        expected++;
        assertEquals(expected, car.getSpeed());
    }
}
