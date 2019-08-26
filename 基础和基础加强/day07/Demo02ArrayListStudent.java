package 基础和基础加强.day07;

import java.util.ArrayList;

public class Demo02ArrayListStudent {

    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student s1 = new Student("曹操", 11);
        Student s2 = new Student("刘备", 12);
        Student s3 = new Student("孙权", 13);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+list
                    .get(i).getAge());
        }
        //or
        for (int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            System.out.println(s.getName()+s.getAge());
        }


    }
}
