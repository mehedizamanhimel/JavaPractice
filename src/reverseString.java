import java.util.Arrays;
import java.util.Scanner;

public class reverseString {

    public String reverString(String value) {
        String abcd = value;
        String reverse = "";
        for (int i = abcd.length() - 1; i >= 0; i--) {
            reverse = reverse + abcd.charAt(i);
        }

        Scanner scanner = new Scanner(System.in);
        reverse = scanner.nextLine();
        return reverse;
    }


    public StringBuffer reverseByStringBuffer(String value) {
        String abcd = value;
        StringBuffer reverse = new StringBuffer(abcd);
        return reverse.reverse();

    }

    public String reverseStringTwo(String reverse) {
        String ab = reverse;
        String abc = "";
        for (int i = ab.length() - 1; i >= 0; i--) {
            abc = abc + ab.charAt(i);
        }
        return abc;
    }

    public void reverStringWithScanner() {

        String reverse = "";
        String rev;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        rev = scanner.nextLine();
        //System.out.println("the result is: ");
        for (int i = rev.length()-1; i >= 0; i--) {
            reverse = reverse + rev.charAt(i);

        }
        System.out.println("The result is: "+reverse);
    }

    public void reverseInt(int a){

        String b = Integer.toString(a);
        String c= "";
        int d;

        for(int i = b.length()-1; i >=0;i-- ){
            c = c+ b.charAt(i);
        }
        d = Integer.parseInt(c);
        System.out.println(d);
    }

    public void reverseIntTwo(int a){
/**
    using a recursion
        int d = 0;
        int e=0;
        if (a<10){
            d = a%10;
            reverseIntTwo(a/10);
           // reverseIntTwo(a/10);
        }
        else {
            System.out.println(a);
        }
        System.out.println(d);
**/
        int b;
        int c=0;
        int d;
        String str = "";
        while (a!=0){
            b = a%10;
            c= c*10 + b;
            a= a/10;
            //reverseInt(str);
        }

        System.out.println(c);
    }


    public void reverseMethod(String value){
        String ab = "asdfasdfffff";
        StringBuffer bc = null;
        StringBuffer cd = new StringBuffer(value);
        bc = cd.reverse();
        System.out.println(bc);

    }

    public void reverseString_344(char[] s) {

        // approach 01
        char[] t = new char[s.length];
        for (int i =0 , j = s.length-1; i<s.length ; i++, j--){
            t[j]=s[i];
        }

        System.out.println("The result of reverseString_344 is: "+ Arrays.toString(t));

        // approach 02
        int start = 0;
        int end = s.length-1;

    }
}
