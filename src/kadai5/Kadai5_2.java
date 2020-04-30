package kadai5;

/**
 * 以下の仕様を参考にメソッド「email」を定義し、mainメソッドから呼び出す
 * メソッド名：email
 * 戻り値の型：なし
 * 引数リスト：「メールのタイトル」、「メールの宛先アドレス」、「メールの本文」
 * 処理内容：以下の形式で表示を行う
 * 　　　　「メールの宛先アドレス」に、以下のメールを送信しました
 * 　　　　　件名：「メールのタイトル」
 * 　　　　　本文：「メールの本文」
 */
public class Kadai5_2 {
    public static void main(String[] args) {
        String title = "test";
        String address = "nanasi@gmail.com";
        String text = "テストメールを送信しました";
        email(title, address, text);
    }
    public static void email (String title, String address, String text) {
        System.out.println(address + "に、" + "以下のメールを送信しました");
        System.out.println("件名:" + title);
        System.out.println("本文:" + text);
    }
}
