public class Practice1 {

    private String studentName = "amit";
    private int studentId = 34;
    private double studentCgpa = 3.34;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getStudentCgpa() {
        return studentCgpa;
    }

    public void setStudentCgpa(double studentCgpa) {
        this.studentCgpa = studentCgpa;
    }

//    Practice1(String name, int id, double cg)
//    {
//        this.studentName = name;
//        this.studentId = id;
//        this.studentCgpa = cg;
//    }

     void display()
    {
        System.out.println("Student name: "+studentName);
        System.out.println("Student id: "+studentId);
        System.out.println("Student cgpa: "+studentCgpa);
    }

    static void main() {


        Practice1 obj = new Practice1();

        obj.display();

    }
}
