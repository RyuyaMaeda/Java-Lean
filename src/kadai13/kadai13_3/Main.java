package kadai13.kadai13_3;

/**
 * 練習問題13-3
 * 練習問題13-1のプログラムにgetterとsetterを追加
 */
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.setName("勇者");
        h.setHp(100);
        Wand wand = new Wand();
        wand.setName("鉄の杖");
        wand.setPower(80);
        Wizard wizard = new Wizard();
        wizard.setHp(70);
        wizard.setMp(200);
        wizard.setName("ブラックマジシャン");
        wizard.setWand(wand);
        wizard.heal(h);
    }
}
