/**
 * https://leetcode.com/problems/flipping-an-image/
 * 
 * Given a binary matrix A, we want to flip the image horizontally, 
 * then invert it, and return the resulting image.
 * 
 * To flip an image horizontally means that each row of the image is reversed.  
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * 
 * To invert an image means that each 0 is replaced by 1, 
 * and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 */
public class FlippingAnImage832 {
    public static void main(String[] args) {
        FlippingAnImage832 main = new FlippingAnImage832();
        System.out.println(main.flipAndInvertImage(new int[][]{{1,1,0},{1,0,1}, {0,0,1}}));
    }

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A[0].length; i++) {
            int temp[] = new int[A[i].length];
            for (int j = 0; j < A[i].length; j++) {
                int value = A[i][j];
                int invertedValue = invert(value);
                // Fill it in backwards so that its being flipped horizontally
                temp[A[i].length - 1 - j] = invertedValue;
            }
            A[i] = temp;
        }
        return A;
    }

    private int invert(final int value) {
        if (value == 0) {
            return 1;
        }

        return 0;
    }
}
