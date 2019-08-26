package 基础和基础加强.jiuyeDay08;

import java.io.File;
import java.io.FileFilter;

public class zuoye03 {
    public static void main(String[] args) {
        //第三题：使用文件过滤器来打印出D盘下的所有.txt文件名称
        File file = new File("F:\\");
        getTxt(file);

    }

    private static void getTxt(File file) {
        File[] files = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.isDirectory() ||pathname.getName().endsWith(".md");
                }
            });
                if (files==null){
                    return;
                }
                for (File f : files) {
                    if (f.isFile()) {
                System.out.println(f);
            }else {
                getTxt(f);
            }
        }
    }
}
