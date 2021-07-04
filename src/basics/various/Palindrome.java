package basics.various;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Which word would you like me to check for you? ");
            String input = scanner.nextLine();

            int forward = 0;
            int backward = input.length() - 1;

            boolean flag = true;

            while (backward > forward) {
                char forChar = input.charAt(forward++);
                char bacChar = input.charAt(backward--);

                if (forChar != bacChar) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("\nThe word " + input + " is a palindrome\n");
            } else {
                System.out.println("\nThe word " + input + " is not a palindrome\n");
            }

            System.out.println("Try again... \n");

        } while (true);
    }
}