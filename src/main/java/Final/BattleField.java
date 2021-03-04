package Final;


import java.util.Arrays;
import java.util.Scanner;

public class BattleField {
    // 0 - вода  1 - корабль 2 - аура 3 - выстрел 4 - попадание 5 убит
    Scanner scanner = new Scanner(System.in);
    private int[][] battleField;
    private int countShip1 = 10;
    private int countShip2 = 10;
    final int n;
    private boolean win;
    private boolean wound;
    // private int countShip;

    // поле инициализируется водой
    public BattleField(int[][] battleField) {
        this.battleField = battleField;
        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField[i].length; j++) {
                battleField[i][j] = 0;
            }
        }

        this.win = false;
        this.wound = true;
        if (Math.random() >= 0.5) {
            this.n = 1;
        } else this.n = 2;


    }


    public int[][] getBattleField() {
        return battleField;
    }

    public void setBattleField(int[][] battleField) {
        this.battleField = battleField;
    }

    // печать поля в зависимости от значений массива
    public void printField() {
        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField[i].length; j++) {
                if (battleField[i][j] == 0)
                    System.out.print(Field.WATER.getSymbol());
                if (battleField[i][j] == 1)
                    System.out.print(Field.SHIP.getSymbol());
                if (battleField[i][j] == 2)
                    System.out.print(Field.AREA.getSymbol());
                if (battleField[i][j] == 3)
                    System.out.print(Field.SHOT.getSymbol());
                if (battleField[i][j] == 4)
                    System.out.print(Field.DEAD.getSymbol());


            }
            System.out.println();

        }
    }

    //создание и задание корабля
    public void createField(BattleField b) {

        Scanner scanner = new Scanner(System.in);


        for (int i = 4; i > 0; i--) {
            for (int j = 4; j > i - 1; j--) {

                System.out.println("Введите координаты " + i + " палубного корабля  в формате <<x,y; x,y; где количество координат равно палубности корабля>> ");
                String inputString = scanner.nextLine();

                while (!createShip(inputString, i)) {
                    inputString = scanner.nextLine();
                }
                b.printField();
            }

        }


    }

    //палубы - цифры - 2 - 0-9 - в воду попадает
    public boolean createShip(String string, int i) {
        String[] massiveShip = string.split(";");
        int[] shipX = new int[i];
        int[] shipY = new int[i];


        //кол - палуб
        if (massiveShip.length != i) {
            System.out.println("Количество палуб должно быть " + i);
            return false;
        }
        //2
        for (int j = 0; j < i; j++) {
            String[] xy = massiveShip[j].split(",");

            while (!validNumber(xy)) {
                return false;
            }
            int x = Integer.parseInt(xy[1]);
            int y = Integer.parseInt(xy[0]);
            shipX[j] = x;//создаем массивы
            shipY[j] = y;

        }


        //сортируем массивы и проверяем 1 + 1 каждая коорд, 2 = 0
        if (i != 1) {
            Arrays.sort(shipX);
            Arrays.sort(shipY);
            //    System.out.println(Arrays.toString(shipX));
            //   System.out.println(Arrays.toString(shipY));
            for (int j = 0; j < i - 1; j++) {
                if (shipX[j] != shipX[0] && shipY[j] != shipY[0]) {
                    System.out.println("координаты корабля не валидны ");
                    return false;
                }//кто то не двигается
                if ((shipX[j + 1] - shipX[j]) != 1 && (shipY[j + 1] - shipY[j]) != 1) {//если не на 1
                    System.out.println("координаты  кораблч не валидны");
                    return false;
                }
            }

        }
        //проверяем встанет ли в поле
        if (i != 1) {
            for (int j = 0; j < i; j++) {
                if (battleField[shipX[j]][shipY[j]] != 0) {// если не вода
                    System.out.println("поле занято нельзя поставить");
                    return false;
                }
                battleField[shipX[j]][shipY[j]] = 1;//ставим палубу корабля

            }
        }
        if (i == 1) {
            if (battleField[shipX[0]][shipY[0]] != 0) {
                System.out.println("поле занято нельзя поставить");
                return false;
            }
            battleField[shipX[0]][shipY[0]] = 1;
        }
        //ореол выносим отдельно
        // при одной палубе поставили ореал вернули тру
        if (i == 1) {
            if (shipX[0] != 0) {
                battleField[shipX[0] - 1][shipY[0]] = 2;
            }
            if (shipX[0] != 9) {
                battleField[shipX[0] + 1][shipY[0]] = 2;
            }
            if (shipY[0] != 0) {
                battleField[shipX[0]][shipY[0] - 1] = 2;
            }
            if (shipY[0] != 9) {
                battleField[shipX[0]][shipY[0] + 1] = 2;
            }
            if ((shipX[0] != 0) && (shipY[0] != 0)) {
                battleField[shipX[0] - 1][shipY[0] - 1] = 2;
            }
            if ((shipX[0] != 9) && (shipY[0] != 9)) {
                battleField[shipX[0] + 1][shipY[0] + 1] = 2;
            }
            if ((shipX[0] != 0) && (shipY[0] != 9)) {
                battleField[shipX[0] - 1][shipY[0] + 1] = 2;
            }
            if ((shipX[0] != 9) && (shipY[0] != 0)) {
                battleField[shipX[0] + 1][shipY[0] - 1] = 2;
            }
            return true;

        }

        if (shipX[0] != shipX[1]) {// при перемещении по х
            if (shipY[0] != 0) {//сверху ореал
                for (int j = 0; j < i; j++) {
                    battleField[shipX[j]][shipY[0] - 1] = 2;
                }
            }//поскоьку перемещение по х у величина пост
            if (shipY[0] != 9) {//снизу
                for (int j = 0; j < i; j++) {
                    battleField[shipX[j]][shipY[0] + 1] = 2;
                }
            }
            if (shipX[0] != 0) {//бок слева
                battleField[shipX[0] - 1][shipY[0]] = 2;
                if (shipY[0] != 0) {
                    battleField[shipX[0] - 1][shipY[0] - 1] = 2;//лево вверх
                }
                if (shipY[0] != 9) {
                    battleField[shipX[0] - 1][shipY[0] + 1] = 2;// лево низ
                }
            }
            if (shipX[shipX.length - 1] != 9) { //бок справа{
                battleField[shipX[shipX.length - 1] + 1][shipY[0]] = 2;
                if (shipY[0] != 0) {
                    battleField[shipX[shipX.length - 1] + 1][shipY[0] - 1] = 2;//право верх
                }
                if (shipY[0] != 9) {
                    battleField[shipX[shipX.length - 1] + 1][shipY[0] + 1] = 2; // право низ
                }
            }
            return true;

        } else {//  при перемещении ро y

            if (shipX[0] != 0) {//слева ореал
                for (int j = 0; j < i; j++) {
                    battleField[shipX[0] - 1][shipY[j]] = 2;
                }
            }//поскоьку перемещение по у х величина пост
            if (shipX[0] != 9) {//справа
                for (int j = 0; j < i; j++) {
                    battleField[shipX[0] + 1][shipY[j]] = 2;
                }
            }
            if (shipY[0] != 0) {//бок сверху
                battleField[shipX[0]][shipY[0] - 1] = 2;
                if (shipX[0] != 0) {
                    battleField[shipX[0] - 1][shipY[0] - 1] = 2;//лево вверх
                }
                if (shipX[0] != 9) {
                    battleField[shipX[0] + 1][shipY[0] - 1] = 2;// право вверх
                }
            }
            if (shipY[shipY.length - 1] != 9) { //бок снизу{
                battleField[shipX[0]][shipY[shipY.length - 1] + 1] = 2;
                if (shipX[0] != 0) {
                    battleField[shipX[0] - 1][shipY[shipY.length - 1] + 1] = 2;//право верх
                }
                if (shipX[0] != 9) {
                    battleField[shipX[0] + 1][shipY[shipY.length - 1] + 1] = 2; // право низ

                }
            }

            return true;
        }

    }

    public boolean validNumber(String[] a) {
        if (a.length != 2) {
            System.out.println("Должно быть 2 координаты");
            return false;
        }
        // цифры
        try {
            Integer.parseInt(a[0]);
            Integer.parseInt(a[1]);

        } catch (NumberFormatException e) {
            System.out.println(" Это не числа");
            return false;
        }
        int x = Integer.parseInt(a[1]);
        int y = Integer.parseInt(a[0]);
        if (x < 0 || x > 9 || y < 0 || y > 9) {
            System.out.println("цифры не валидны дб от 0 до 9");
            return false;
        }

        return true;
    }

    //игра
    public void playField(BattleField battleField1, BattleField battleField2, BattleField game1, BattleField game2) {

        if (n == 1) {
            while (wound) {
                while (wound) {
                    game1.printField();
                    shot(battleField2.getBattleField(), game1.getBattleField(), 1);//стреляет первый поле 2 игровое поле 1
                    if (win) return;
                }
                wound = true;
                while (wound) {
                    game2.printField();
                    shot(battleField1.getBattleField(), game2.getBattleField(), 2);
                    if (win) return;
                }
                wound = true;

            }
        }


        if (n == 2) {

            while (wound) {
                while (wound) {
                    game2.printField();
                    shot(battleField1.getBattleField(), game2.getBattleField(), 2);
                    if (win) return;
                }
                wound = true;

                while (wound) {
                    game1.printField();
                    shot(battleField2.getBattleField(), game1.getBattleField(), 1);
                    if (win) return;
                }
                wound = true;

            }
        }
    }


    public void shot(int[][] battleField, int[][] game, int z) {
        System.out.println("Ходите плиз, игрок" + z + " формат x,y");
        String shot = scanner.nextLine();
        String[] shots = shot.split(",");
        //проверяем цифры на валидность
        while (!validNumber(shots)) {
            shot = scanner.nextLine();
            shots = shot.split(",");
        }

        int x = Integer.parseInt(shots[1]);
        int y = Integer.parseInt(shots[0]);

        if (battleField[x][y] != 1) {

            System.out.println("мимо, переход хода");
            game[x][y] = 3;
            battleField[x][y] = 3;
            wound = false;
            return;
        }


        if (battleField[x][y] == 1) {//если попал проверяем клетки влево вправо вверх вниз учитывая значение x y
            game[x][y] = 4;
            battleField[x][y] = 4;
            wound = false;
            if (x < 9) {
                if (battleField[x + 1][y] == 1) {
                    wound = true;
                }
            }
            if (x > 0) {
                if (battleField[x - 1][y] == 1) {
                    wound = true;
                }
            }
            if (y < 9) {
                if (battleField[x][y + 1] == 1) {
                    wound = true;
                }
            }
            if (y > 0) {
                if (battleField[x][y - 1] == 1) {
                    wound = true;
                }
            }
            if (wound) {
                System.out.println("Ранен");

            } else {
                System.out.println("Убит");
                wound = true;
                if (z == 1) {
                    countShip2--;
                } else countShip1--;



                if (countShip1 == 0 || countShip2 == 0) {
                    win = true;
                    System.out.println("Игрок" + z + " выиграл");
                    return;

                }

            }

        }

    }
}





