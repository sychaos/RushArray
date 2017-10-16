package cloudist.cc.rusharray;

/**
 * Created by cloudist on 2017/10/16.
 */

public class FindMaxTimesNum {

    public static int findMaxTimesNum(int[] nums) throws IllegalAccessException {
        if (nums == null || nums.length == 0) {
            throw new IllegalAccessException();
        }

        int result = nums[0];
        int times = 0;

        for (int num : nums) {
            if (result == num) {
                times++;
            } else {
                times--;
            }

            if (times == 0) {
                result = num;
                times = 1;
            }
        }
        return result;
    }
}
