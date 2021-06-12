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

}
