package LeetCode;

import java.util.Arrays;

public class LeetCode_Easy {

    public void merge_88(int[] nums1, int m, int[] nums2, int n) {

        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int pointer3 = nums1.length-1;

        int[] result = new int[m+n];
        if (nums1.length > nums2.length && nums2.length ==0){
            System.out.println(Arrays.toString(nums1));
        }

        if (nums1.length < nums2.length && nums1.length ==0){
            System.out.println(Arrays.toString(nums2));
        }

        for (int i =0 ; i < m;i++){
            result[i] = nums1[i];
        }

        System.out.println("The first iteration is: "+Arrays.toString(result));

        for (int i =m+1 ; i < n+m-1 ; i++){
            result[i] = nums2[i];
        }


        System.out.println("The second iteration is: "+Arrays.toString(result));
    }

    public void merge_88_V2(int[] nums1, int m, int[] nums2, int n) {
        //variables to work as pointers
        int i=m-1; // will point at m-1 index of nums1 array
        int j=n-1; // will point at n-1 index of nums2 array
        int k=nums1.length-1; //will point at the last position of the nums1 array

        // Now traversing the nums2 array
        while(j>=0){
            // If element at i index of nums1 > element at j index of nums2
            // then it is largest among two arrays and will be stored at k position of nums1
            // using i>=0 to make sure we have elements to compare in nums1 array
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--; //updating pointer for further comparisons

            }else{
                // element at j index of nums2 array is greater than the element at i index of nums1 array
                // or there is no element left to compare with the nums1 array
                // and we just have to push the elements of nums2 array in the nums1 array.
                nums1[k] = nums2[j];
                k--;
                j--; //updating pointer for further comparisons

            }
        }
        System.out.println(Arrays.toString(nums1));

    }

    public int returnStairs_70(int n){
        if (n ==1 )
            return n;

        int[] result = new int[n+1];
        result[1]=1;
        result[2]=2;

        for (int i = 3; i<=n; i++){
            result [i] = result [i-1]+result[i-2];
        }

        return result[n];
    }

    public void fibonacci(){

    String str = "äbc";
    int i = 123;
    StringBuilder builder = new StringBuilder(i);
    builder.toString();

    }

}


