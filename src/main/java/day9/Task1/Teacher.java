package day9.Task1;
//И наконец, в нашей программе должна быть еще одна сущность - Преподаватель (англ. Teacher).
// Преподаватель должен тоже наследоваться от класса Человек. При этом, у преподавателя есть
// дополнительное строковое поле - “название предмета” (англ. subjectName), который ведет этот
// преподаватель. Для этого поля необходимо создать get метод. Конструктор в классе
// Преподаватель должен принимать на вход два аргумента - имя преподавателя и название
// преподаваемого предмета. Метод printInfo() в классе Преподаватель должен быть переопределен
// таким образом, чтобы формат выводимого в консоль сообщения был таким:
      //  “Этот человек с именем ИМЯ”
    //    “Этот преподаватель с именем ИМЯ”.

public class Teacher extends Human {
    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    public Teacher(String name, String subjectName) {
       super(name);
        this.subjectName = subjectName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.getName());
    }
}
