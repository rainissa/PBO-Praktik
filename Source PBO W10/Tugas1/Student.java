public class Student<T> {
    private int studentID;
    private String name;
    private T department;
    private String address;

    public Student(int studentID, String name, T department, String address){
        this.studentID = studentID;
        this.name = name;
        this.department = department;
        this.address = address;
    }

    public int getStudentID(){
        return studentID;
    }
    public String getName(){
        return name;
    }
    public T getDepartment(){
        return department;
    }
    public String getAddress(){
        return address;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    public void setName(String name){
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public void setDepartment(T department){
        this.department = department;
    }
    public void setAddress(String address){
        this.address = address;
    }

    @Override 
    public String toString() {
        return "ID: " + studentID + " | Nama: " + name 
        + " | Jurusan: " + department + " | Alamat: " + address;
    }
}