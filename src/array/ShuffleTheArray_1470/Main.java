package array.ShuffleTheArray_1470;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = s.shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }
}
