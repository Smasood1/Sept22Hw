package Homework1;

public class VehicleApp {
    public static void printVehicleNamesAndPrices(Vehicle [] vehicles){

        for(int i = 0; i < vehicles.length; i++){
            System.out.println(vehicles[i].getName() + " " + vehicles[i].getPrice());
        }
    }

    public static void getSpeedOfRideableObjects(IRideAble [] rideables){

        for(int i = 0; i < rideables.length; i++){
            System.out.println(rideables[i].milesperHour());
        }


    }
}
