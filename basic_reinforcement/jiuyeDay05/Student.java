package jiuyeDay05;

public class Student {
    private String name;
    private int score;



    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) throws ScoreOutOfBoundsException {
        if (score<0){
            throw new ScoreOutOfBoundsException("分数不能为负数"+score);
        }else {
            System.out.println("分数为"+score);
        }
        this.score=score;
    }

}
