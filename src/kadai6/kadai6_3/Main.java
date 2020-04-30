package kadai6.kadai6_3;
import kadai6.kadai6_3.comment.Zenhan;
/**
 * commentパッケージのKouhanクラスにあるshowMondokoroメソッドの修正
 * 修正内容：「この紋所が目に入らぬか！」の後に３秒間の待ち時間を入れる
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Zenhan.doWarusa();
        Zenhan.doTogame();
        kadai6.kadai6_3.comment.Kouhan.callDeae();
        kadai6.kadai6_3.comment.Kouhan.showMondokoro();
    }
}