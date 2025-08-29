package bootcamp.schulung.oop.vehicle;

public class Vehicle {
    private String manufacturer;
    private String model;
    private int year ;

    public Vehicle(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public String displayInfo() {
        return String.format("""
                Hersteller: %s
                Modell: %s
                Jahr: %d
                """, getManufacturer(), getModel(), getYear());
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
