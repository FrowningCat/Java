package lesson6;

import java.util.Random;
import java.util.TreeSet;
import java.util.Set;

public class homework {

    public static set sett = new set();

//    Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел. -

    public static void main(String[] args) {

        //Объявить и инициализировать TreeSet использующий ваш компаратор.
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            int a = new Random().nextInt(1000);
            sett.methodAdd(a);
            treeSet.add(a);
        }

        System.out.println(sett.methodRead());
        //Добавить несколько эллементов в сет и вывести в консоль.
        System.out.println(treeSet);

    }
}