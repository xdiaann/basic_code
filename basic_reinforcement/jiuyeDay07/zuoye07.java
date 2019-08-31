package jiuyeDay07;

public class zuoye07 implements Runnable {
  //  问题：给出以下代码，请问该程序的运行结果是什么?如有问题，请说明原因。
        public static void main(String[] args) {
            Thread t = new Thread(new zuoye07());
            t.start();
        }



    @Override
    public void run() {
        for (int i = 0; i < 99; i++) {
            System.out.println(i);
    }
}

}
