package kadai5;

/**
 * 以下の仕様を参考にメソッド「calcTriangleArea」と「calcCircleArea」を定義し、mainメソッドから呼び出す
 * メソッド名：calcTriangleArea
 * 戻り値の型：double
 * 引数リスト：「三角形の底辺の長さ」、「三角形の高さ」
 * 処理内容：三角形の面積を求めて、それを戻す
 *
 * メソッド名：calcCircleArea
 * 戻り値の型：double
 * 引数リスト：「円の半径」
 * 処理内容：円の面積を求めて、それを戻す
 */
public class Kadai5_4 {
    public static void main(String[] args) {
        double bottom = 10.0;
        double height = 5.0;
        double radius = 5.0;
        double triangleArea = calcTriangleArea(bottom, height);
        double circleArea = calcCircleArea(radius);
        System.out.println
                ("底辺の長さ" + bottom + "cm、高さ" + height + "cmの三角形の面積は、" + triangleArea + "平方cm");
        System.out.println( "半径" + radius + "cmの円の面積は、" + circleArea + "平方cm");
    }

    public static double calcTriangleArea(double bottom, double height) {
        double area = bottom * height * 0.5;
        return area;
    }

    public static double calcCircleArea(double radius) {
        double pi = 3.14;
        double area = pi * radius * radius;
        return area;
    }
}
