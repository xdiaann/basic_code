package 基础和基础加强.day04;

import java.util.Scanner;

public class 计算BMI {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("请输入身高(m)：");
        double 身高 = a.nextDouble();
        Scanner b=new Scanner(System.in);
        System.out.println("请输入体重(kg)：");
        double 体重 = b.nextDouble();
        double bmi = bmi(身高, 体重);
        if (bmi<18.5){
            System.out.println("你的bmi为"+bmi+"，体重过轻！");
        }
        else if (bmi>=18.5&&bmi<24){
            System.out.println("你的bmi为"+bmi+"，体重正常！请继续保持");
        }
        else if (bmi>=24&&bmi<27){
            System.out.println("你的bmi为"+bmi+"，轻度肥胖！适当运动");
        }
        else if (bmi>=27&&bmi<30){
            System.out.println("你的bmi为"+bmi+"，中度肥胖！加强运动");
        }
        else if (bmi>=30&&bmi<35){
            System.out.println("你的bmi为"+bmi+"，重度肥胖！运动吧，死肥宅！");
        }
        else if (bmi>=35){
            System.out.println("你的bmi为"+bmi+"，严重超标！");
        }else {
            System.out.println("数据错误");
        }
    }

    private static double bmi(double 身高,double 体重) {
        double bmi=体重/(身高*身高);
        return bmi;
    }
}
