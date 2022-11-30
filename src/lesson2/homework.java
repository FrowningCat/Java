package lesson2;

public class homework {
    public static void main(String[] args) {
//        Напишите программу, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.
//        void string + String string ---- Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга.
//        void revers + String reverse ---- Напишите программу, чтобы перевернуть строку с помощью рекурсии.
//        void append ---- Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59, 3 – 56 = -53, 3 * 56 = 168 Используем метод StringBuilder.append().
//        void insert ---- Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
//        void replace ---- Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
//        void time ---- Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

        string();
        revers();
        append();
        insert();
        replace();
        time();
    }
    public static void string()
    {
        String str1 ="zakat";
        String str2 ="takaz";
        String strRev = string(str2);
        if ((str1).indexOf(strRev) != -1)
        {
            System.out.println("Задание 2: Строка "+str2+" являеться вращением " + str1);
        }
        else
        {
            System.out.println("Задание 2: Строка "+str2+" не являеться вращением " + str1);
        }
    }

    public static String string(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void revers()
    {
        String str1 = "zakat";
        String str2 = str1;
        str1 = reverse(str1);

        System.out.println("Задание 3: "+str2+" - " + str1);
    }

    private static String reverse(String str)
    {
        if (str == null || str.equals("")) {
            return str;
        }

        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }

    public static void append()
    {
        StringBuilder stringBuilder1 = new StringBuilder();
        int a = 3;
        int b = 56;
        stringBuilder1.append(a+ "+" +b+ "=" +(a+b)+ ", ")
                .append(a+ "-" +b+ "=" +(a-b)+ ", ")
                .append(a+ "*" +b+ "=" +(a*b));
        System.out.println("Задание 4: " +stringBuilder1);
    }

    private static void insert()
    {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("30 + 30 = 60");
        for (int index = 0; index < stringBuilder1.length(); index++) {
            if (stringBuilder1.charAt(index) == '=') {
                stringBuilder1.deleteCharAt(index);
                stringBuilder1.insert(index,"равно");
            }
        }
        System.out.println("Задание 5: " +stringBuilder1);
    }

    private static void replace()
    {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("25 + 25 = 50");
        stringBuilder1.replace(stringBuilder1.indexOf("="), stringBuilder1.indexOf("=")+1, "равно") ;
//        String stringBuilder2 = stringBuilder1.toString().replace("=", "равно");
        System.out.println("Задание 6: " +stringBuilder1);
    }


    public static void time()
    {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();
        for (int i = 0; i < 10000; i++){
            stringBuilder1.append("=");
            stringBuilder3.append("=");
        }

        long start = System.currentTimeMillis();
        String stringBuilder2 = stringBuilder1.toString().replace("=", "равно ");
        System.out.println("Задание 7: ");
        System.out.println("string: "+ (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            stringBuilder3.replace(stringBuilder3.indexOf("="), stringBuilder3.indexOf("=")+1, "равно");
        }
        System.out.println("stringBuilder: "+ (System.currentTimeMillis() - start));
    }
}
