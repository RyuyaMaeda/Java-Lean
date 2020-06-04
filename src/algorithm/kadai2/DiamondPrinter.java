package algorithm.kadai2;

/**
 * 演習問題2
 * 以下の条件にしたがって、コンソールにひし形を描画する
 * メソッドの引数にint型の数値を渡すようにする
 * ひし形の高さは引数で渡す値によって変動するようにする
 */
public class DiamondPrinter {
    public static void main(String[] args) {
        System.out.println(createDiamond(1));
        System.out.println(createDiamond(2));
        System.out.println(createDiamond(3));
    }

    /**
     * 指定した値からひし形を文字列で返すメソッドです
     *
     * @param value ひし形の高さを決める値
     * @return ひし形全体のの文字列を返す
     */
    private static String createDiamond(int value) {
        /**
         * ひし形の高さ
         */
        int height = value * 2 - 1;
        return createUpperDiamond(height) + createLowerDiamond(height);
    }

    /**
     * 指定した高さのひし形の上半分を文字列で返すメソッドです
     *
     * @param height ひし形の高さ
     * @return 指定の高さのひし形の上半分の文字列を返す
     */
    private static String createUpperDiamond(int height) {
        String upperString = "";
        int center = height / 2 + 1;
        for (int i = 0; i < center; i++) {
            for (int j = 0; j < center - i; j++) {
                upperString += " ";
            }
            upperString += "*";
            for (int j = 0; j < i * 2; j++) {
                upperString += "*";
            }
            upperString += "\n";
        }
        return upperString;
    }

    /**
     * 指定した高さのひし形の下半分を文字列で返すメソッドです
     *
     * @param height ひし形の高さ
     * @return 指定の高さのひし形の下半分の文字列を返す
     */
    public static String createLowerDiamond(int height) {
        String lowerString = "";
        int center = height / 2 + 1;
        for (int i = center - 2; i >= 0; i--) {
            for (int j = 0; j < center - i; j++) {
                lowerString += " ";
            }
            lowerString += "*";
            for (int j = 0; j < i * 2; j++) {
                lowerString += "*";
            }
            lowerString += "\n";
        }
        return lowerString;
    }
}
