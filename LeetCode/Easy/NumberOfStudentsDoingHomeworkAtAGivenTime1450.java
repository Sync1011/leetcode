/**
 * Given two integer arrays startTime and endTime and given an integer queryTime.
 * The ith student started doing their homework at the time startTime[i] and finished it at time endTime[i].
 * Return the number of students doing their homework at time queryTime. 
 * More formally, return the number of students where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.
 *
 * Input: startTime = [1,2,3], endTime = [3,2,7], queryTime = 4
 * Output: 1
 */
public class NumberOfStudentsDoingHomeworkAtAGivenTime1450 {
    public static void main(String[] args) {
        NumberOfStudentsDoingHomeworkAtAGivenTime1450 main = new NumberOfStudentsDoingHomeworkAtAGivenTime1450();
        System.out.println(main.busyStudent(new int[]{1,2,3}, new int[]{3,2,7}, 4));
        System.out.println(main.busyStudent(new int[]{4}, new int[]{4}, 4));
        System.out.println(main.busyStudent(new int[]{4}, new int[]{4}, 5));
        System.out.println(main.busyStudent(new int[]{1,1,1,1}, new int[]{1,3,2,4}, 7));
        System.out.println(main.busyStudent(new int[]{9,8,7,6,5,4,3,2,1}, new int[]{10,10,10,10,10,10,10,10,10}, 5));
    }

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] > queryTime) {
                continue;
            }
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                count++;
            }
        }
        return count;
    }
}
