package jiuyeDay10;

import java.io.*;
import java.util.ArrayList;

public class ObjOutInStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化 和反序列化
//        序列化和反序列化1();
        序列化和反序列化2();
    }

    private static void 序列化和反序列化2() throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
        ArrayList<Person> pList = new ArrayList<>();
        pList.add(new Person("亚马逊", 18));
        pList.add(new Person("圣骑士", 19));
        pList.add(new Person("野蛮人", 17));
        oos.writeObject(pList);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
//        System.out.println(ois.readObject());  //[Person{name='亚马逊', age=0}, Person{name='圣骑士', age=0}, Person{name='野蛮人', age=0}]
        ArrayList<Person> list = (ArrayList<Person>) ois.readObject();
        for (Person person : list) {
            System.out.println(person);
        }
        ois.close();

    }

    private static void 序列化和反序列化1() throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
        Person person = new Person("亚马逊", 18);
        Person person1 = new Person("圣骑士", 19);
        Person person2 = new Person("野蛮人", 17);
        oos.writeObject(person);
        oos.writeObject(person1);
        oos.writeObject(person2);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
//        Object o = ois.readObject();
//        System.out.println(o);//Person{name='亚马逊', age=0}

       /* System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject()); java.io.EOFException*/
        try {
            while (true) {
                System.out.println(ois.readObject());
            }
        } catch (IOException e) {
            System.out.println("运行结束了");
        }
        ois.close();
    }
}
