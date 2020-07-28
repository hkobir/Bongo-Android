
package vehiclebridge;

public abstract class VehicleBridge {
    protected Vehicle vehicle;

    public VehicleBridge(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public abstract void BuildBridge();
}
