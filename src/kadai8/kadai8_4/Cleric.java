package kadai8.kadai8_4;

/**
 * 練習問題8_3で作成したクラスClericにMPを回復するメソッドpray()を追加
 * 回復量は、祈った秒数に0〜２の補正を加えた量
 * 最大MPよりも回復することはない
 */
public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    public void selfAid() {
        if (this.mp >= 5) {
            System.out.println(this.name + "はセルフエイドを唱えた！");
            this.mp -= 5;
            this.hp = this.MAX_HP;
            System.out.println("HPが最大まで回復した");
        } else {
            System.out.println("MPが足りない！");
        }
    }

    public int pray(int second) {
        System.out.println(this.name + "は祈った！");
        int recover = second + new java.util.Random().nextInt(3);
        int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
        this.mp += recoverActual;
        System.out.println("MPが" + recoverActual + "回復した");
        return recoverActual;
    }
}
