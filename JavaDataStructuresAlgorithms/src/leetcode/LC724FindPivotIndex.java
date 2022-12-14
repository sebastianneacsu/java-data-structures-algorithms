package leetcode;

import java.util.Arrays;

public class LC724FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int[] rightSum = new int[nums.length];
        int runningSumRight = 0;
        for (int i=nums.length-1;i>=0;i--) {
            runningSumRight+=nums[i];
            rightSum[i]=runningSumRight;
            System.out.println("runningSumRight: " + runningSumRight);
        }
        if (nums.length > 1){
            if(rightSum[1] == 0){
                return 0;
            }
        }
        int runningSumLeft = 0;
        for (int i=0;i<nums.length;i++){
            runningSumLeft+=nums[i];
            System.out.println("runningSumLeft: " + runningSumLeft);
            if(runningSumLeft == rightSum[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main (String[] args){
        int[] testArray = new int[] {1,7,3,6,5,6};
        int expectedOutput = 3;
        System.out.println("THE RESULT IS: " + (pivotIndex(testArray) == expectedOutput));
    }

}
