/**
 * https://leetcode.com/problems/height-checker/
 * 
 * Students are asked to stand in non-decreasing order of heights for an annual photo.
 * Return the minimum number of students that must move in order for all students 
 * to be standing in non-decreasing order of height.
 */
public class HeightChecker1051 {
    public static void main(String[] args) {
        HeightChecker1051 main = new HeightChecker1051();
        main.heightChecker(new int[]{1,1,4,2,1,3});
    }

    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        for (int num : heights) {
            count[num]++;
        }

        int currentHeight = 0;
        int result = 0;
        for (int i = 0; i < heights.length; i++) {
            while (count[currentHeight] == 0) {
                currentHeight++;
            }

            if (currentHeight != heights[i]) {
                result++;
            }
            count[currentHeight]--;
        }
        return result;
    }
}
