package kadai11.kadai11_4;

import kadai11.kadai11_2.Asset;
import kadai11.kadai11_3.Thing;

/**
 * 練習課題11-4
 * TangibleAsset（有形資産）がAsset（資産）とThing（形あるもの）の一種であるようにTangibleAssetの修正
 */
public abstract class TangibleAsset extends Asset implements Thing {
    String color;
    double weight;

    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
