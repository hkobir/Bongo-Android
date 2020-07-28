
package vehiclefactory;

public class Car implements Vehicle{
int wheels, passangers, gasLabel;
boolean check;

    public Car() {
    }

public void setGasLabel(int gasLabel){
    this.gasLabel = gasLabel;
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
    
}
