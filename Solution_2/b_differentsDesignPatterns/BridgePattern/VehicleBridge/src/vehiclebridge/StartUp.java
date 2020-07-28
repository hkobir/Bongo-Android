package vehiclebridge;

public class StartUp {

    public static void main(String[] args) {
        VehicleBridge car = new Gas(new Car());

        System.out.println("---Car---");
        car.BuildBridge();

        VehicleBridge plane = new Gas(new Plane());

        System.out.println("\n---Plane---");
        plane.BuildBridge();
    }

}
