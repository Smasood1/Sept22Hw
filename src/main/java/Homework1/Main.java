package Homework1;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(4);

        Car car = new Car("Accord",1,27895,120.0f,engine);
        Bike bike = new Bike("Ninja",2,11500,130.0f);
        Truck truck = new Truck("CyberTruck",1,45000,135.0f,engine);
        Horse horse = new Horse("Pegasus",1,1500,1000000.0f);
        //rideable
        RollerCoaster rollerCoaster1 = new RollerCoaster(45000.0,120.0f);

        //array of vehicle objects
        Vehicle [] vehicles = {car, bike, truck, horse};
        for(Vehicle x : vehicles){

            x.totalBeforeTax(vehicles[3]);
            x.totalAfterTax(vehicles[3]);
        }
        IRideAble [] rideable = {rollerCoaster1,bike,horse};


        rollerCoaster1.totalAfterTax();
        VehicleApp.printVehicleNamesAndPrices(vehicles);
        VehicleApp.getSpeedOfRideableObjects(rideable);



    }
}
