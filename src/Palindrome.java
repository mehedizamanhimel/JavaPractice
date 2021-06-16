public class Palindrome {

    public void palin(){
        int num;
        int sum=0;
        int bum = 12221;
        int temp;
        String one="aba";

        temp=bum;
        while(bum>0){
            num = bum%10;
            sum = (sum*10)+num;
            bum = bum/10;
        }
        if (sum==temp){
            System.out.println("pal");
        }
        else {
            System.out.println("no pal");
        }

    }
}
