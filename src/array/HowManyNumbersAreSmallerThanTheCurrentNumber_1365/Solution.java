package array.HowManyNumbersAreSmallerThanTheCurrentNumber_1365;

/*
1365.How Many Numbers Are Smaller Than the Current Number
        https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

        Given the array nums,for each nums[i]find out how many numbers in the array are smaller than it.That is,
        for each nums[i]you have to count the number of valid j's such that j != i and nums[j] < nums[i].
        Return the answer in an array.

        Example 1:
        Input:nums=[8,1,2,2,3]
        Output:[4,0,1,1,3]
        Explanation:
        For nums[0]=8there exist four smaller numbers than it(1,2,2and 3).
        For nums[1]=1does not exist any smaller number than it.
        For nums[2]=2there exist one smaller number than it(1).
        For nums[3]=2there exist one smaller number than it(1).
        For nums[4]=3there exist three smaller numbers than it(1,2and 2).
*/
public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    res[i]++;
                } else if (nums[i] < nums[j]) {
                    res[j]++;
                }
            }
        }
        return res;
    }
}
