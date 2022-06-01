import java.util.Arrays;

public class MaxMin {

    public void maxmin1(){
        int i = 16;
        int i2 = 7;
        int[] arr = {1,2,3,4,5,6};

        System.out.println("The maximum number is: "+Math.max(i2, i));
        System.out.println("The minimum number is: "+Math.min(i2, i));
        System.out.println("The sum is: "+Integer.sum(i2, i));
        System.out.println("The reverse if i is: "+Integer.reverse(i));
    }

    public void finding_lowest_highest(){
        int[] arr = {3,2,19,-5,1,11,5,6,7,-1,9};
        Arrays.sort(arr);
        int num=0;
        int n = arr.length;
        for (int i = 0 ; i<n; i++){
            num = arr[i];
        }
        System.out.println("The array is: "+Arrays.toString(arr));
        System.out.println("The lowest value is: "+arr[0]);
        System.out.println("The highest value is: "+num);
    }
}
