package kadai3;

/**
 * 0~9の乱数と入力された数値が同じ場合「アタリ！」を表示して終了、はずれの場合「違います」と表示
 */
public class Kadai3_6 {
    public static void main(String[] args) {
        System.out.print("【数あてゲーム】");
        int answer = new java.util.Random().nextInt(10);
        for (int i = 0; i < 5; i++) {
            System.out.println("0~9の数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();
            if (num == answer) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}
