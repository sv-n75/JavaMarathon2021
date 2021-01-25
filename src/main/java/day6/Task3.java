package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Гена", "математика");
        Student student = new Student("Петя");
        teacher.evaluate(student);
    }
}
