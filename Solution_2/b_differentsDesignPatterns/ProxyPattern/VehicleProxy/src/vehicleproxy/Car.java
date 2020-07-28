
package vehicleproxy;

public class Car implements Vehicle{
int wheels, passangers, gasLabel = 10;
boolean check;

    public Car() {
        getSpeed();
    }




    @Override
    public int set_num_of_wheels() {
        wheels = 4;
        return wheels;
    }

    @Override
    public int set_num_of_passengers() {
        passangers = 5;
        return passangers;
    }

    @Override
    public boolean has_gas() {
        check = gasLabel>10;   //check gas label
        return check;
    }
    
    public void getSpeed(){
        System.out.println("Speed: 100 km/h");
    }
}
