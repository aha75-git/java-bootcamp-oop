package bootcamp.schulung.oop.vehicle;

public class Car {
    private String color;
    private String model;
    private String brand;
    private int speed;

    public void start() {
        System.out.println("Das Auto wurde gestartet.");
    }

    public void speedUp() {
        this.speed++;
    }

    public void speedDown() {
        this.speed--;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
