package kadai11.kadai11_2;

/**
 * 練習問題11-2
 * TangibleAsset（有形資産）の親クラスAsset（資産）を開発し、このクラスを継承するようにTangibleAssetを修正
 */
public abstract class TangibleAsset extends Asset {
    String color;

    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
