package basics.various;

import java.util.Scanner;

public class MinMaxCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną ilość liczb -  0 kończy program.");
        int input;
        int numCounter = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        do {
            input = scanner.nextInt();
            if (input != 0) {
                numCounter++;
                if (input > max) {
                    max = input;
                }
                if (input < min) {
                    min = input;
                }
            }

        } while (input != 0);

        double delta = max - min;
        double deltaMean = delta / 2;

        System.out.println("Number of inputs: " + numCounter);
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
        System.out.println("Min Max Delta: " + delta);
        System.out.println("Delta arithemtic mean: " + deltaMean);
    }
}
