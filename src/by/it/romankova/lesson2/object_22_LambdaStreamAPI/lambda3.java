package by.it.romankova.lesson2.object_22_LambdaStreamAPI;
// создаем свой функциональный интерфейс и на его основе Lambda - выражение

public class lambda3 {
    public static void main(String[] args) {
//        getToWork(new Worker() {
//            @Override
//            public void doSmth() {
//                System.out.println("I'm working");
//            }
//        });
        getToWork(name -> System.out.println(name+" is working"));
    }
    private interface Worker {
        void doSmth(String name);
    }
    private static void getToWork (Worker worker){
        worker.doSmth("James");
    }

}
