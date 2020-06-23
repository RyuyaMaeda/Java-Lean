package algorithm.kadai1;

public class Zodiac {

    /**
     * 西暦から干支の名前を求めるメソッドです。
     *
     * @param year 西暦
     * @return 干支の名前を返す
     */
    public String getNameByYear(int year) {
        switch (year % 12) {
            case 0:
                return "申";
            case 1:
                return "酉";
            case 2:
                return "戌";
            case 3:
                return "亥";
            case 4:
                return "子";
            case 5:
                return "丑";
            case 6:
                return "寅";
            case 7:
                return "卯";
            case 8:
                return "辰";
            case 9:
                return "巳";
            case 10:
                return "午";
            case 11:
                return "未";
            default:
                throw new IllegalArgumentException("引数に負の値が渡されているため、該当する干支がありません");
        }
    }
}
