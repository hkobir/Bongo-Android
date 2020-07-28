package vehiclefactory;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();

        } else if (vehicleType.equalsIgnoreCase("PLANE")) {
            return new Plane();

        }

        return null;

    }
}
