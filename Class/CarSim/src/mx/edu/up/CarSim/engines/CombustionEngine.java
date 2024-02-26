package mx.edu.up.CarSim.engines;

import mx.edu.up.CarSim.core.Engine;

public class CombustionEngine extends Engine {
    private int maxFuel;
    private int maxSpeed;
    private int currentSpeed;
    private String enginePlatform;
    private int maxGears;
    private int currentGear;

    public CombustionEngine(String platform, int max, int horsePower, int gears, int fuelMax) {
        this.enginePlatform = platform;
        this.maxSpeed = max;
        this.horsePower = horsePower;
        this.maxGears = gears;
        this.maxFuel = fuelMax;
        this.currentFuelLevel = 0;
    }

    public void fuelEngine(int fuelIntake) {
        if(fuelIntake < 0) {
            System.out.println("Please don't steal my gas");
            return;
        }
        if(this.currentFuelLevel + fuelIntake > this.maxFuel) {
            this.currentFuelLevel = this.maxFuel;
            System.out.println("The tank overflowed by " + (this.currentFuelLevel + fuelIntake - this.maxFuel));
        } else {
            this.currentFuelLevel += fuelIntake;
        }
    }

    public void changeGear() {

    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    @Override
    protected float generatePower(int level) {
        System.out.println("Burning some dinosaurs to give you power");
        return (float)(level * 0.23);
    }
}
