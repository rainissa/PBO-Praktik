public class Circle extends Shape {
    private double radius;

    // Circle()
    public Circle() {
        super();
        radius = 1.0;
    }
    // Circle(radius:double)
    public Circle(double r) {
        super();
        radius = r;
    }
    // Circle(radius:double, color:String, filled:boolean)
    public Circle(double r, String c, boolean f) {
        super(c, f);
        radius = r;
    }
    // getRadius():double
    public double getRadius() {
        return radius;
    }
    // setRadius(radius:double):void
    public void setRadius(double r) {
        radius = r;
    }
    // getArea():double
    public double getArea() {
        return radius * radius * Math.PI;
    }
    // getPerimeter():double
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    // toString():String
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ",radius=" + radius + "]";
    }
}