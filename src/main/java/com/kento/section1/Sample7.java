public class Sample7 {

    public static void main(String[] args) {
        final String FORMAT = "%8s  %6s 所持金%,5d";
        String s = String.format(FORMAT, "dragon", "monster", 100000);
        System.out.println(s);
    }
}