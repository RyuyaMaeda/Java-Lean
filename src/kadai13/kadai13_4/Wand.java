package kadai13.kadai13_4;

public class Wand {
    private String name;

    /**
     * 杖の魔力
     */
    private double power;

    public String getName() {
        return name;
    }

    public double getPower() {
        return power;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("杖の名前を設定できません");
        }
        this.name = name;
    }

    public void setPower(double power) {
        if (power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException("魔力を設定できません");
        }
        this.power = power;
    }
}
