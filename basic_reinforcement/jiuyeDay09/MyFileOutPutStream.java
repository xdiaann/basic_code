package jiuyeDay09;

import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutPutStream {
    public static void main(String[] args) throws IOException{
        //FileOutPutStream fos= new FileOutPutStream（"d:\\a.txt"）
        //1，在内存中创建出FileOutPutStream对象
        //2，如果指定路径不存在指定文件，java会自动创建
        // 如果存在 会将原有文件情况，如果不想清空 可以在在参加后加一个true （"d:\\a.txt",true）
        //3，将内存中的FileOutPutStream对象和制定的文件关联

        FileOutputStream fops = new FileOutputStream("e:\\a.txt",true);
        //如何换行，在需要换行的位置写 \r\n  或者System.lineseparator()返回值
//        fops.write(("别人笑我太疯癫\r\n我笑他人看不穿\r\n不见武林豪杰墓\r\n无花无酒锄作田\r\n").getBytes());

                fopsmethod(fops);
    }

    private static void fopsmethod(FileOutputStream fops) throws IOException {
        //write（int byte）写单个字节数据到指定的文件中
//        fops.write(97); //将a写入a.txt文件中
        //	write （byte【】 bys） 写一个字节数组的数据
                //如果第一个字节是正数（0-127）那么显示的时候会查询ascII表
                //如果第一个字节是负数，那么第一个会和第二个组·成一个中文显示，查询系统默认表（GBK）
        byte[] bytes={104,101,108,108,111};
        fops.write(bytes);//hello
        byte[] bytes2={-104,-101,-108,108,111};
        fops.write(bytes2);//槢攍o
        byte[] bytes3={-104,101,108,-108,111};
        fops.write(bytes3);//榚l攐
        //	byte【】 getBytes（） 将字符串转换为字节数组
        //	write （String.getBytes（））
//        String str="qwedssdlggsl";
//        fops.write(str.getBytes());//qwedssdlggsl
        //写一个字节数组的一部分  off 起始位置 len 长度
//        fops.write(bytes,1,2);
        //释放资源
//        fops.close();
        //资源释放后，就不能进行传输了 会报错
//     fops.write(97);
    }
}
