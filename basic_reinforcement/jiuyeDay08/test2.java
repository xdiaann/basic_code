package jiuyeDay08;

import java.io.File;

public class test2 {
    public static void main(String[] args) {
        //获取指定目下指定后缀的所有的文件
        File file = new File("F:\\");
       getAllFile(file);
    }

    private static void getAllFile(File file) {
        System.out.println("file:"+file);
        File[] files = file.listFiles();
            for (File f : files) {
                if (f.isDirectory()) {
                    getAllFile(f);
                } else {
                    String name = f.getName();
                    if (name.endsWith(".mp4")||name.endsWith(".avi")) {
                        System.out.println(name);
                    }
                }
            }

    }
}


