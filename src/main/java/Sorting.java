import java.util.*;
import java.util.List;

public class Sorting {

    public String sortSentence_1859(String s) {
        String[] words = s.split(" ");
        String[] ordered = new String[words.length];
        for (String word : words) {
            int position = word.charAt(word.length() - 1) - '1';
            ordered[position] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", ordered);
    }

    public char findTheDifference_389(String s, String t) {

        char result = 0;

        for(char cs : s.toCharArray()) result ^= cs;
        System.out.println("888"+result);
        for(char ct : t.toCharArray()) result ^= ct;
        System.out.println("000"+result);

        return result;
    }

    public int[] intersect_350(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();

        for(int i=0, j=0; i<nums1.length && j<nums2.length;){
            if (nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
                i++;

            else
                j++;

        }

        int[] result = new int[list.size()];
        for (int i =0; i<list.size();i++){
            result[i]=list.get(i);
        }

        return result;
    }

    public List<Integer> intersection_2248(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[1001]; // LeetCode 2248: 1 <= nums[i][j] <= 1000
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
            arr[nums[i][j]]++;
            }
        }

        System.out.println("the intersection_2248 is:"+Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == nums.length){
                list.add(i);
            }
        }
        return list;
    }

    public List<List<Integer>> findDifference_2215(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i:nums1){
            set1.add(i);
        }

        for(int i:nums2){
            set2.add(i);
        }


        for(int n1 : set1){
            if (!set2.contains(n1)){
                list1.add(n1);
            }
        }

        for(int n2 : set2){
            if (!set1.contains(n2)){
                list2.add(n2);
            }
        }

        list.add(list1);
        list.add(list2);

        return list;
    }


    public String[] findRelativeRanks_506(int[] score) {
        String[] result = new String[score.length];
        Integer[] order = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            order[i] = i;
        }
        // athlete indexes, highest score first
        Arrays.sort(order, (a, b) -> Integer.compare(score[b], score[a]));

        String[] medals = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        for (int rank = 0; rank < order.length; rank++) {
            result[order[rank]] = rank < 3 ? medals[rank] : String.valueOf(rank + 1);
        }
        return result;
    }

    public boolean isAnagram_242(String s, String t) {

        int[] counter = new int[26];

        if(s == null || t == null) {
            return false;
        }

        if(s.length()!=t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){

            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
            //System.out.println(Arrays.toString(counter));
        }

        // Above iteration provides us with count array having all values to zero then we can say we found an anagram.
        // Every element of count has to be equal to 0.
        // If it is greater than 0 it means s has a character whose occurrence is greater than its occurrence in t.
        // And if its less than 0 then, s has a character whose occurrence is smaller than its occurrence in t.

        System.out.println(Arrays.toString(counter));
        for(int i: counter){
            if(i != 0)
                return false;
        }

        return true;

    }



}
