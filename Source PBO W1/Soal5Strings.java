<<<<<<< HEAD
import java.util.Scanner;

public class Soal5Strings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNext()) return;
            String A = sc.next();
            String B = sc.next();

            System.out.println(A.length() + B.length());

            if (A.compareTo(B) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
            String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
            System.out.println(capA + " " + capB);
        }
    }
=======
import java.util.Scanner;

public class Soal5Strings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNext()) return;
            String A = sc.next();
            String B = sc.next();

            System.out.println(A.length() + B.length());

            if (A.compareTo(B) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
            String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
            System.out.println(capA + " " + capB);
        }
    }
>>>>>>> 5954da2f9d83cbd6fb5168256cf5883545a621e0
}