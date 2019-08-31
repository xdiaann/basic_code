package jiuyeDay08;

import java.io.File;

public class 批量修改文件名称_lastIndexOf_substring {
    public static void main(String[] args) {
        File file = new File("E:\\");
        //获取指定目下所有的文件
//        getAllFile(file);
        //获取java文件
//        getJavaFile(file);
        //批量修改文件名称_lastIndexOf_substring
        getJavaFile2(file);
    }

    private static void getJavaFile2(File file) {
//        File[] files = file.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory() || pathname.getName().endsWith(".java");
//            }
//        });
        File[] files = file.listFiles((File pathname) -> pathname.isDirectory() || pathname.getName().endsWith(".avi"));
        //遍历筛选后的
        assert files != null;
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f);
                //如果是文件，则必定是指定后缀的文件，因为经过了筛选
                String name = f.getName();
                int i = name.lastIndexOf("[");
//                System.out.println(i);
                if (i>0){
                    String substring = name.substring(0, i);
//                System.out.println(substring);
                    f.renameTo(new File(file+"\\"+substring+".avi"));
                }
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
                if (name.endsWith(".avi")) {
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

