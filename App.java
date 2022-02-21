public class App {
    public static final double eps = 1e-8;

    public static void main(String[] args) {
        Student stud1 = new Student(18, 77, 66.1f, 192.4f, "Oliver");
        Student stud2 = new Student(19, 76, 91.6f, 183.8f, "Oscar");

        System.out.println(new CompareStudentSimple().compare(stud1, stud2));
        System.out.println(new CompareStudent().compare(stud1, stud2));
    }
}
