package jiuyeDay03;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> stu=new ArrayList<Student>();
        stu.add(new Student("1",1,1));
        stu.add(new Student("3",3,3));
        stu.add(new Student("2",2,2));
        stu.add(new Student("4",2,4));
        System.out.println(stu);
        Collections.sort(stu);
        System.out.println(stu);

    }


}
