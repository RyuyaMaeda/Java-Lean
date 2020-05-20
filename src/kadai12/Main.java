package kadai12;

/**
 * 練習問題12-3
 * 以下のプログラムの作成
 * クラスAとBのインスタンスを一つずつ生成して、要素数２の単一の配列に格納したあと、それぞれのインスタンスのb()をループ処理で呼び出す
 */
public class Main {
    public static void main(String[] args) {
        Y[] yArray = new Y[2];
        yArray[0] = new A();
        yArray[1] = new B();
        for (Y y : yArray) {
            y.b();
        }
    }
}
