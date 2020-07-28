package vehiclebuilder;

public class VehicleBuild {

    public Car prepareCar() {
        Car car = new Car();
        car.setGasLabel(50);

        
        return car;
    }

    public Plane preparePlane() {
        Plane plane = new Plane();
        plane.setGasLabel(190);

        
        return plane;
    }

}
