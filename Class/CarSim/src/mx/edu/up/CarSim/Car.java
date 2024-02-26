package mx.edu.up.CarSim;

import mx.edu.up.CarSim.core.Vehicle;
import mx.edu.up.CarSim.engines.CombustionEngine;

public class Car extends Vehicle {
    public Car() {
        super(new CombustionEngine("v4", 200, 450, 5, 75));
        this.vehicleType = "car";
    }

}