package kadai17.kadai17_4;

import java.io.IOException;

/**
 * 練習問題17-4
 * 起動直後にIOExceptionを送出して異常終了するようなプログラムを作成する
 */
public class Main {
    public static void main(String[] args) throws IOException {
        throw new IOException();
    }
}
