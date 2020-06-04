package algorithm.kadai1;

/**
 * 演習問題１
 * 西暦から干支を算出するプログラムの作成
 * 西暦はグレゴリオ暦に限定する
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("西暦を入力してください");
        /**
         * 西暦
         */
        int year = new java.util.Scanner(System.in).nextInt();
        Zodiac zodiac = new Zodiac();
        System.out.println(year + "年の干支は" + zodiac.getNameByYear(year));
    }
}
