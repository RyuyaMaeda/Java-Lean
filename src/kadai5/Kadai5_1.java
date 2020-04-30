package kadai5;

/**
 * 以下の仕様を参考にメソッド「introduceOneself」を定義し、mainメソッドから呼び出す
 * メソッド名：introduceOneself
 * 戻り値の型：なし
 * 引数リスト：なし
 * 処理内容：名前、年齢、身長、十二支を代入する変数を宣言し、値の代入をする。各変数を利用して自己紹介を表示
 */
public class Kadai5_1 {
    public static void main(String[] args) {
        introduceOneself();
    }
    public static void introduceOneself () {
        String name = "前田";
        int age = 26;
        double height = 183.6;
        char zodiac = '戌';
        System.out.println("私の名前は" + name + "です");
        System.out.println("歳は" + age + "です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("十二支は" + zodiac + "です");
    }
}
