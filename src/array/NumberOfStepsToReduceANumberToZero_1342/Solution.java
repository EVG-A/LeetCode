package array.NumberOfStepsToReduceANumberToZero_1342;

/*
1342.Number of Steps to Reduce a Number to Zero
        https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

        Given a non-negative integer num,return the number of steps to reduce it to zero.If the current number is even,
        you have to divide it by 2,otherwise,you have to subtract 1from it.

        Example 1:
        Input:num=14
        Output:6
        Explanation:
        Step 1)14is even;divide by 2and obtain 7.
        Step 2)7is odd;subtract 1and obtain 6.
        Step 3)6is even;divide by 2and obtain 3.
        Step 4)3is odd;subtract 1and obtain 2.
        Step 5)2is even;divide by 2and obtain 1.
        Step 6)1is odd;subtract 1and obtain 0.
*/
public class Solution {
    public int numberOfSteps(int num) {
        int res = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num--;
            }
            res++;
        }
        return res;
    }
}
