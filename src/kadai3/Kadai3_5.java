package kadai3;

/**
 * 入力された数値（1~4）に応じて表示させる文字列を変える
 */
public class Kadai3_5 {
    public static void main (String[] args) {
        System.out.print(" [メニュー] 1:検索 2:登録 3:削除 4:変更>");
        int selected = new java.util.Scanner(System.in).nextInt();
        switch (selected) {
            case 1:
                System.out.println("検索します");
                break;
            case 2:
                System.out.println("登録します");
                break;
            case 3:
                System.out.println("削除します");
                break;
            case 4:
                System.out.println("変更します");
                break;
        }
    }
}
