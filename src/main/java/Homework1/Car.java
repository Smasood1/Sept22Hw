package Homework1;

public class Car extends Vehicle{

    public Car(String name, int qty, double price, float speed, Engine engine) {
        super(name, qty, price, speed, engine);
    }

    @Override
    public void totalAfterTax(Vehicle car)
    {
        System.out.println(totalBeforeTax(car) * calcTax(car));
    }


}
