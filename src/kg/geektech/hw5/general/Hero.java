package kg.geektech.hw5.general;

public class Hero {
private int heath;
private int damage;
private int superpower;
String name;

    public int getHeath() {
        return heath;
    }

    public int getDamage() {
        return damage;
    }

    public int getSuperpower() {
        return superpower;
    }

    public Hero(int heath, int damage, int superpower, String name){
    this.heath = heath;
    this.damage = damage;
    this.superpower = superpower;
    this.name = name;
}
public Hero(int heath, int damage){
    this.heath = heath;
    this.damage = damage;
}
public Hero(){

}

    @Override
    public String toString() {
        return "Hero{" +
                "heath = " + heath +
                ", damage = " + damage +
                ", superpower = " + superpower +
                ", name = '" + name + '\'' +
                '}';
    }
}

