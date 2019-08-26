package 基础和基础加强.jiuyeDay08;

import java.io.File;

public class Recurison2 {
    public static void main(String[] args) {
        File file = new File("F:\\Java基础加强2018年双元视频");
        //获取指定目下所有的文件
//        getAllFile(file);
        //获取java文件
//        getJavaFile(file);
        //获取指定文件下所有的java文件
        getJavaFile2(file);
    }

    private static void getJavaFile2(File file) {
//        File[] files = file.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory() || pathname.getName().endsWith(".java");
//            }
//        });
        File[] files = file.listFiles((File pathname)-> { return pathname.isDirectory() || pathname.getName().endsWith(".java"); });

        //遍历筛选后的
        for (File f : files) {
            if (f.isFile()) {
                //如果是文件，则必定是java文件，因为经过了筛选
                System.out.println(f);
            } else {
                //如果是文件夹，则递归调用
                getJavaFile2(f);
            }
        }
    }

    private static void getJavaFile(File file) {
        //获取file对象数组
        File[] files = file.listFiles();
        //遍历
        for (File f : files) {
            //如果是文件夹 则把该文件夹重新遍历
            if (f.isDirectory()) {
                getJavaFile(f);
            } else {
                String name = f.getName();
                //如果以**后缀结尾
                if (name.endsWith(".java")) {
                    //输出java文件名称
                    System.out.println(name);
                    //输出java绝对路径名称
                    // System.out.println(f);
                }
            }
        }
    }

    private static void getAllFile(File file) {
        System.out.println(file);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                getAllFile(file1);
            }
            System.out.println(file1);
        }
    }
}

