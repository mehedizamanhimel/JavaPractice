package problems;

import java.util.HashMap;

public class MathProblems {

    public int sum_2235(int num1, int num2) {

        return Math.addExact(num1, num2);
        
    }


    public int romanToInt(String s) {
        HashMap<Character,Integer> hs = new HashMap<>();
        hs.put('I',1);
        hs.put('V',5);
        hs.put('X',10);
        hs.put('L',50);
        hs.put('C',100);
        hs.put('D',500);
        hs.put('M',1000);
        int count = 0;

        return count;
    }
}




