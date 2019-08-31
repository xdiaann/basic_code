package jiuyeDay07;

public class zuoye06 {
    // 请在指定位置插入代码实现打印输出1-99。
    public int start = 1;
    public int end = 99;

    public static void main(String[] args) {

        new zuoye06().method();
    }

    public void method() {
        //请在此处插入代码，实现功能
        Runnable a = new Runnable() {
            @Override
            public void run() {
                for (int start = 1; start <= end; start++) {
                    System.out.println(start);
                }
            }
        };
        Thread t = new Thread(a);
        t.start();
    }
}

