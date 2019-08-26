package 基础和基础加强.day09;

public class Student {
    private String name;
    private int Chinese;
    private int math;

    public Student() {
    }

    public Student(String name, int  chinese, int math) {
        this.name = name;
        Chinese = chinese;
        this.math = math;
    }
    public void show(){
        System.out.println("姓名为"+name+"语文分数："
                +Chinese+"数学分数:"+math);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

}
