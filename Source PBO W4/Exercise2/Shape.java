public class Shape {
    private String color;
    private boolean filled;

    // Shape()
    public Shape() {
        color = "red";
        filled = true;
    }
    // Shape(color:String, filled:boolean)
    public Shape(String c, boolean f) {
        color = c;
        filled = f;
    }
    // getColor():String
    public String getColor() {
        return color;
    }
    // setColor(color:String):void
    public void setColor(String c) {
        color = c;
    }
    // isFilled():boolean
    public boolean isFilled() {
        return filled;
    }
    // setFilled(filled:boolean):void
    public void setFilled(boolean f) {
        filled = f;
    }
    // toString():String
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}