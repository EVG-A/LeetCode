package array.KidsWithTheGreatestNumberOfCandies_1431;

import java.util.ArrayList;
import java.util.List;

/*
1431.Kids With the Greatest Number of Candies
        https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

        Given the array candies and the integer extraCandies,where candies[i]represents the number of candies that the
        ith kid has. For each kid check if there is a way to distribute extraCandies among the kids such that he or
        she can have the greatest number of candies among them.Notice that multiple kids can have the greatest number
        of candies.

        Example 1:
        Input:candies=[2,3,5,1,3],extraCandies=3
        Output:[true,true,true,false,true]
        Explanation:
        Kid 1has 2candies and if he or she receives all extra candies(3)will have 5candies---the greatest number of
        candies among the kids.
        Kid 2has 3candies and if he or she receives at least 2extra candies will have the greatest number of candies
        among the kids.
        Kid 3has 5candies and this is already the greatest number of candies among the kids.
        Kid 4has 1candy and even if he or she receives all extra candies will only have 4candies.
        Kid 5has 3candies and if he or she receives at least 2extra candies will have the greatest number of candies
        among the kids.
*/
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = 1;
        for (int value : candies) {
            if (value > max) {
                max = value;
            }
        }
        for (int candy : candies) {
            res.add(candy >= max - extraCandies);
        }
        return res;
    }
}
