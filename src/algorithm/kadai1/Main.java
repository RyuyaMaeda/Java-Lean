package algorithm.kadai1;

/**
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
        System.out.println(year + "年の干支は" + getNameByYear(year));
    }

    /**
     * 西暦から干支の名前を求めるメソッドです。
     *
     * @param year 西暦
     * @return 干支の名前を返す
     */
    public static String getNameByYear(int year) {
        String name;
        switch (year % 12) {
            case 0:
                name = "申";
                break;
            case 1:
                name = "酉";
                break;
            case 2:
                name = "戌";
                break;
            case 3:
                name = "亥";
                break;
            case 4:
                name = "子";
                break;
            case 5:
                name = "丑";
                break;
            case 6:
                name = "寅";
                break;
            case 7:
                name = "卯";
                break;
            case 8:
                name = "辰";
                break;
            case 9:
                name = "巳";
                break;
            case 10:
                name = "午";
                break;
            case 11:
                name = "未";
                break;
            default:
                throw new IllegalArgumentException("引数に負の値が渡されているため、該当する干支がありません");
        }
        return name;
    }
}
