import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа удаляет дубликаты из массива без использования коллекций и библиотечных методов.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива целых: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.print("Введите массив целых: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Массив целых без повторений: " + Arrays.toString(DeleteDuplicate.deleteDuplicateInt(a)));
    }
}