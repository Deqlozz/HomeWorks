package lesson_7;

public class Main {
    public static void main(String[] args)  {
        Phone myPhone = new Phone("+375296001010L","xiaomi",143);
        Phone onePhone = new Phone("+375296002020L","iphone",190);
        Phone twoPhone = new Phone("+375296003030L","huawei",210);

        System.out.println(myPhone);
        System.out.println();

        System.out.println(onePhone);
        System.out.println();

        System.out.println(twoPhone);
        System.out.println();

        myPhone.receiveCall("stepan");

        myPhone.receiveCall("Bob , +375296200000");

        System.out.println("First Number: " + onePhone.getNumber());
        System.out.println("Second Number: " + twoPhone.getNumber());

        myPhone.sendMessage("000000", "1111111", "222222");

}
}
