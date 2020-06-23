package algorithm.kadai4;

import java.util.InputMismatchException;

/**
 * 演習問題4
 * 500円、100円、50円、10円、5円、１円がそれぞれ何枚あるかを管理する貯金箱をイメージしたクラス、CoinCaseを作成
 * CoinCaseは指定した硬貨の追加を行うaddCoins()、指定した硬貨の枚数を取得するgetCount()、硬貨の総額を取得するgetAmount()を持つ。
 * 500円、100円、50円、10円、5円、１円以外の硬貨が入った場合は例外を投げる。
 */
public class Main {
    public static void main(String[] arg) {
        try {
            CoinCase myCase = new CoinCase();
            for (int i = 0; i < 10; i++) {
                System.out.println("指定した硬貨の種類は?");
                int kind = new java.util.Scanner(System.in).nextInt();
                System.out.println("指定した硬貨の枚数は?");
                int count = new java.util.Scanner(System.in).nextInt();
                myCase.addCoins(kind, count);
            }
            System.out.println("500円の枚数は" + myCase.getCount(500) + "枚です");
            System.out.println("100円の枚数は" + myCase.getCount(100) + "枚です");
            System.out.println("50円の枚数は" + myCase.getCount(50) + "枚です");
            System.out.println("10円の枚数は" + myCase.getCount(10) + "枚です");
            System.out.println("5円の枚数は" + myCase.getCount(5) + "枚です");
            System.out.println("1円の枚数は" + myCase.getCount(1) + "枚です");
            System.out.println("貯金箱に入っているお金の総額は" + myCase.getAmount() + "円です");
        } catch (InputMismatchException e) {
            System.out.println("不正な値が入力されたため処理を中断しました。値は整数で入力してください");
        }
    }
}
