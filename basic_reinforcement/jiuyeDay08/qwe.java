package jiuyeDay08;

import java.io.File;

public class qwe {
    public static void main(String[] args) {
        updateFileNames("G:\\", "g");
    }

    public static void updateFileNames(String url, String index) {
        File file = new File(url);
        //判断文件目录是否存在，且是文件目录，非文件
        if (file.exists() && file.isDirectory()) {
            File[] childFiles = file.listFiles();
            String path = file.getAbsolutePath();
            for (File childFile : childFiles) {
                //如果是文件
                if (childFile.isFile()) {
                    String oldName = childFile.getName();
                    System.out.println("oldName:  " + oldName);
                    String newName = oldName.substring(oldName.lastIndexOf(index));
                    System.out.println("newName:  " + newName);
                    childFile.renameTo(new File(path + "\\" + newName));
                }
            }
        }
    }
}
