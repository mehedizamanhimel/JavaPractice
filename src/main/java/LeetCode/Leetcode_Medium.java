package LeetCode;

public class Leetcode_Medium {

    public int reverse_007(int x) {

        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)
            return 0;

        return (int) reversed;
    }
}
