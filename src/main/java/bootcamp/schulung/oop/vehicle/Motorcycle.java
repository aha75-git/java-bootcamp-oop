package bootcamp.schulung.oop.vehicle;

public class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String type) {
        super(manufacturer, model, yearOfManufacture);
        this.type = type;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + String.format("""
        Typ: %s
        """, getType());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
