import java.util.Scanner;
import java.util.Arrays;

class RemoveDuplicate {
    public static int[] removeDuplicateInt(int[] a) {
        int r = 1;
        boolean f = true;
        int len = a.length;

        // Идём по массиву и пытаемся найти повторения
        for (; f && r < len; r++) {
            for (int i = 0; f && i < r; i++) {
                f = a[r] != a[i];
            }
        }

        int[] tmp = a;
        // Если повторения были, то будем находить следующий уникальный эл-т и записывать его за последним найденным
        // Т.е. будем использовать учитывать позицию чтения и позицию записи
        if (!f) {
            int w = r - 1;
            for (int i = r + 1; i < len; i++) {
                f = true;
                for (int j = 0; f && j < i; j++) {
                    f = tmp[i] != tmp[j];
                }
                if (f) {
                    tmp[w++] = tmp[i];
                }
            }
            tmp = Arrays.copyOfRange(tmp, 0, w);
        }
        return tmp;
    }
}

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

        System.out.println("Массив целых без повторений: " + Arrays.toString(RemoveDuplicate.removeDuplicateInt(a)));
    }
}