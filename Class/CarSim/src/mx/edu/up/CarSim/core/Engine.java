package mx.edu.up.CarSim.core;

public abstract class Engine {
    protected int horsePower;
    protected int fuelCapacity;
    protected int currentFuelLevel;
    // private String typeOfFuel;
    protected int rpm; // Revolutions per minute
    protected int weight;

    abstract protected float generatePower(int level);

    public float brake(int level) {
        return generatePower(-level);
    }

    public float accelerate(int level) {
        return generatePower(level);
    }

    public void turnOn() {

    }

    public void turnOff() {

    }

    public int getFuelLevel() {
        return this.currentFuelLevel;
    }


}
