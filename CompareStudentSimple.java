import java.util.Comparator;

public class CompareStudentSimple implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        if(s1.getIq() != s2.getIq()){
            return s1.getIq() - s2.getIq();
        }
        if(s1.getAge() != s2.getAge()){
            return s1.getAge() - s2.getAge();
        }
        return 0;
    }
}
