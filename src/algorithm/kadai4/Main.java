package algorithm.kadai4;

/**
 * 500円、100円、50円、10円、5円、１円が、それぞれ何枚あるかを管理する貯金箱をイメージしたクラス、CoinCaseを作成
 * CoinCaseは指定した硬貨の追加を行うaddCoins()、指定した硬貨の枚数を取得するgetCount()、硬貨の総額を取得するgetAmount()を持つ。
 * 500円、100円、50円、10円、5円、１円以外の硬貨が入った場合は例外を投げる。
 */
public class Main {
    public static void main(String[] arg) {
            CoinCase coinCase = new CoinCase();
            coinCase.addCoins(500, 1);
            coinCase.addCoins(100, 4);
            coinCase.addCoins(5, 6);
            coinCase.addCoins(10, 8);
            coinCase.addCoins(50, 3);
            coinCase.addCoins(500, 4);
            coinCase.addCoins(1, 3);
            coinCase.addCoins(50, 3);
            coinCase.addCoins(50, 1);
            coinCase.addCoins(50, 3);
            System.out.println("指定した硬貨の枚数は" + coinCase.getCount(700) + "枚です");
            System.out.println("貯金箱に入っているお金の総額は" + coinCase.getAmount() + "円です");
    }
}
