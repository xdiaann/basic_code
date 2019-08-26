package 基础和基础加强.jiuyeDay07;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysLambda {
    public static void main(String[] args) {
        Person[] arr={
                new Person("柳岩",38),
                new Person("迪丽热巴",18),
                new Person("古力娜扎",19),

        };
       /* Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        }
       );*/
        Arrays.sort(arr,(Person o1, Person o2)-> {
                        return o1.getAge()-o2.getAge();
                    }
        );
        //简化模式
        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());
        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
