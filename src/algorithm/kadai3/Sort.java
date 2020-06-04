package algorithm.kadai3;

import java.util.InputMismatchException;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] indexNumbers = new int[10];
        System.out.println("整数を１０個入力してください");
        try {
            for (int i = 0; i < indexNumbers.length; i++) {
                indexNumbers[i] = new java.util.Scanner(System.in).nextInt();
            }
            execute(indexNumbers);
            for (int i = 0; i < indexNumbers.length; i++) {
                System.out.println(indexNumbers[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("不正な値が入力されたため処理を中断しました。値は整数で入力してください");
        }
    }

    /**
     * バブルソートで並び替えをするメソッドです
     *
     * @param numbers 配列のポインタ
     */
    public static void execute(int[] numbers) {
        int size = numbers.length;
        for (int i = 0; i < size - 1; i++) {
            boolean swapped = true;
            for (int j = 0; j < size - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                    swapped = false;
                }
            }
            if (swapped == true)
                break;
        }
    }
}
