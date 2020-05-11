package kadai8.kadai8_3;

/**
 * 練習問題8_2で作成したクラスClericにMPを５消費してHPを最大まで回復するメソッドselfAid()を追加
 */
public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    public void selfAid() {
        if(this.mp >= 5) {
            System.out.println(this.name + "はセルフエイドを唱えた！");
            this.mp -= 5;
            this.hp = this.MAX_HP;
            System.out.println("HPが最大まで回復した");
        } else {
            System.out.println("MPが足りない！");
        }
    }
}
