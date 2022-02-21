import java.util.Comparator;

public class CompareStudent implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        if(s1.getAge() + s1.getIq() > s2.getAge() + s2.getIq()){
            return s1.getAge() + s1.getIq() - s2.getAge() + s2.getIq();
        }else if (s1.getAge() + s1.getIq() < s2.getAge() + s2.getIq()){
            return s2.getAge() + s2.getIq() - s1.getAge() + s1.getIq();
        }else if (Math.abs(s1.getWeight() + s1.getHeight() - s2.getHeight() - s2.getWeight()) < App.eps){
            return 0;
        }else if(s1.getWeight() + s1.getHeight() - s2.getHeight() - s2.getWeight() > 0){
            return 1;
        }else{
            return -1;
        }
    }
}
