import java.util.Arrays;

public class Binary {
    public int missingNumber(int[] nums) {
        int number = 0;
        int length = nums.length;
        for(int i =0; i< length; i++ ){
                number+=nums[i];
        }
        return number;
    }

}
