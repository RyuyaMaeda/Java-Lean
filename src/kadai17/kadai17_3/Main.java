package kadai17.kadai17_3;

/**
 * 練習問題17-3
 * Integer.parseIntメソッドを実行し、文字列”三”の変換結果をint型変数iに代入するときに正しく例外処理する
 */
public class Main {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("三");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException例外をcatchしました");
        }
    }
}
