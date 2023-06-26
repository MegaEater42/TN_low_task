import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа разворачивает вводимую строку.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку, которую вы хотите развернуть: ");
        String str = scanner.nextLine();

        System.out.println("Строка, развёрнутая с использованимем CharAt: " + Reverse.reverseStringWithCharAt(str));
    }
}