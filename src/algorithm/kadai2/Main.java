package algorithm.kadai2;

public class Main {
    public static void main(String[] args) {
        System.out.println("数値を入力してください");
        //入力された数値からひし形の高さを決定する
        int height = new java.util.Scanner(System.in).nextInt() * 2 - 1;
        int center = height / 2 + 1;
     //   System.out.println("center=" + center);
        // ひし形の上段を表示
        upperDraw(center);
        lowerDraw(center);
    }

    public static void upperDraw(int center) {
        for (int i = 0; i < center; i++) {
            for (int j = 0; j < center - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void lowerDraw(int center) {
        for (int i = center - 2; i >= 0; i--) {
            for (int j = 0; j < center - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
