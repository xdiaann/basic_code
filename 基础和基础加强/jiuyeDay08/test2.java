package 基础和基础加强.jiuyeDay08;

import java.io.File;

public class test2 {
    public static void main(String[] args) {
        //获取指定目下所有的文件
        File file = new File("F:\\Java基础加强2018年双元视频");
        getAllFile(file);
    }

    private static void getAllFile(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getAllFile(f);
            } else {
                String name = f.getName();
                if (name.endsWith(".java")) {
                    System.out.println(name);
                }
            }
        }
    }
}


