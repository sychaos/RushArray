package cloudist.cc.rusharray;

/**
 * Created by cloudist on 2017/10/16.
 */

public class SearchFromArray {

    public static boolean SearchFrom2DArray(int[][] array, int rows, int cols, int number) {
        if (array != null && rows > 0 && cols > 0) {
            int row = 0;
            int col = cols - 1;
            while (row < rows && col >= 0) {
                if (array[row][col] == number) {
                    return true;
                } else if (array[row][col] > number) {
                    col--;
                } else {
                    row++;
                }
            }
        }
        return false;
    }
}
