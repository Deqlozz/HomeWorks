package lesson_8.Task_2;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.setInfo();
        worker.setInfo();
        accountant.setInfo();
    }
}