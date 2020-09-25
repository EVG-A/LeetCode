package array.KidsWithTheGreatestNumberOfCandies_1431;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> result = s.kidsWithCandies(candies, extraCandies);
        System.out.println(result.toString());
    }
}
