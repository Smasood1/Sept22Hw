package Homework2;

public class Monitor {
    private Resolution resolution;

    public Monitor(Resolution resolution) {
        this.resolution = resolution;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Monitor resolution: " + resolution ;
    }


    public void drawPixel(int x, int y, String color){

        System.out.println("Drawing pixel at \" + x + \",\" + y + \" \" + \" in color \"+ color.");
    }






}
