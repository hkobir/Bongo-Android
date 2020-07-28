package vehiclefactory;

public class StartUp {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        //get an object of Car and call its all method.
        Car car1 = (Car) vehicleFactory.getVehicle("CAR");

        System.out.println("---Car---");
        car1.setGasLabel(80);
        System.out.println("Passangers: "+car1.set_num_of_passengers());
        System.out.println("Wheels "+car1.set_num_of_wheels());
        System.out.println("Has Gas: "+car1.has_gas());
        
        //get an object of Car and call its all method.
        Plane plane1 = (Plane) vehicleFactory.getVehicle("PLANE");

        System.out.println("\n---Plane---");
        plane1.setGasLabel(5);
        System.out.println("Passangers: "+plane1.set_num_of_passengers());
        System.out.println("Wheels "+plane1.set_num_of_wheels());
        System.out.println("Has Gas: "+plane1.has_gas());
    }

}
