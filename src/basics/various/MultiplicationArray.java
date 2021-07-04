package basics.various;

import java.util.Arrays;

public class MultiplicationArray {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // wypisywanie pojedyńczego wiersza v1
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[5][i] + "\t");
        }

        // wypisywanie pojedyńczego wiersza v2
        System.out.println(Arrays.toString(array[5]));

        // iterowanie po tablicy dwuwymiarowej
        String[][] string2DArray = {{"Ala", "ma", "kota"}, {"A", "kot", "ma", "Alę"}};

        for (int i = 0; i < string2DArray.length; i++) {
            for (int j = 0; j < string2DArray[i].length; j++) {
                System.out.print(string2DArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
