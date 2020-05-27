package kadai13.kadai13_3;

/**
 * 練習問題13-3(練習問題13-1)
 * 二つのクラスWizard(魔法使い)とWand(杖)に宣言されている全てのフィールドとメソッドについて、アクセス修飾子とgetter、setterを追加
 */
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("勇者");
        hero.setHp(100);
        Wand wand = new Wand();
        wand.setName("鉄の杖");
        wand.setPower(80);
        Wizard wizard = new Wizard();
        wizard.setHp(70);
        wizard.setMp(200);
        wizard.setName("ブラックマジシャン");
        wizard.setWand(wand);
        wizard.heal(hero);
    }
}
