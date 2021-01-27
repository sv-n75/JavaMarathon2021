package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        String s = null;
        Random random = new Random();
        int value = random.nextInt(4) + 2;
        switch (value) {
            case 2:
                s = "неудовлетворительно";
                break;
            case 3:
                s = "удовлетворительно";
                break;
            case 4:
                s = "хорошо";
                break;
            case 5:
                s = "отлично";
                break;
        }
        // Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА
        System.out.println("Преподаватель " + getName() + " оценил студента с именем " + student.getName() + " по предмету " + getSubject() + " на оценку " + s);
    }
}
