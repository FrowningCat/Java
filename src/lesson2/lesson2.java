package lesson2;

import java.util.Arrays;
import java.util.Random;

public class lesson2 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        int[] newArr = new int[10];
        for (int i = 0; i < newArr.length; i++){
            newArr[newArr.length - i - 1] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));

        String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            s += Character.toString(i);
        }
        System.out.println(System.currentTimeMillis() - start);

        StringBuilder stringBuilder = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            stringBuilder.append(Character.toString(i));
        }
        System.out.println(System.currentTimeMillis() - start);

        String str = "Wello world";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());

        String str2 = "Wello";
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i < str2.length(); i++){
            sb2.append(str2.charAt(str2.length() - i - 1));
        }
        System.out.println(sb2.toString());
    }
}
