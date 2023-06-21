import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Данная программа проверяет, является ли вводимая строка палиндромом.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку, которую хотите проверить: ");
        String s = scanner.nextLine();

        System.out.print("Проверка с помощью reverse(): ");
        if (isPalindrome.checkWithReverse(s)) {
            System.out.println("Введённая строка - палиндром");
        } else {
            System.out.println("Введённая строка - не палиндром");
        }

        System.out.print("Проверка с помощью charAt(): ");
        if (isPalindrome.checkWithAt(s)) {
            System.out.println("Введённая строка - палиндром");
        } else {
            System.out.println("Введённая строка - не палиндром");
        }
    }
}