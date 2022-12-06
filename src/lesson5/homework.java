package lesson5;

import java.util.ArrayList;
import java.util.Scanner;

public class homework {

    static ArrayList<String> list_name = new ArrayList<>();
    static ArrayList<String> list_surname = new ArrayList<>();
    static ArrayList<String> list_patronymic = new ArrayList<>();
    static ArrayList<Integer> list_age = new ArrayList<>();
    static ArrayList<Boolean> list_gender = new ArrayList<>();

    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);

        System.out.print("Введите количесвто поьзователей - ");
        int numerUsers = cons.nextInt();
        repit(numerUsers);
    }

    static void repit(int numer){
        for(int i = 0; i < numer; i++){
            Scanner cons = new Scanner(System.in);

            System.out.print("Введите ФИО пользователя, через '_' - ");
            String fioUsers = cons.next();
            separation(fioUsers);

            System.out.print("Введите возраст поьзователя - ");
            int ageUsers = cons.nextInt();
            age(ageUsers);

            System.out.print("Введите пол поьзователя, F или M - ");
            String genderusers = cons.next();
            sex(genderusers);
        }
    }

    static void separation(String fio){
        String[] fio1 = fio.split("_");
        list_surname.add(fio1[0]);
        list_name.add(fio1[1]);
        list_patronymic.add(fio1[2]);
    }

    static void age(int age){
        list_age.add(age);
    }

    static void sex(String genfer){
        if(genfer.contains("F")){
            list_gender.add(true);
        }
        else{
            list_gender.add(false);
        }
    }
}