package Homework2;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSuppl;
    private Dimensions dimensions;


    public Case(String model, String manufacturer, String powerSuppl, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSuppl = powerSuppl;
        this.dimensions = dimensions;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPowerSuppl() {
        return powerSuppl;
    }

    public void setPowerSuppl(String powerSuppl) {
        this.powerSuppl = powerSuppl;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }


    @Override
    public String toString() {
        return "Case model: " + model + "\nManufacturer: " + manufacturer + "\nPowerSupply='" + powerSuppl + "\nDimensions: " + dimensions;
    }




    public void pressPowerButton(){

        System.out.println("\n@@@@@@@@@@@Power Button Pressed@@@@@@@@@@");
    }
}
