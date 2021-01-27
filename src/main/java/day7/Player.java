package day7;

public class Player {
    private int stamina;
    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;
    static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (this.stamina == MIN_STAMINA) {
            return;
        }
        this.stamina--;
        if (this.stamina == MIN_STAMINA)
            countPlayers--;
    }

    public static void info() {
        if (countPlayers < 6)
            System.out.println("Команды неполные на поле еще есть " + (6 - getCountPlayers()) + " свободных мест.");
        else
            System.out.println("На поле нет свободных мест.");
    }
}
