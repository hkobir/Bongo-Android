package vehiclebuilder;


public class StartUp {

    public static void main(String[] args) {
        VehicleBuild build = new VehicleBuild();
        
        Car car = build.prepareCar();
        System.out.println("---Car---");
        System.out.println("Passangers: "+car.set_num_of_passengers());
        System.out.println("Wheels "+car.set_num_of_wheels());
        System.out.println("Has Gas: "+car.has_gas());
        
        
        Plane plane = build.preparePlane();
        System.out.println("\n---Plane---");
        System.out.println("Passangers: "+plane.set_num_of_passengers());
        System.out.println("Wheels "+plane.set_num_of_wheels());
        System.out.println("Has Gas: "+plane.has_gas());
    }

}
