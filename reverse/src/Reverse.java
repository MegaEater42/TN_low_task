public class Reverse {
    public static String reverseStringWithCharAt(String str) {
        StringBuilder resultString = new StringBuilder();
        int stringLength = str.length();
        for (int i = 0; i < stringLength; i++) {
            resultString.insert(0, str.charAt(i));
        }
        return resultString.toString();
    }
}