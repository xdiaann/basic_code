package jiuyeDay05;

public class test {
    public static void main(String[] args) {
//        checkScore(-1);
//        System.out.println("检查完毕");
//        try{
//            String s = "hello";
//            String sub = s.substring(0);
//            System.out.println(sub);
//            s = null;
//        }catch(NullPointerException e){
//            System.out.println("空指针异常");

    }
    private static void checkScore(int score) throws ScoreOutOfBoundsException {
        if(score>100||score<0){
            throw new ScoreOutOfBoundsException("分数超出范围");
        }

    }

}

