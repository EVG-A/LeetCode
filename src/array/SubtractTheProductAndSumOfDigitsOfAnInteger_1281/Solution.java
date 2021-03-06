package array.SubtractTheProductAndSumOfDigitsOfAnInteger_1281;

/*
1281.Subtract the Product and Sum of Digits of an Integer
        https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

        Given an integer number n,return the difference between the product of its digits and the sum of its digits.

        Example 1:
        Input:n=234
        Output:15
        Explanation:
        Product of digits=2*3*4=24
        Sum of digits=2+3+4=9
        Result=24-9=15
*/
public class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            prod *= d;
            sum += d;
            n = n / 10;
        }
        return prod - sum;
    }
}
