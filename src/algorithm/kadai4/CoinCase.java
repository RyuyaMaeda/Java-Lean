package algorithm.kadai4;

import java.util.HashMap;
import java.util.Map;

public class CoinCase {
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
     *
     * @param coinType 硬貨の種類
     * @param number   硬貨の枚数
     */
    public void addCoins(int coinType, int number) {
        if (coinType != 500 && coinType != 100 && coinType != 50 && coinType != 10 && coinType != 5
                && coinType != 1){
            throw new NullPointerException("500,100,50,10,5,1円以外の硬貨は追加できません。指定値=" + coinType);
        }
            coinCase.put(coinType, coinCase.get(coinType) + number);
    }

    /**
     * 指定した硬貨が何枚あるかを取得するメソッドです。
     *
     * @param coinType 硬貨の種類
     * @return 指定した硬貨の枚数を返す。
     */
    public int getCount(int coinType) {
        if (coinType != 500 && coinType != 100 && coinType != 50 && coinType != 10 && coinType != 5
                && coinType != 1){
            throw new NullPointerException("500,100,50,10,5,1円以外の硬貨は存在しません。指定値=" + coinType);
        }
        int number = coinCase.get(coinType);
        return number;
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
