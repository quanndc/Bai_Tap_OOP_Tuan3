package BaiTapThem;
import java.util.Comparator;
public class StudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getFirstName()+o1.getLastName()).compareTo(o2.getFirstName()+o2.getLastName());
    }
    
}
