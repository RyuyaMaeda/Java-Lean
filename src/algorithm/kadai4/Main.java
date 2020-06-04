package algorithm.kadai4;

/**
 * 500円、100円、50円、10円、5円、１円が、それぞれ何枚あるかを管理する貯金箱をイメージしたクラス、CoinCaseを作成
 * CoinCaseは指定した硬貨の追加を行うaddCoins()、指定した硬貨の枚数を取得するgetCount()、硬貨の総額を取得するgetAmount()を持つ。
 * 500円、100円、50円、10円、5円、１円以外の硬貨が入った場合は例外を投げる。
 */
public class Main {
    public static void main(String[] arg) {
        try {
            CoinCase myCase = new CoinCase();
            myCase.addCoins(700, 1);
            myCase.addCoins(100, 4);
            myCase.addCoins(5, 6);
            myCase.addCoins(10, 8);
            myCase.addCoins(50, 3);
            myCase.addCoins(500, 4);
            myCase.addCoins(1, 3);
            myCase.addCoins(50, 3);
            myCase.addCoins(50, 1);
            myCase.addCoins(50, 3);
            System.out.println("指定した硬貨の枚数は" + myCase.getCount(500) + "枚です");
            System.out.println("貯金箱に入っているお金の総額は" + myCase.getAmount() + "円です");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
