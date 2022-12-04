package lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class homework {

    public static ArrayList<String> list = new ArrayList<>();
    public static ArrayList<String> listTwo = new ArrayList<>();
    public static void main(String[] args) {
        list();
        listPlas();
        сhange();
        extraction();
        сhangeTwo();
        delete();
        faind();
        newList();
        deleteTwo();
    }

    public static void list(){
        list.add("Не");
        list.add("забыть");
        list.add("сдать");
        list.add("дз");
        list.add("и");
        list.add("напсиасть");
        list.add("приключение");
        list.add("для");
        list.add("D&D");
        System.out.println("Задание 1:" + list);
    }

    public static void listPlas(){
        for (int b = 0; b < list.size();) {
            list.set(b, "!");
            b++;
        }
        System.out.println("Задание 2:" + list);
    }

    public static void сhange(){
        list.add(0, "Изменение");
        System.out.println("Задание 3:" + list);
    }

    public static void extraction(){
        Scanner cons = new Scanner(System.in);
        System.out.print("Задание 4: Введите index: ");
        int index = cons.nextInt();
        if (index < 0 || index > list.size()){
            System.out.println("Введено некоректное число");
        }
        else {
            String element = list.get(index);
            System.out.println(element);
        }
    }

    public static void сhangeTwo(){
        Scanner cons = new Scanner(System.in);
        System.out.print("Задание 5: Введите index: ");
        int index = cons.nextInt();
        if (index < 0 || index > list.size()){
            System.out.println("Введено некоректное число");
        }
        else{
            list.set(index, "Замена");
            System.out.println(list);
        }
    }

    public static void delete(){
        list.remove(1);
        System.out.println("Задание 6:" + list);
    }

    public static void faind(){
        String search = "Замена";
        for (String s : list) {
            if (search.contains(s)) {
                System.out.println("Задание 7:" + "Найден " + search + " в списке");
            }
        }
    }

    public static void newList(){
        for(int i = 0; i < 3; i++){
            String element = list.get(i);
            listTwo.add(element);
        }
        System.out.println("Задание 8:" + listTwo);
    }

    public static void deleteTwo(){
        for (Object o : listTwo) {
            list.remove(o);
        }
        System.out.println("Задание 9:" + list);
    }
}
