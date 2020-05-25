package kadai16.kadai16_3;

import kadai16.kadai16_2.Hero;

import java.util.*;

/**
 * 練習問題16-3
 * 練習16-2と同様に二人の勇者をインスタンス化し、各勇者が倒した敵の数（３、７）と勇者をペアでコレクションに格納
 * さらに、一つずつ取り出して以下のような画面表示を行う
 * 「斎藤が倒した敵＝３」
 * 「鈴木が倒した敵＝７」
 */
public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("斎藤");
        Hero hero2 = new Hero("鈴木");
        Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
        heroes.put(hero1, 3);
        heroes.put(hero2, 7);
        for (Hero key : heroes.keySet()) {
            int number = heroes.get(key);
            System.out.println(key.getName() + "が倒した敵＝" + number);
        }
    }
}
