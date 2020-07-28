package vehiclebridge;

public class Gas extends VehicleBridge {

    public Gas(Vehicle vehicle) {
        super(vehicle);

    }

    @Override
    public void BuildBridge() {

        System.out.println("Passangers: " + vehicle.set_num_of_passengers());
        System.out.println("Wheels " + vehicle.set_num_of_wheels());
        System.out.println("Has Gas: " + vehicle.has_gas());
    }

}
