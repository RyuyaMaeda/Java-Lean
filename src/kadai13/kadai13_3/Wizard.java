package kadai13.kadai13_3;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    /**
     * 勇者のhpを回復するメソッドです。
     * 回復量は杖の魔力に比例します。
     *
     * @param hero 勇者
     */
    public void heal(Hero hero) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.getWand().getPower());
        hero.setHp(hero.getHp() + recovPoint);
        System.out.println(hero.getName() + "のHPを" + recovPoint + "回復した");
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wand getWand() {
        return this.wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }
}
