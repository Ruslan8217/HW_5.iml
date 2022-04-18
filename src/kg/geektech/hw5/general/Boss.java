package kg.geektech.hw5.general;

public class Boss {
    private int health;
    private int damage;
    private String defenceType;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(String defenceType) {
        this.defenceType = defenceType;
    }
    public Boss(int health, int damage, String defenceType){
        this.health = health;
        this.damage = damage;
        this.defenceType = defenceType;
    }
}
