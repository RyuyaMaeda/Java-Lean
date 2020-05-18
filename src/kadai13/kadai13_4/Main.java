package kadai13.kadai13_4;

/**
 * 練習問題13-4
 * 問題13-3で作成したWizardクラスとWandクラスのsetterについて、次の４つのルールに従って引数の妥当性検証を追加
 * 引数が妥当ではない場合、エラーメッセージを表示する
 * ①魔法使いや杖の名前には、必ず３文字以上を指定
 * ②杖による増幅率は、0.5以上100以下である。
 * ③魔法使いは必ず杖を装備する
 * ④魔法使いのHPとMPは0以上である。ただし、HPについては、負の値をセットしようとしたときは、自動的に0が設定される
 */
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.setName("勇者");
        h.setHp(100);
        Wand wand = new Wand();
        wand.setName("鉄の杖");
        wand.setPower(10);
        Wizard wizard = new Wizard();
        wizard.setHp(50);
        wizard.setMp(200);
        wizard.setName("ブラックマジシャン");
        wizard.setWand(wand);
        wizard.heal(h);
    }
}
