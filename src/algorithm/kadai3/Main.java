package algorithm.kadai3;

import java.util.InputMismatchException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("整数を１０個入力してください");
        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = new java.util.Scanner(System.in).nextInt();
            }
            BubbleSort.bubbleSort(array);
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("不正な値が入力されたため処理を中断しました。値は整数で入力してください");
        }
    }
}
