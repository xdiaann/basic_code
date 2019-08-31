package jiuyeDay08;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class MyFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\IDEAproject\\basic-code\\code");

//     getAbsolutePath() 获取File对象所指向的文件或者文件夹的绝对路径
        System.out.println(f1.getAbsoluteFile());

//     getPath() 获取创建File对象的时候传递的路径
        System.out.println(f1.getPath());

//     getName() 获取文件或者文件夹的名称，如果有扩展名会包含扩展名
        System.out.println(f1.getName());

//     length() 获取文件的大小
        System.out.println(f1.length());

        System.out.println(File.separator);
        System.out.println(File.pathSeparator);
        System.out.println("========");
        File f2 = new File("d\\a.txt");
        //exists（） 判断是否存在
        System.out.println(f2.exists());
        //isDirectory（） 判断是否是文件夹
        System.out.println(f2.isDirectory());
        //isFile（） 判断是否是文件
        System.out.println(f2.isFile());
        //createNewFile（） 创建新[文件] 如果父路径不存在 会抛出异常 不能直接创建
//        System.out.println(f2.createNewFile());
        //delete() 删除指定文件或者文件夹 不走回收站 删除文件夹中不能包含有任何内容
        System.out.println(f2.delete());
        //mkdir() 创建单级文件夹 如果父路径不存在 不能直接创建
        System.out.println(f2.mkdir());
        //mkdirs（）创建多级文件夹  可以把父路径一起创建（）推荐
        System.out.println(f2.mkdirs());
        System.out.println("========");

        File f3 = new File("out");
        System.out.println(f3.exists());
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());

        //有参
        method("c:\\", "a.txt");

    }

    private static void method(String parent, String child) {
        System.out.println(new File(parent, child));

    }
}