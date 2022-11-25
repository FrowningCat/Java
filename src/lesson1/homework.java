package lesson1;

import java.util.Random;

public class homework {
    public static int i, n;
    public static int index = 0;

    public static void main(String[] args) {
        i = new Random().nextInt(1000);
        System.out.println(i);

        maxM();
        multiples();
        notMultiples();
    }

    public static void maxM() {
        n = Integer.highestOneBit(i);
        System.out.println(n);
    }

    public static void multiples() {
        int[] m1 = new int[1000000];
        while (i < Short.MAX_VALUE){
            if (i % n == 0) {
                m1[index] = i;
                index++;
            }
            i++;
        }
        System.out.println(m1);
    }

    public static void notMultiples() {
        int[] m2 = new int[100000];
        int min = Short.MIN_VALUE;
        while (Short.MIN_VALUE < i){
            if (i % n != 0) {
                m2[index] = i;
                index++;
            }
            min++;
        }
        System.out.println(m2);
    }
}
