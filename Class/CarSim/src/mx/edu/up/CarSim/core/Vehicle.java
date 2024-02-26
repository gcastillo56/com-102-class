package mx.edu.up.CarSim.core;

public class Vehicle {
    protected int passengers;
    protected int wheels;
    protected String brand;
    protected String model;
    protected String color;
    protected int year;
    protected int maxSpeed;
    protected int length;
    private float x;
    private float y;
    protected String vehicleType = "Vehicle";

    protected Engine myEngine;

    public Vehicle(Engine theEngine) {
        this.x = 0;
        this.y = 0;
        this.myEngine = theEngine;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     *
     * @return
     */
    public int getLength() {
        return length;
    }

    /**
     *
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     *
     */
    public void presentYourself() {
        System.out.println("I am a " + this.vehicleType + ", " + this.year +
                " " + this.brand + " " + this.model);
    }

    /**
     * This method will represent the movement of a vehicle.
     *
     * @param spX - This is the change in the x coordinate
     * @param spY - This is the change in the y coordinate
     */
    private void move(float spX, float spY) {
        this.x += spX;
        this.y += spY;
    }

    public void accelerate(int level) {
        this.move(this.myEngine.accelerate(level), 0);
    }

    public void reportLocation() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
