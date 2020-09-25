package array.RunningSumOf1dArray_1480;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = s.runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}
