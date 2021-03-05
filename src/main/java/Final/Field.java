package Final;

public enum Field {
SHIP("\u26f5"), SHOT("\uD83D\uDCA5"), WATER("⬜"),//~
    AREA("\uD83D\uDFE6"),DEAD("\u2693");

    private String symbol;

    Field(String symbol) {
        this.symbol = symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

}
