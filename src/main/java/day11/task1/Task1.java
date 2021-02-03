package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Courier courier = new Courier(warehouse1);
        Picker picker = new Picker(warehouse1);
        Warehouse warehouse2 = new Warehouse();
        Courier courier1 = new Courier(warehouse2);
        Picker picker1 = new Picker(warehouse2);


        businessProcess(courier);
        businessProcess(picker);

        System.out.println(courier);
        System.out.println(picker);
        System.out.println(warehouse1);



        courier1.doWork();
        picker1.doWork();

        System.out.println(courier);
        System.out.println(picker);
        System.out.println(warehouse1);

    }
    public static void businessProcess(Worker worker){
     for (int i = 0; i<10000; i++){
         worker.doWork();
     }
     worker.bonus();
    }

}
