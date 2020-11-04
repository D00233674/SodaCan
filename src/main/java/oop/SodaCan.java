package oop;

public class SodaCan {

    //TODO
    // see P8.5 for class requirements
    private double height;
    private double radius;

    public SodaCan(double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    public SodaCan(){
        this.height = 10;
        this.radius = 5;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //A=2πrh+2πr^2
    public double getSurfaceArea(){
        double surfaceArea;

        surfaceArea = (2 * Math.PI * this.radius * this.height) + (2 * Math.PI * Math.pow(this.radius, 2));

        return surfaceArea;
    }

    //V=πr^2h
    public double getVolume(){
        double volume;

        volume = Math.PI * Math.pow(this.radius, 2) * this.height;

        return volume;
    }

    @Override
    public String toString() {
        return "SodaCan{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }
}
