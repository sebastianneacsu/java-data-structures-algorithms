package leetcode;

import java.util.Arrays;

public class LC704BinarySearch {
    public static int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] == target){
                return midpoint;
            } else if (nums[midpoint] > target){
                right = midpoint -1;
            } else left = midpoint + 1;
        }

        return -1;
    }

    public static void main (String[] args){
        int[] testArray = new int[] {-1,0,3,5,9,12};
        int expectedOutput = 4;
        int target = 9;
        System.out.println("TEST CASE: ");
        Helpers.printIntArray(testArray);

        System.out.println("RESULT: ");
        System.out.println(expectedOutput);
        System.out.println("THE RESULT IS: " + (search(testArray, target) == expectedOutput));
    }

}
