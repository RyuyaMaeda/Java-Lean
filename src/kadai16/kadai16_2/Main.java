package kadai16.kadai16_2;

import java.util.List;
import java.util.ArrayList;

/**
 * 練習問題16-2
 * 二人の勇者（斎藤、鈴木）をHeroとしてインスタンス化してArrayListに格納
 * 一人ずつ順番に取り出して名前を表示するプログラムを作成
 */
public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("斎藤");
        Hero hero2 = new Hero("鈴木");
        List<Hero> heroes = new ArrayList<Hero>();
        heroes.add(hero1);
        heroes.add(hero2);
        for (Hero hero : heroes) {
            System.out.println(hero.getName());
        }
    }
}
