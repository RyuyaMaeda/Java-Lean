package kadai4;

/**
 * for文と拡張for文を使って配列の要素を一つずつ画面に表示
 */
public class Kadai4_2 {
    public static void main(String[] args) {
        int[] moneyList = {121902, 8302, 55100};
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(moneyList[i]);
        }
        for (int value : moneyList) {
            System.out.println(value);
        }
    }
}
