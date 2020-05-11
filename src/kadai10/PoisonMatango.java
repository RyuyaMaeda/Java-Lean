package kadai10;

/**
 * 練習問題10-3
 * 親クラス Matango.java を利用し、仕様にそった子クラスの作成
 */

public class PoisonMatango extends Matango {
    int poisonCount = 5;

    public void attack(Hero h) {
        super.attack(h);
        if (this.poisonCount > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int damage = h.hp / 5;
            h.hp -= damage;
            System.out.println(damage + "ポイントのダメージ！");
            this.poisonCount--;
        }
    }

    public PoisonMatango(char suffix) {
        super(suffix);
    }
}