package day05;

//第四题：分析以下需求并实现
//	1.定义一个用于存放班级分数的数组
//		int[] score = {80,90,85,90,78,88,89,93,98,75};
//	2.求出班级不及格人数(分数低于60分的就是不及格)
//	3.求出班级的平均分
//	4.求出班级的总分数
public class Zuoye04 {
    public static void main(String[] args) throws Exception {
        int[] score = {80, 90, 85, 90, 78, 88, 89, 93, 98, 75, 22, 55, 0, -1};
        int sum = 0;
        int bjg = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] < 0) {
                throw new Exception("成绩不能小于0");
            }
            if (score[i] < 60) {
                bjg++;
            }
            sum += score[i];
        }
        System.out.println("总分数:" + sum);
        System.out.println("平均分：" + (sum / score.length));
        System.out.println("不及格：" + bjg);
    }
}

