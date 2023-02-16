package Unit_3;
/*
Evan Zhang
oct.24th
to create a Sphere class
 */

public class Sphere {
    private double radius;
    public Sphere(double radiusArg){
        radius = radiusArg;
    }

    public void setRadius (double radiusArg){
        radius = radiusArg;
    }
    public double getRadius(){
        return radius;
    }

    public double calcVolume(){
        return (3.0/4) * Math.PI * Math.pow(radius,3);
    }

    public double calSurfaceArea(){
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double calcCircumference(){
        return 2 * Math.PI * radius;
    }
}
