package algorithm.kadai3;

import java.util.InputMismatchException;
import java.util.Arrays;

/**
 * 演習問題３
 * 整数を 10 回入力し、小さい順に並べ替えて表示するプログラムを作成してください。
 * 整数ではない値が入力された場合は例外を投げて処理を中断し、下記のメッセージをコンソールに表示してください。
 * 表示するメッセージ：不正な値が入力されたため処理を中断しました。値は整数で入力してください。
 */
public class Sort {
    public static void main(String[] args) {
        int[] inputNumbers = new int[10];
        System.out.println("整数を１０個入力してください");
        try {
            for (int i = 0; i < inputNumbers.length; i++) {
                inputNumbers[i] = new java.util.Scanner(System.in).nextInt();
            }
            System.out.println("ソート前：" + Arrays.toString(inputNumbers));
            execute(inputNumbers);
            System.out.println("ソート後：" + Arrays.toString(inputNumbers));
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
