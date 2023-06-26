public class Reverse {
    public static String reverseStringWithCharAt(String str) {
        StringBuilder res = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            res.insert(0, str.charAt(i));
        }
        return res.toString();
    }
}