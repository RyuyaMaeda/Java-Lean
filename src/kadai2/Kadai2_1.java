package kadai2;

/**
 * 演算時の型変換を利用して、画面に「x＋yは15」と表示させるプログラム
 */

public class Kadai2_1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        String answer = "x+yは" + (x + y);
        System.out.println(answer);
    }
}
