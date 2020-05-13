package kadai11.kadai11_1;

/**
 * 練習問題11-1
 * 様々な形ある資産を管理する上で有効な「TangibleAsset（有形資産）」という名前の抽象クラスの作成
 * TangibleAssetを親クラスとする子クラスComputerとBookの作成
 */
public abstract class TangibleAsset {
    String name;
    int price;
    String color;

    public TangibleAsset(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getColor() {
        return this.color;
    }
}
