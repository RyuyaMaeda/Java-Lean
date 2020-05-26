package kadai17.kadai17_2;

/**
 * 練習問題17-2
 * 練習問題17-1で作成したコードをtry-catch文を用いてスタックトレースを表示する例外処理をするように修正
 */
public class Main {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException例外をcatchしました");
            System.out.println("--スタックトレース（ここから）--");
            e.printStackTrace(System.out);
            System.out.println("--スタックトレース（ここまで）--");
        }
    }
}
