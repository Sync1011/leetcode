/**
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 * 
 * Given an array arr, 
 * replace every element in that array with the greatest element among the elements to its right, 
 * and replace the last element with -1.
 * After doing so, return the array.
 * 
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 */
public class ReplaceElementsWithGreatestElementOnTheRightSide1299 {
    public static void main(String[] args) {
        ReplaceElementsWithGreatestElementOnTheRightSide1299 main = new ReplaceElementsWithGreatestElementOnTheRightSide1299();
        int[] res = main.replaceElements(new int[]{17,18,5,4,6,1});
        for (int num : res) {
            System.out.println(num);
        }
    }

    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];
        for (int i = arr.length-2; i >= 0; i--){
            int tmp = arr[i];
            arr[i] = max;
            max = Math.max(max, tmp);
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
