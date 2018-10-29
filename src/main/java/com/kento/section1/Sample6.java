public class Sample6 {

    public static void main(String[] args) {
        String s = "abc,def:ghi";
        String t = s.replaceAll("[beh]", "X");
        String[] words = s.split("[,:]");
        for(String w : words) {
            System.out.print(w + "->");
        }
        System.out.println(t);
    }
}