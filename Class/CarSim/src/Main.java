import mx.edu.up.CarSim.Bike;
import mx.edu.up.CarSim.Car;
import mx.edu.up.CarSim.EVCar;
import mx.edu.up.CarSim.core.Engine;
import mx.edu.up.CarSim.core.Vehicle;
import mx.edu.up.CarSim.engines.CombustionEngine;
import mx.edu.up.CarSim.engines.ElectricEngine;

public class Main {
    public static void main(String[] args) {

        /*Engine engine1 = new Engine() {
            @Override
            protected float generatePower(int level) {
                System.out.println("This can not be, since I am an anonymous engine");
                return 0;
            }
        };
        System.out.println("Output 1: " + engine1.accelerate(2));
        */

        Engine engine2 = new CombustionEngine("v4", 200, 450, 5, 75);
        Engine engine3 = new ElectricEngine();

        System.out.println("Output 2: " + engine2.accelerate(2));
        System.out.println("Output 3: " + engine3.accelerate(2));

        Vehicle combustion = new Car();
        Vehicle evCar = new EVCar();



       /* Vehicle bike = new Bike();
        ((Bike)bike).doOllie();

        Car myCar = new Car();
        myCar.setYear(1965);
        myCar.setBrand("Ford");
        myCar.setModel("Mustang");

        myCar.setYear(1972);
        myCar.setBrand("Chevrolet");
        myCar.setModel("Camaro");

        Bike myBike = new Bike();
        myCar.setYear(2020);
        myCar.setBrand("Specialized");
        myCar.setModel("T-100");

        myCar.setYear(2000);
        myCar.setBrand("Mercedes");
        myCar.setModel("Urvan-3000");
        myCar.setPassengers(-50);

        for(int i=0; i< 100; i++) {
            myBike.move(2,0);
            myBike.reportLocation();
        }*/

    }
}