package 基础和基础加强.day09;

import 基础和基础加强.day09.Student;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student s1=new Student("李强",88,99);
        Student s2=new Student("张强",85,78);
        Student s3=new Student("谢强",86,50);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            
        }
    }
}
