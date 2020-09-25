package array.NumberOfGoodPairs_1512;

/*
1512.Number of Good Pairs
        https://leetcode.com/problems/number-of-good-pairs/

        Given an array of integers nums.
        A pair(i,j)is called good if nums[i]==nums[j]and i<j.
        Return the number of good pairs.

        Example 1:
        Input:nums=[1,2,3,1,1,3]
        Output:4
        Explanation:There are 4good pairs(0,3),(0,4),(3,4),(2,5)0-indexed.
*/
public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    res++;
                }
            }
        }
        return res;
    }
}