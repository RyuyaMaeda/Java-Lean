package algorithm.kadai1;

/**
 * 西暦から干支を算出するプログラムの作成
 * 西暦はグレゴリオ暦に限定する
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("西暦を入力してください");
        int seireki = new java.util.Scanner(System.in).nextInt();
        switch (seireki % 12) {
            case 0:
                System.out.print(seireki + "年の干支は申です");
                break;
            case 1:
                System.out.print(seireki + "年の干支は酉です");
                break;
            case 2:
                System.out.print(seireki + "年の干支は戌です");
                break;
            case 3:
                System.out.print(seireki + "年の干支は亥です");
                break;
            case 4:
                System.out.print(seireki + "年の干支は子です");
                break;
            case 5:
                System.out.print(seireki + "年の干支は丑です");
                break;
            case 6:
                System.out.print(seireki + "年の干支は寅です");
                break;
            case 7:
                System.out.print(seireki + "年の干支は卯です");
                break;
            case 8:
                System.out.print(seireki + "年の干支は辰です");
                break;
            case 9:
                System.out.print(seireki + "年の干支は巳です");
                break;
            case 10:
                System.out.print(seireki + "年の干支は午です");
                break;
            case 11:
                System.out.print(seireki + "年の干支は未です");
        }
    }
}
