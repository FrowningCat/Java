package lesson4;

import java.util.ArrayList;
import java.util.Scanner;
public class lesson4 {
    static Scanner cons = new Scanner(System.in);
    static ArrayList<String> Names = new ArrayList<>();
    static ArrayList<Boolean> genders = new ArrayList<>();
    static ArrayList<Integer> ages = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Введите количество персон: ");
        int numPerson = cons.nextInt();

        while (numPerson > 0){
            enterDate();
            numPerson--;
        }
    }

    public static void enterDate(){
        Scanner tmps1 = new Scanner(System.in);
        System.out.println("Введите фамилию, имя и отчество: ");
        String name = cons.nextLine();
        Names.add(name);

        Scanner tmps2 = new Scanner(System.in);
        System.out.println("Введите пол (мужской/женский): ");
        boolean gender = cons.nextBoolean();
        genders.add(gender);

        Scanner tmps3 = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = cons.nextInt();
        ages.add(age);
    }

}
