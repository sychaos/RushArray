package cloudist.cc.rusharray;

/**
 * Created by cloudist on 2017/10/16.
 */

public class SortOddEven {

    public static int[] SortOddEven(int[] array) {
        int indexOfStart = 0;
        int indexOfEnd = array.length - 1;
        while (indexOfEnd > indexOfStart) {

            while (indexOfEnd > indexOfStart && isOdd(array[indexOfStart])) {
                indexOfStart++;
            }

            while (indexOfEnd > indexOfStart && !isOdd(array[indexOfEnd])) {
                indexOfEnd--;
            }

            if (indexOfEnd > indexOfStart) {
                int cache = array[indexOfStart];
                array[indexOfStart] = array[indexOfEnd];
                array[indexOfEnd] = cache;
            }
        }
        return array;
    }

    private static boolean isOdd(int num) {
        return (num & 0x1) == 1;
    }
}
