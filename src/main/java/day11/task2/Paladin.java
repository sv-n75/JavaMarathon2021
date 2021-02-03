package day11.task2;

public class Paladin extends Hero implements Healer {
    public Paladin() {
         physDef = 0.5;
         physAtt = 15;
         magicDef = 0.2;

    }

    @Override
    public void healHimself() {
        if (health + 25 < 100) {
            health += 25;
        } else health = 100;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 10 < 100) {
            hero.health += 10;
        } else hero.health = 100;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
