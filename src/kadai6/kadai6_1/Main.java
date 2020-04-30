package kadai6.kadai6_1;
import kadai6.kadai6_1.comment.Zenhan;
/**
 * デフォルトパッケージに属するMainクラスからcommentパッケージに属する各クラスのメソッドを呼び出す
 * commentパッケージに属するZenhanクラスを作成
 * commentパッケージに属するKouhanクラスを作成
 * デフォルトパッケージに属するMainクラスにはmainメソッドのみを残し、クラスの先頭にはZenhanクラスだけをインポート
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Zenhan.doWarusa();
        Zenhan.doTogame();
        kadai6.kadai6_1.comment.Kouhan.callDeae();
        kadai6.kadai6_1.comment.Kouhan.showMondokoro();
    }
}