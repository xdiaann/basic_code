package 测试题.测试题02;

public class Student {
    private String name;
    private int Chinese;
    private int math;

    public Student() {
    }

    public Student(String name, int chinese, int math) {
        this.name = name;
        Chinese = chinese;
        this.math = math;
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

    void show(){
        System.out.println("姓名："+getName()+",语文和数学成绩总和："+(getChinese()+getMath()));
    }
}
