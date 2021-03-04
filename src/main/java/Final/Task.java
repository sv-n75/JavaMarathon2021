package Final;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        BattleField battleField1 = new BattleField(new int[10][10]);
        BattleField battleField2 = new BattleField(new int[10][10]);
        BattleField gameField1 = new BattleField(new int[10][10]);
        BattleField gameField2 = new BattleField(new int[10][10]);

        battleField1.createField(battleField1);
        battleField1.printField();
        gameField1.printField();//пустое поле чтобы 2 не видел

        battleField2.createField(battleField2);
        battleField2.printField();
        gameField2.printField();

        battleField1.playField(battleField1, battleField2, gameField1, gameField2);//запуск игры

    }
}









