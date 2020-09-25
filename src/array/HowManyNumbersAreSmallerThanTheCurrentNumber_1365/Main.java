package array.HowManyNumbersAreSmallerThanTheCurrentNumber_1365;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = s.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }
}
