import java.util.Arrays;

public class Binary {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int number = length * (length + 1) / 2;
        for(int i =0; i< length; i++ ){
                number-=nums[i];
        }
        return number;
    }

}
