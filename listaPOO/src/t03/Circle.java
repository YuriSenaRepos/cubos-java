package t03;

public class Circle {
    private double radius;
    private double area;

    private double perimeter;

    public double CalculateArea (double radius){
        this.radius = radius;
        this.area = (double)Math.pow(radius,2) * Math.PI;
        return area;
    }
    public double CalculatePerimeter(double radius){
        this.radius = radius;
        this.perimeter = (radius * 2) * Math.PI;
        return perimeter;
    }

}
