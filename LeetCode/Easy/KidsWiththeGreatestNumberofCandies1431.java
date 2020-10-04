/**
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
 * 
 * Given the array candies and the integer extraCandies, 
 * where candies[i] represents the number of candies that the ith kid has.
 * or each kid check if there is a way to distribute extraCandies among the kids 
 * such that he or she can have the greatest number of candies among them. 
 * Notice that multiple kids can have the greatest number of candies.
 * 
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Output: [true,true,true,false,true]
 */

 import java.util.ArrayList;
 import java.util.List;

 public class KidsWiththeGreatestNumberofCandies1431 {
    public static void main(String[] args) {
        KidsWiththeGreatestNumberofCandies1431 main = new KidsWiththeGreatestNumberofCandies1431();
        List<Boolean> result = main.kidsWithCandies(new int[]{2,3,5,1,3}, 3);
        for (Boolean bool : result) {
            System.out.println(bool);
        }
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int highest = 0;
       for (int num : candies) {
           if (num > highest) {
               highest = num;
           }
       }

       List<Boolean> result = new ArrayList<>();
       for (int num : candies) {
           if (num + extraCandies >= highest) {
               result.add(true);
           } else {
               result.add(false);
           }
       }
       return result;
    }
 }