package vehiclebuilder;

public class Plane implements Vehicle{
int wheels, passangers, gasLabel;
boolean check;

    public Plane() {
    }

public void setGasLabel(int gasLabel){
    this.gasLabel = gasLabel;
}


    @Override
    public int set_num_of_wheels() {
        wheels = 2;
        return wheels;
    }

    @Override
    public int set_num_of_passengers() {
        passangers = 120;
        return passangers;
    }

    @Override
    public boolean has_gas() {
        check = gasLabel>25;   //check gas label
        return check;
    }
    
}
