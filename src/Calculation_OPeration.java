public class Calculation_OPeration {

    public void SumAndMultiply(int a, int b) {
        int sum = a + b;
        int mul = a * b;

        System.out.println("The summetion of two integer is :" + sum);
        System.out.println("The multiplation of two integer is :" + mul);
    }

    public int sendEven() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int number = 0;
        int number2 = 0;
        int sum=0;

        for (int i = 0; i <= a.length; i++) {

            number = a[i];
            number2 = number % 2;
            if (number2 == 0) {
                    sum = sum+number2;
            }
            else {
                System.out.println("nothing to do");
            }
        }
        System.out.println(sum);
        return sum;

    }

}
