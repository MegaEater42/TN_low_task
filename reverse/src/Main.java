import java.util.Scanner;

class Reverse {
    public static String reverseStringWithCharArray(String str){
        char[] val = str.toCharArray();
        int n = str.length();
        for (int i = 0, j = n - 1; i < n / 2; i++, j--){
            char tmp = val[i];
            val[i] = val[j];
            val[j] = tmp;
        }
        return new String(val);
    }

    public static String reverseStringWithCharAt(String str) {
        StringBuilder res = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            res.insert(0, str.charAt(i));
        }
        return res.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа разворачивает вводимую строку.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку, которую вы хотите развернуть: ");
        String str = scanner.nextLine();

        System.out.println("Строка, развёрнутая с помощию CharArray: " + Reverse.reverseStringWithCharArray(str));
        System.out.println("Строка, развёрнутая с помощию CharAt: " + Reverse.reverseStringWithCharAt(str));
    }
}