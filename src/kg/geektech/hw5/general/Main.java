package kg.geektech.hw5.general;

public class Main {
    private static Hero[] allHeroes;

    public static void main(String[] args) {
        allHeroes = createHeroes();
        for (int i = 0; i < allHeroes.length; i++) {
            System.out.println(allHeroes[i].toString());
        }

        Boss boss = new Boss(1000, 50, "Kinetic");
        System.out.println("Boss health " + boss.getHealth() + ", " + " damage " + boss.getDamage() + ", " + " deffence type " + boss.getDefenceType());
    }

    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        for (int i = 0; i < 3; i++) {

            if (i == 0) {
                heroes[i] = new Hero(250, 15);
            }

            if (i == 1) {
                heroes[i] = new Hero(270, 20, 40, "Iron Man");
            }
            if (i == 2) {
                heroes[i] = new Hero(200, 30, 50, "Batman");
            }
        }
        return heroes;
    }
}