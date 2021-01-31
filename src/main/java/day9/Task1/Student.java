package day9.Task1;
//Затем, создайте класс Студент (англ. Student), который наследуется от класса Человек.
// У студента есть дополнительное строковое поле - название его учебной группы (англ. groupName).
// Для этого поля тоже необходимо создать геттер. Конструктор в классе Студент должен принимать
// на вход два аргумента - имя и название учебной группы. Метод printInfo() в классе
// Студент должен быть переопределен таким образом, чтобы формат выводимого в консоль сообщения
// был таким:
  //      “Этот человек с именем ИМЯ”
    //    “Этот студент с именем ИМЯ”
      //  (должно выводиться именно две строки - необходимо использовать ключевое слово super)


public class Student extends Human{
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем " + super.getName());
    }
}

