package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior  = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        System.out.println(paladin);

        paladin.physicalAttack(magician);
        System.out.println(magician);

        shaman.healTeammate(magician);
        System.out.println(magician);

        magician.magicalAttack(paladin);
        System.out.println(paladin);

        //  Паладин атакует Мага
        //Шаман лечит Мага
        //Маг атакует Паладина, тип атаки М
        //Шаман атакует Воина, тип атаки Ф
        //Паладин лечит себя
        //Воин атакует Мага 5 раз
        shaman.physicalAttack(warrior);
        System.out.println(warrior);

        paladin.healHimself();
        System.out.println(paladin);

        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            System.out.println(magician);
        }



    }
}
