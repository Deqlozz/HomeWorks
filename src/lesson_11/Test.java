package lesson_11;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("Александр");
        list.add("Омельянюк");
        list.add("Яблоко");

        System.out.println(list.get(1));
        list.remove("Яблоко");
        System.out.println(list.contains("Омельянюк"));
        list.clear();
        System.out.println(list.size());
    }
}