package 基础和基础加强.day06;

public class Coder {
    String name;
    int id;
    int salary;

    public Coder() {
    }

    public Coder(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void work() {
        System.out.println("员工上班工作啦");
    }

    public void print() {
        System.out.println("工号为" + id + "5基本工资为" + salary + "的程序员正在努力的写着代码......");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
