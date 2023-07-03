import java.util.Arrays;

class DeleteDuplicate {
    public static int[] deleteDuplicateInt(int[] a) {
        int[] resultArr = a;
        int resultArrLen = a.length;

        for (int i = 0, uniqueElements; i < resultArrLen; i++, resultArrLen = uniqueElements) {
            for (int j = uniqueElements = i + 1; j < resultArrLen; j++) {
                if (resultArr[j] != resultArr[i]) {
                    resultArr[uniqueElements++] = resultArr[j];
                }
            }
        }

        resultArr = Arrays.copyOfRange(resultArr, 0, resultArrLen);
        return resultArr;
    }
}