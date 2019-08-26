//package 基础和基础加强.测试题.测试题02;
//
//import java.util.ArrayList;
//
//public class test {
//    public static void main(String[] args) {
//        ArrayList<Student> list=new ArrayList<>();
//        Student stu1=new Student("李强",88,99);
//        Student stu2=new Student ("张强",85,78);
//        Student stu3=new Student ("谢强",86,50);
//        list.add(stu1);
//        list.add(stu2);
//        list.add(stu3);
//        System.out.println("111");
//
//        ArrayList<Student> list1= getSum(list);
//        System.out.println("122");
//        for (int i = 0; i < list1.size(); i++) {
//
//            Student student = list1.get(i);
//            student.show();
//
//        }
//    }
//    public static ArrayList<Student> getSum(ArrayList<Student> list){
//        ArrayList<Student> list1=new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            Student s=list.get(i);
//            if((s.getMath()+s.getChinese())>160){
//                list1.add(s);
//            }
//
//        }
//        return list1;
//    }
//}
