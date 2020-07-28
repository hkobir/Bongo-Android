package vehicleproxy;

public class Plane implements Vehicle {

    private Car car;

    int wheels, passangers, gasLabel = 20;
    boolean check;

    public Plane() {
    }



    @Override
    public int set_num_of_wheels() {
        if(car == null){
            car = new Car();
        }
        car.wheels = 2;
        return car.wheels;
    }

    @Override
    public int set_num_of_passengers() {
        if(car == null){
            car = new Car();
        }
        car.passangers = 120;
        return car.passangers;
    }

    @Override
    public boolean has_gas() {
        if(car == null){
            car = new Car();
        }
        car.check = gasLabel > 25;   //check gas label
        return car.check;
    }

}
