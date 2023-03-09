public class Recurssion {


    public int result(int a, int b){
        int sum=0;
        if(a>0 && b>0){
            sum=a+b;
        }
        else {
            sum = result(a,b);
        }
        return sum;
    }


}
