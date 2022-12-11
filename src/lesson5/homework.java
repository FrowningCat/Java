package lesson5;

import java.util.*;

public class homework {

    public static String listCopy;

    public static void main(String[] args) {

//      Создать словарь HashMap. Обобщение <Integer, String>.
        Scanner cons = new Scanner(System.in);
        System.out.print("Введите количество цветов - ");
        int quantity = cons.nextInt();
        HashMap<Integer, String> color = new HashMap<>();

//      Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        for (int i = 0; i < quantity; i++){
            System.out.print("Введите название цвета - ");
            String colo = cons.next();
            color.put(i, colo);
        }

//      Изменить значения дописав восклицательные знаки.
        for (int i = 0; i < quantity; i++){
            listCopy = color.get(i);
            color.replace(i, listCopy + "!");
            listCopy = "";
        }

        ArrayList<String> values = new ArrayList<>(color.values());
        System.out.println("Значения: " + values);

//      *Создать TreeMap, заполнить аналогично
        TreeMap<Integer, String> map = new TreeMap<>();
        System.out.print("Введите количество цветов - ");
        int x = cons.nextInt();

        for (int i = 0; i < x; i++){
            System.out.print("Введите название цвета - ");
            String colo = cons.next();
            map.put(i, colo);
        }

        ArrayList<String> val = new ArrayList<>(map.values());
        System.out.println("Значения: " + val);

//      *Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
        for (int i = 0; i < 1001; i++){
            int a = new Random().nextInt(1000);
            map.put(a, "blue");
        }

    }

}