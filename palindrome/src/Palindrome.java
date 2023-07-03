public class Palindrome {
    public static boolean checkWithAt(String str) {
        if(str == null) {
            return false;
        }
        String tmp = str.replaceAll("\\s+", "").toLowerCase();
        int n = tmp.length();
        for(int i = 0; i < n / 2; i++) {
            if (tmp.charAt(i) != tmp.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
