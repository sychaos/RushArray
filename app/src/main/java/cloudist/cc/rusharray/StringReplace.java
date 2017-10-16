package cloudist.cc.rusharray;

import java.util.Arrays;

/**
 * Created by cloudist on 2017/10/16.
 */

public class StringReplace {

    public static String InsertSortArray(char[] a1, char[] a2) {
        int indexOfOriginalA1 = a1.length - 1;
        int indexOfOriginalA2 = a2.length - 1;
        int indexOfNew = indexOfOriginalA1 + indexOfOriginalA2;

        while (indexOfNew >= 0 && indexOfOriginalA1 > indexOfNew) {
            if (a1[indexOfOriginalA1] <= a2[indexOfOriginalA2]) {
                a1[indexOfOriginalA1 + 1] = a2[indexOfOriginalA2];
                indexOfOriginalA2--;
            } else {
                a1[indexOfNew] = a1[indexOfOriginalA1];
            }
            indexOfOriginalA1--;
            indexOfNew--;
        }
        return Arrays.toString(a1);
    }
}
