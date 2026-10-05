public class Rectangle extends Shape {
    private double width;
    private double length;

    // Rectangle()
    public Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }
    // Rectangle(width:double, length:double)
    public Rectangle(double w, double l) {
        super();
        width = w;
        length = l;
    }
    // Rectangle(width:double, length:double, color:String, filled:boolean)
    public Rectangle(double w, double l, String c, boolean f) {
        super(c, f);
        width = w;
        length = l;
    }
    // getWidth():double
    public double getWidth() {
        return width;
    }
    // setWidth(width:double):void
    public void setWidth(double w) {
        width = w;
    }
    // getLength():double
    public double getLength() {
        return length;
    }
    // setLength(length:double):void
    public void setLength(double l) {
        length = l;
    }
    // getArea():double
    public double getArea() {
        return width * length;
    }
    // getPerimeter():double
    public double getPerimeter() {
        return 2 * (width + length);
    }
    // toString():String
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",width=" + width + ",length=" + length + "]";
    }
}