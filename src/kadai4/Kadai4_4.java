package kadai4;

/**
 * int型の配列numbersをつくり、入力された数値が配列の各要素と一致するかどうか調べる
 */
public class Kadai4_4 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 9};
        System.out.println("１桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (input == numbers[i]) {
                System.out.println("アタリ！");
            }
        }
    }
}
