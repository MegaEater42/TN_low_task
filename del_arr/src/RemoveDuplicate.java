import java.util.Arrays;

class DeleteDuplicate {
    public static int[] deleteDuplicateInt(int[] a) {
        int[] resultArr = a;
        int writePosition = 0;

        for (int readPosition = 0; readPosition < a.length; readPosition++) {
            int i = 0;
            while (i < writePosition) {
                if (resultArr[readPosition] == resultArr[i])
                    break;
                i++;
            }
            if (i == writePosition) {
                resultArr[writePosition++] = resultArr[readPosition];
            }
        }
        resultArr = Arrays.copyOfRange(resultArr, 0, writePosition);

        return resultArr;
    }
}