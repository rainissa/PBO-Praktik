<<<<<<< HEAD
import java.math.BigInteger;
import java.util.Scanner;

public class Soal1DataTypes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                try {
                    BigInteger n = sc.nextBigInteger();
                    
                    // Cek apakah muat di tipe data long
                    if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && 
                        n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                        
                        System.out.println(n + " can be fitted in:");
                        
                        long val = n.longValue();
                        if (val >= Byte.MIN_VALUE && val <= Byte.MAX_VALUE) {
                            System.out.println("* byte");
                        }
                        if (val >= Short.MIN_VALUE && val <= Short.MAX_VALUE) {
                            System.out.println("* short");
                        }
                        if (val >= Integer.MIN_VALUE && val <= Integer.MAX_VALUE) {
                            System.out.println("* int");
                        }
                        System.out.println("* long");
                    } else {
                        System.out.println(n + " can't be fitted anywhere.");
                    }
                } catch (Exception e) {
                    System.out.println(sc.next() + " can't be fitted anywhere.");
                }
            }
        }
    }
=======
import java.math.BigInteger;
import java.util.Scanner;

public class Soal1DataTypes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                try {
                    BigInteger n = sc.nextBigInteger();
                    
                    // Cek apakah muat di tipe data long
                    if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && 
                        n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                        
                        System.out.println(n + " can be fitted in:");
                        
                        long val = n.longValue();
                        if (val >= Byte.MIN_VALUE && val <= Byte.MAX_VALUE) {
                            System.out.println("* byte");
                        }
                        if (val >= Short.MIN_VALUE && val <= Short.MAX_VALUE) {
                            System.out.println("* short");
                        }
                        if (val >= Integer.MIN_VALUE && val <= Integer.MAX_VALUE) {
                            System.out.println("* int");
                        }
                        System.out.println("* long");
                    } else {
                        System.out.println(n + " can't be fitted anywhere.");
                    }
                } catch (Exception e) {
                    System.out.println(sc.next() + " can't be fitted anywhere.");
                }
            }
        }
    }
>>>>>>> 5954da2f9d83cbd6fb5168256cf5883545a621e0
}