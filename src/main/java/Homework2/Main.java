package Homework2;

public class Main {

    public static void main(String[] args) {



        Dimensions dim1 = new Dimensions(3,4,5);
        Resolution myRes = new Resolution(5,5);
        Monitor myMonitor = new Monitor(myRes);
        Motherboard myMotherboard = new Motherboard("Alien","OOTW",4,4,"randombio");
        Case myCase = new Case("Mac","Apple","Solar",dim1);
        PC myPc = new PC(myMonitor,myMotherboard,myCase);

        myPc.description();
        myPc.powerUp();
    }

}
