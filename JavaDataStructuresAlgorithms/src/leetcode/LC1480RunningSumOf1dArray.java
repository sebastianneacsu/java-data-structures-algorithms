package leetcode;

import java.util.Arrays;

public class LC1480RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        int[] solution = new int[nums.length];
        int runningSum = 0;
        for (int i=0;i<nums.length;i++) {
            runningSum+=nums[i];
            solution[i]=runningSum;
        }
        return solution;
    }

    public static void main (String[] args){
        int[] testArray = new int[] {3,1,2,10,1};
        int[] expectedOutput = new int[] {3,4,6,16,17};
        System.out.println("TEST CASE: ");
        Helpers.printIntArray(testArray);

        System.out.println("RESULT: ");
        Helpers.printIntArray(runningSum(expectedOutput));
        System.out.println("THE RESULT IS: " + (Arrays.equals(runningSum(testArray), expectedOutput)));
    }

}
