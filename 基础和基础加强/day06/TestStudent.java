package 基础和基础加强.day06;


public class TestStudent {
    public static void main(String[] args) {

        Student stu1 = new Student();
        stu1.setName("赵丽颖");
        stu1.setAge(21);
        System.out.println(stu1.getName()+stu1.getAge());
        Student stu2=new Student("古力娜扎",22);
        System.out.println(stu2.getName()+stu2.getAge());
        stu2.setAge(23);
        System.out.println(stu2.getName()+stu2.getAge());
    }
}
