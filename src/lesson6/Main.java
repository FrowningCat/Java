package lesson6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    static set set = new set();
    static String temp;

    public static void main(String[] args) {

        System.out.println(set.methodSize());

        Set<Integer> integers = new HashSet<>();


        for (int i = 0; i < 10; i++) {

            int a = new Random().nextInt(1000);
            System.out.print(a + ",");
            set.methodAdd(a);
            integers.add(a);

        }

        System.out.println();
        System.out.println(set.methodRead());

        for (int a: integers) {
            System.out.print(a + ",");
        }

        Iterator<Integer> abcd = integers.iterator();
        while (abcd.hasNext()){
            int i = abcd.next();
            //abcd.remove();
        }

        integers.forEach(k -> System.out.println(temp = temp + k + " | "));
    }
}
