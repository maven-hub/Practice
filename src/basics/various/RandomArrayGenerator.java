package basics.various;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayGenerator {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int tmp = random.nextInt(10) + 1;
            array[i] = tmp;
        }

        System.out.println("Twoja wygenerowana tablica liczb: " + Arrays.toString(array));

        int[] summarum = new int[10];

        for (int value : array) {
            switch (value) {
                case 1: summarum[0]++; break;
                case 2: summarum[1]++; break;
                case 3: summarum[2]++; break;
                case 4: summarum[3]++; break;
                case 5: summarum[4]++; break;
                case 6: summarum[5]++; break;
                case 7: summarum[6]++; break;
                case 8: summarum[7]++; break;
                case 9: summarum[8]++; break;
                case 10: summarum[9]++; break;
            }
        }

        int counter1 = 1;
        int counter2 = 0;

        for (int i = 0; i < summarum.length; i++) {
            System.out.println("Ilość wystąpień liczby " + counter1 + ": " + summarum[counter2]);
            counter1++;
            counter2++;
        }
    }
}
