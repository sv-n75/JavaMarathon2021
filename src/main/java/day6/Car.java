package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0)
            System.out.println("так не бывает");
        else
            this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty())
            this.color = "неверно";
        else
            this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty()) {
            this.model = "неверно";
        } else
            this.model = model;
    }
    public void info(){
        System.out.println("Это автомобиль");
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
