package day08;
/* 分析以下需求，并用代码实现
        1.键盘录入一个大字符串,再录入一个小字符串
        2.统计小字符串在大字符串中出现的次数
        3.代码运行打印格式:
        请输入大字符串:woaiheima,heimabutongyubaima
        ,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
        请输入小字符串:heima
*/
public class zuoye02 {
    public static void main(String[] args) {
        String str="woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";
        String str1="heima";
        int count=getcount(str,str1);
        System.out.println(count);
    }
    public static int getcount(String str,String str1){
        int count=0;
        int index=str.indexOf(str1);
        while (index!=-1){
            int starIndex=index+str1.length();
            str=str.substring(starIndex);
            index=str.indexOf(str1);
            count++;
        }
        return count;
    }
}
