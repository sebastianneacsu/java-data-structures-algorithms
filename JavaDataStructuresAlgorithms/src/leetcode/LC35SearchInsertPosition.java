package leetcode;

public class LC35SearchInsertPosition {
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

        return left;
    }

    public static void main (String[] args){
        int[] testArray = new int[] {1,3,5,6};
        int expectedOutput = 2;
        int expectedOutput2 = 4;

        int target = 5;
        int target2 = 7;
        System.out.println("TEST CASE: ");
        Helpers.printIntArray(testArray);

        System.out.println("RESULT1: ");
        System.out.println(expectedOutput);
        System.out.println("RESULT2: ");
        System.out.println(expectedOutput2);
        System.out.println("1. THE RESULT IS: " + (search(testArray, target) == expectedOutput));
        System.out.println("2. THE RESULT IS: " + (search(testArray, target2) == expectedOutput2));

    }

}
