package kadai3;

/**
 * 変数isHungryを定義し、代入された値が0か１かで表示させる内容を変える
 */
public class Kadai3_3 {
    public static void main (String[] args) {
        int isHungry = 1;
        String food = "りんご";
        System.out.println("こんにちは");
        if (isHungry == 0) {
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println("はらぺこです");
            System.out.println(food + "をいただきます");
        }
        System.out.println("ごちそうさまでした");
    }
}
