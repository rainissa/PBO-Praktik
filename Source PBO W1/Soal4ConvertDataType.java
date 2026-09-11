<<<<<<< HEAD
public class Soal4ConvertDataType {
    static short methodOne(long l) {
        int i = (int) l; // Cast dari long (64-bit) ke int (32-bit)
        return (short) i; // Cast dari int (32-bit) ke short (16-bit)
    }
    public static void main(String[] args) {
        double d = 10.25;
        float f = (float) d; // Cast dari double ke float
        byte b = (byte) methodOne((long) f); // Cast float ke long lalu panggil methodOne
        System.out.println(b);
    }
=======
public class Soal4ConvertDataType {
    static short methodOne(long l) {
        int i = (int) l; // Cast dari long (64-bit) ke int (32-bit)
        return (short) i; // Cast dari int (32-bit) ke short (16-bit)
    }
    public static void main(String[] args) {
        double d = 10.25;
        float f = (float) d; // Cast dari double ke float
        byte b = (byte) methodOne((long) f); // Cast float ke long lalu panggil methodOne
        System.out.println(b);
    }
>>>>>>> 5954da2f9d83cbd6fb5168256cf5883545a621e0
}