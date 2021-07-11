package basics.various;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println("Podaj jakiś tekst do zaszyfrowania szyfrem Cezara...");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Podaj przesunięcie n...");
        int n = scanner.nextInt();

        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] + n) > 122) {
                charArray[i] = (char) (charArray[i] + n - 26);
            } else {
                charArray[i] = (char) (charArray[i] + n);
            }
        }

        System.out.println(charArray);
    }
}
