package day06;
//某同学参加计算机大赛：（用switch语句）
//		如果获得第1名，将参加清华大学组织的1个月夏令营；
//		如果或得第2名，将奖励联想笔记本电脑一部；
//		如果获得第3名，将奖励移动硬盘一个；
//                否则没有任何奖励；
public class Testkaoshi04 {
    public static void main(String[] args) {
        int num=1;
        switch(num){
            case 1:
                System.out.println("参加清华大学组织的一个月夏令营");
                break;
            case 2:
                System.out.println("将奖励联想笔记本电脑一部");
                break;
            case 3:
                System.out.println("将奖励移动硬盘一个");
                break;
                default:
                    System.out.println("没有任何奖励");
        }

    }
}
