package problems;

public class CodilityTest {

    public boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1 && A[n - 1] != K)
            return false;

        if (A[0] == 1 && A[n - 1] != K)
            return false;



        else
            return true;
    }


    public static int solution2(int N) {
        int result = 0;
        int expected = getSum(N) * 2;

        for (int i = N;; i++) {
            if (getSum(i) == expected) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public int[] solution3(String R, int[] V) {
        // write your code in Java SE 11
        int[] result = new int[V.length];




        return result;
    }


    public String solution(int N, int K) {
        // write your code in Java SE 8
        String s = "";
        int left=0, right=0;

        if (s.length() == 0 || left < right) {
           // return 0;
        }

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        //return right - left - 1;

        return "result";
    }

}




















