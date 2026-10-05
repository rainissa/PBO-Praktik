public class Square extends Rectangle {
    // Square()
    public Square() {
        super();
    }
    // Square(side:double)
    public Square(double side) {
        super(side, side);
    }
    // Square(side:double, color:String, filled:boolean)
    public Square(double side, String c, boolean f) {
        super(side, side, c, f);
    }
    // getSide():double
    public double getSide() {
        return getWidth();
    }
    // setSide(side:double):void
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    // setWidth(side:double):void
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    // setLength(side:double):void
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    // toString():String
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}