package bootcamp.schulung.oop.vehicle;

public class Car extends Vehicle {
    private int numberOfDoors;


    public Car(String manufacturer, String model, int year, int numberOfDoors) {
        super(manufacturer, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + String.format("""
        Anzahl der Türen: %d
        """, getNumberOfDoors());
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
