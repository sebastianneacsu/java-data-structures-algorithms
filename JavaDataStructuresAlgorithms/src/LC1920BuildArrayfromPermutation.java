import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class LC1920BuildArrayfromPermutation {
    public static int[] buildArray(int[] nums) {
        int[] solution = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            solution[i] = nums[nums[i]];
        }
        return solution;
    }

    public static void main (String[] args){
        int[] testArray = new int[] {0,2,1,5,3,4};
        int[] expectedOutput = new int[] {0,1,2,4,5,3};
        System.out.println("TEST CASE: ");
        Helpers.printIntArray(testArray);

        System.out.println("RESULT: ");
        Helpers.printIntArray(buildArray(expectedOutput));
        System.out.println("THE RESULT IS: " + (Arrays.equals(buildArray(testArray), expectedOutput)));
    }

}
