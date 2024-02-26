package mx.edu.up.CarSim.engines;

import mx.edu.up.CarSim.core.Engine;

public class ElectricEngine extends Engine {
    @Override
    protected float generatePower(int level) {
        System.out.println("Using the power of the sun");
        return (level * 1.5f);
    }
}
