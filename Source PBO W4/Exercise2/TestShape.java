public class TestShape {
    public static void main(String[] args) {
        // ===== Tes Shape =====
        Shape s1 = new Shape();
        Shape s2 = new Shape("blue", false);
        System.out.println(s1);
        System.out.println(s2);
        s1.setColor("green");
        s1.setFilled(false);
        System.out.println(s1.getColor() + " " + s1.isFilled());
        System.out.println(s1);

        // ===== Tes Circle =====
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle(3.0, "blue", false);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        c1.setRadius(5.0);
        System.out.println("radius=" + c1.getRadius()
            + " area=" + c1.getArea()
            + " perimeter=" + c1.getPerimeter());

        // ===== Tes Rectangle =====
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2.0, 3.0);
        Rectangle r3 = new Rectangle(4.0, 5.0, "yellow", false);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("width=" + r2.getWidth()
            + " length=" + r2.getLength()
            + " area=" + r2.getArea()
            + " perimeter=" + r2.getPerimeter());

        // ===== Tes Square =====
        Square q1 = new Square();
        Square q2 = new Square(4.0);
        Square q3 = new Square(2.0, "green", true);
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
        System.out.println("side=" + q2.getSide()
            + " area=" + q2.getArea()
            + " perimeter=" + q2.getPerimeter());

        // setWidth, setLength, setSide harus mengubah width DAN length
        q2.setWidth(6.0);
        System.out.println(q2);
        q2.setLength(7.0);
        System.out.println(q2);
        q2.setSide(3.0);
        System.out.println(q2);
    }
}