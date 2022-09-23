package Homework1;

public class RollerCoaster implements IRideAble{
    private double price;
    private final double rctax = .20;
    private float speed;


    public RollerCoaster(double price, float speed) {
        this.price = price;
        this.speed=speed;
    }

    @Override
    public int milesperHour() {
        return (int) this.speed;
    }
    public double totalBeforeTax(){
        return price;

    }

    public void totalAfterTax() {
        System.out.println(getPrice() * rctax + getPrice());
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRctax() {
        return rctax;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
