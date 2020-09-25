package array.RunningSumOf1dArray_1480;

/*
1480.Running Sum of 1dArray
        https://leetcode.com/problems/running-sum-of-1d-array/
        Given an array nums.We define a running sum of an array as runningSum[i]=sum(nums[0]…nums[i]).
        Return the running sum of nums.

        Example 1:
        Input:nums=[1,2,3,4]
        Output:[1,3,6,10]
        Explanation:Running sum is obtained as follows:[1,1+2,1+2+3,1+2+3+4].
*/
public class Solution {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            cur += nums[i];
            res[i] = cur;
        }
        return res;
    }
}
