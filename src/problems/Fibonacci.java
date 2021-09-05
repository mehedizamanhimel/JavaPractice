package problems;

public class Fibonacci {

    public void fiboOne(){
        int a=0;

        for (int i = 0; i < 10 ; i++){
            a = i+(i-1);
            System.out.println(a);
        }

    }

    public void fiboTwo() {
        int number1 = 0, number2 = 1,number3, a = 0, sum = 10;

        System.out.println(number1+"  "+number2);
        for (int i = 2; i < sum; ++i) {
            number3 = number1+number2;

            number1=number2;
            number2=number3;
            System.out.println(number3);

        }


    }
}
