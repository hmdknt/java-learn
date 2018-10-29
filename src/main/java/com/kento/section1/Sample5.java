public class Sample5 {

    public static void main(String[] args) {

        String s1 = "X0123456";

        isValidPlayerName(s1);

        System.out.println();


    }

    static boolean isValidPlayerName(String name) {
        return name.matches("[A-Z][A-Z0-9]{7}");
    }


}