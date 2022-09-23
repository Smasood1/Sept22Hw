package Homework1;

public class Horse extends Vehicle implements IRideAble{


    public Horse(String name, int qty, double price, float speed) {
        super(name, qty, price, speed);
    }

    @Override
   public void totalAfterTax(Vehicle horse) {
        System.out.println(totalBeforeTax(horse) + calcTax(horse));
    }


    @Override
    public int milesperHour() {
        return 3;
    }
}

