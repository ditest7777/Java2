package hw2;

import javax.print.DocFlavor;
import java.util.Arrays;

public class hw2 {

    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "ф", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            try {
                int result = sizeArray(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива указан неверно");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Значение в массиве неверно. Ошибка в ячейке: " + e.i + "x" + e.j);

        }

    }


    public static int sizeArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Размер массива указан неверно");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Размер массива указан неверно");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}
