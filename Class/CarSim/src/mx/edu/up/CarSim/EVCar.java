package mx.edu.up.CarSim;

import mx.edu.up.CarSim.core.Vehicle;
import mx.edu.up.CarSim.engines.ElectricEngine;

public class EVCar extends Vehicle {
    public EVCar(){
        super(new ElectricEngine());
    }
}
