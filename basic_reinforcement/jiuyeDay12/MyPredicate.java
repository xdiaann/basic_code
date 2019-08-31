package jiuyeDay12;

import java.io.File;
import java.util.ArrayList;
import java.util.function.Predicate;

public class MyPredicate {
    public static void main(String[] args) {
        File dir = new File("F:\\Java基础加强2018年双元视频\\day03\\视频");
        File[] files = dir.listFiles();
        File[] filter=filter(files,(t)->{
//            return t.getName().endsWith(".java");
            return t.length()>50000;
        });

    }

    public static File[] filter(File[] files, Predicate<File> p) {
        ArrayList<File> list = new ArrayList<>();
        for (File file : files) {
            if(p.test(file)){
                list.add(file);
            }
        }
        return list.toArray(new File[list.size()]);
    }
}
