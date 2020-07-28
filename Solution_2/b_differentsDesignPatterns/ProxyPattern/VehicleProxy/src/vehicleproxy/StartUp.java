
package vehicleproxy;


public class StartUp {

   
    public static void main(String[] args) {
        Vehicle vehicle = new Plane();
        
        System.out.println("--Show speed--");
        System.out.println("Passangers: "+vehicle.set_num_of_passengers());
        System.out.println("Wheels "+vehicle.set_num_of_wheels());
        System.out.println("Has Gas: "+vehicle.has_gas());
        
        System.out.println("\n--Not showed speed--");
        System.out.println("Passangers: "+vehicle.set_num_of_passengers());
        System.out.println("Wheels "+vehicle.set_num_of_wheels());
        System.out.println("Has Gas: "+vehicle.has_gas());
    }
    
}
