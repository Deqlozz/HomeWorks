package lesson_7;

public class Phone {
    private String number;
    private String model;
    private float weight;

    public Phone(String number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling!");
    }
    public void sendMessage(String... phoneNumbers) {
        System.out.println("Sending message to: ");
        for (String num : phoneNumbers) {
            System.out.println(num);
        }
    }

    public void whoCalls(String whoCalls) {
        System.out.println("calling is" + whoCalls);
    }

    public void numberscalls(String numberscalls) {
        System.out.println("this is" + numberscalls);
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public String getNumber() {
        return number;
    }

    public String getModel(){
        return model;
    }

    public float getWeight(){
        return  weight;
    }

    @Override
    public String toString() {
        return "Phone Information: " + "\n" +
                "Number: " + getNumber() + "\n" +
                "Model: " + getModel() + "\n" +
                "Weight: " + getWeight();
    }
}