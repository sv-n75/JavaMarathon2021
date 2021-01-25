package day6;

public class Motorbike {
    private int year;
    private String model;
    private String color;

    public Motorbike( String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int inputYear){
        int difference = inputYear - year;
        if (difference < 0){
            System.out.println("так не бывает");
            return Math.abs(difference);
        }
        return difference;
    }
}
