package lesson_10;


public class DocumentNumber {

    public static void getFourNumbers(String str) {
        String firstTwoBlocks = str.substring(0, 4) + "-" + str.substring(9, 13);
        System.out.println("Two first blocks : " + firstTwoBlocks);
    }

    public static void replaceSymbols(String str) {
        String maskedDocument = str.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println("Replaced Document Number : " + maskedDocument);
    }

    public static void getOnlySymbols(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Letters:");

        String lettersOnly = str.replaceAll("\\d|-", "").toUpperCase();

        if (lettersOnly.length() < 8) {
            System.out.println("Not enough letters in document number.");
            return;
        }

        sb.append(lettersOnly.substring(0, 3)).append("/");
        sb.append(lettersOnly.substring(3, 6)).append("/");
        sb.append(lettersOnly.substring(6, 7)).append("/");
        sb.append(lettersOnly.substring(7, 8));

        System.out.println(sb.toString());
    }

    public static void checkContainsSymbols(String str) {
        if (str.toLowerCase().contains("abc")) {
            System.out.println("Document Number contains 'abc' ");
        } else {
            System.out.println("Document Number doesn't contain 'abc' ");
        }
    }

    public static void checkStartNumber(String str) {
        if (str.trim().startsWith("555")) {
            System.out.println("Document Number starts with '555' ");
        } else {
            System.out.println("Document Number doesn't start with '555' ");
        }
    }

    public static void checkEndNumber(String str) {
        if (str.trim().endsWith("1a2b")) {
            System.out.println("Document Number ends with '1a2b' ");
        } else {
            System.out.println("Document Number doesn't end with '1a2b' ");
        }
    }
}
