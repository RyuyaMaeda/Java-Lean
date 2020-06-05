package kadai15.kadai15_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 練習文15-4
 * mainメソッドのみを持つクラスMainを定義し、「現在の100日後の日付」を「西暦2020年9月24日」という形式で表示するプログラムをTimeAPIを用いて作成
 */
public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate future = now.plusDays(100);
        DateTimeFormatter formatedDate = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        System.out.println(future.format(formatedDate));
    }
}
