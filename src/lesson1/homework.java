package lesson1;


import java.util.concurrent.ThreadLocalRandom;

public class homework {
    public static int i, n;
    public static int index = 0;

    public static void main(String[] args) {
        i = ThreadLocalRandom.current().nextInt(-1000, 1000);
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
        int sum = 0;
        while (i < Short.MAX_VALUE){
            if (i % n == 0) {
                sum++;
                i++;
            }
            else {
                i++;
            }
        }

        int[] m1 = new int[sum];
        while (i < Short.MAX_VALUE){
            if (i % n == 0) {
                m1[index] = i;
                index++;
                i++;
            }
            else {
                i++;
            }
        }
        System.out.println(m1);
    }

    public static void notMultiples() {
        int sum = 0;
        int min = Short.MIN_VALUE;
        while (Short.MIN_VALUE < i){
            if (i % n != 0) {
                sum++;
                min++;
            }
            else {
                min++;
            }
        }

        int[] m2 = new int[sum];
        while (Short.MIN_VALUE < i){
            if (i % n != 0) {
                m2[index] = i;
                index++;
                min++;
            }
            else {
                min++;
            }
        }
        System.out.println(m2);
    }
}
