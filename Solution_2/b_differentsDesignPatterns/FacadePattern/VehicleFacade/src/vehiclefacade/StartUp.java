
package vehiclefacade;

public class StartUp {

  
    public static void main(String[] args) {
       VehicleAdapter adapter = new VehicleAdapter();
       
       adapter.prepareCar();
       adapter.preparePlane();
    }
    
}
