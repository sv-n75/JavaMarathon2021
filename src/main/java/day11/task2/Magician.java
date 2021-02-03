package day11.task2;

public class Magician extends Hero implements MagicAttack {

    public Magician() {
         magicAtt = 20;
         physAtt = 5;
         magicDef = 0.8;
         physDef = 0;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackM = magicAtt * (1 - hero.magicDef);
        if (hero.health - attackM > 0) {
            hero.health -= attackM;
        } else hero.health = 0;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
