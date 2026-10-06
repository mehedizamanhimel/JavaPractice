public class MIU_Problem_Solution {

    public int miu_return_centered(int[] numbers){
        // centered: odd length and the middle element is strictly smaller than every other element
        int length = numbers.length;
        if (length % 2 == 0) {
            return 0;
        }
        int mid = numbers[length/2];
        for (int i = 0; i < length; i++) {
            if (i != length/2 && numbers[i] <= mid) {
                return 0;
            }
        }
        return 1;
    }

}
