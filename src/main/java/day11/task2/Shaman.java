package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    public Shaman() {
         magicAtt = 15;
         physAtt = 10;
         magicDef = 0.2;
         physDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + 50 < 100) {
            health += 50;
        } else health = 100;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 30 < 100) {
            hero.health += 30;
        } else hero.health = 100;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackM = magicAtt * (1 - magicDef);
        if (hero.health - attackM > 0) {
            hero.health -= attackM;
        } else hero.health = 0;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
