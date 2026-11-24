import java.util.*;

public class StudentApp{
    public static void main(String[] args) {
        ArrayList<Student<?>> studentList = new ArrayList<Student<?>>();
        studentList.add(new Student<String>(101, "Rina", "Computer Science", "Bandung"));
        studentList.add(new Student<Integer>(102, "Budi", 2, "Jakarta"));
        studentList.add(new Student<String>(103, "Andi", "Computer Science", "Surabaya"));
        studentList.add(new Student<String>(104, "Dewi", "Management", "Yogyakarta"));
        studentList.add(new Student<Integer>(105, "Citra", 1, "Semarang"));

        System.out.println("=== Sebelum di-sort ===");
        for (Student<?> s : studentList){
            System.out.println(s);
        }

        Collections.sort(studentList, new Comparator<Student<?>>() {
            @Override
            public int compare(Student<?> a, Student<?> b) {
                return a.getName().compareTo(b.getName());
            }
        });
        System.out.println("\n=== Sesudah di-sort berdasarkan nama ===");
        for (Student<?> s : studentList){
            System.out.println(s);
        }

        Vector<Student<?>> studentVector = new Vector<Student<?>>();
        studentVector.add(new Student<String>(201, "Eko", "Computer Science", "Bandung"));
        studentVector.add(new Student<Integer>(202, "Fani", 1, "Bogor"));
        studentVector.add(new Student<String>(203, "Gita", "Accounting", "Depok"));
        studentVector.add(new Student<String>(204, "Hadi", "Computer Science", "Malang"));
        studentVector.add(new Student<Integer>(205, "Indra", 3, "Medan"));

        System.out.println("\n=== Mahasiswa jurusan Computer Science ===");
        for (Student<?> s : studentVector){
            if (isComputerScience(s)){
                System.out.println(s);
            }
        }
    }
    private static boolean isComputerScience(Student<?> s){
        Object dept = s.getDepartment();
        if (dept instanceof String){
            return ((String) dept).equalsIgnoreCase("Computer Science");
        } else if (dept instanceof Integer) {
            return (Integer) dept == 1;
        }
        return false;
    }
}