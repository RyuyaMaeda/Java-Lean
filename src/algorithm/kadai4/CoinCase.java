package algorithm.kadai4;

import java.util.HashMap;
import java.util.Map;

/**
 * コインケースのクラス
 * 500円、100円、50円、10円、5円、1円が、それぞれ何枚あるかを管理する。
 */
public class CoinCase {
    /**
     * 貯金箱
     */
    Map<Integer, Integer> coinCase;

    /**
     * 貯金箱を初期化するコンストラクタです。
     */
    public CoinCase() {
        coinCase = new HashMap<>();
        coinCase.put(500, 0);
        coinCase.put(100, 0);
        coinCase.put(50, 0);
        coinCase.put(10, 0);
        coinCase.put(5, 0);
        coinCase.put(1, 0);
    }

    /**
     * 硬貨を追加するメソッドです。
     * 500円、100円、50円、10円、5円、1円以外の硬貨が入った場合は例外を投げる。
     *
     * @param coinType 硬貨の種類
     * @param number   硬貨の枚数
     */
    public void addCoins(int coinType, int number) {
        try {
            coinCase.put(coinType, coinCase.get(coinType) + number);
        } catch (NullPointerException e) {
            System.out.println("500 円、100 円、50 円、10 円、5 円、1 円以外の硬貨は追加できません");
        }
    }

    /**
     * 指定した硬貨が何枚あるかを取得するメソッドです。
     *
     * @param coinType 硬貨の種類
     * @return 指定した硬貨の枚数を返す。
     */
    public int getCount(int coinType) {
        return coinCase.get(coinType);
    }

    /**
     * 硬貨の総額を取得するメソッドです。
     *
     * @return 硬貨の総額を返す。
     */
    public int getAmount() {
        int sum = 0;
        for (int key : coinCase.keySet()) {
            sum += key * coinCase.get(key);
        }
        return sum;
    }
}
