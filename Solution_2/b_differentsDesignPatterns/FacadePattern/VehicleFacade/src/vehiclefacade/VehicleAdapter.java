
package vehiclefacade;

public class VehicleAdapter {
    Car car;
    Plane plane;

    public VehicleAdapter() {
        car = new Car();
        plane = new Plane();
    }
    public void prepareCar(){
        System.out.println("---Car---");
        car.setGasLabel(80);
        System.out.println("Passangers: "+car.set_num_of_passengers());
        System.out.println("Wheels "+car.set_num_of_wheels());
        System.out.println("Has Gas: "+car.has_gas());
    }
    public void preparePlane(){
        System.out.println("\n---Plane---");
        plane.setGasLabel(5);
        System.out.println("Passangers: "+plane.set_num_of_passengers());
        System.out.println("Wheels "+plane.set_num_of_wheels());
        System.out.println("Has Gas: "+plane.has_gas());
    }
}
