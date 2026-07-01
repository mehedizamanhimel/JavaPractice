public class MIU_Problem_Solution {

    public int miu_return_centered(int[] numbers){
        int length = numbers.length;
        int mid = numbers[length/2];

        /*
        if (length<1) {
            return 0;
        }

         */
        if (length==1) {
            return 1;
        }
        return 0;
    }

}
