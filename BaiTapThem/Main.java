package BaiTapThem;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Exception{
        int n = 3;
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("AB1111111","Tran Minh Quan"));
        list.add(new Student("AB3333333","Tran Minh Khoa"));
        list.add(new Student("AB2222222","Tran Minh Duy"));

        list.sort(new StudentComparator());
        for(int i=0;i<n;i++){
            Student st = new Student();
            st.input();
            list.add(st);
        }
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).output());
        }

    }
}

