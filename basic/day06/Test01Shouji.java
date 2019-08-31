package day06;

public class Test01Shouji {
    public static void main(String[] args) {
        Shouji s = new Shouji();
        System.out.println(s.yanse = "ss");
        s.jiage = 199;
        s.size = 6;

        s.play();
        s.call("丽丽");
        s.message("丽丽");

        Shouji s1 = new Shouji();
        s1.jiage = 299;
        s1.size = 7;
        System.out.println(s1.jiage);
        s1.call("mingming");
        System.out.println("=========");
        yinyong(s);
    }

    public static void yinyong(Shouji s) {
        System.out.println(s.jiage);
    }


}
