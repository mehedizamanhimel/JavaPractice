public class Seaching {

    public void binarySearch( ){
        int[] list= {2, 2, 4, 5};


        int number1=0;
        int number2 = list.length-1;
        int result=5;

        while (number1<=number2){
            int mid=number1+(number2-1)/2;
            if (list[mid]==result){
                System.out.println("found on mid");
            }
            if (list[mid]<result){
                number1=mid+1;
                System.out.println("next iteration");
            }
            else {
                number2=mid-1;
                System.out.println("found on iteration");
            }
        }

    }

    public void LinearSearchOne(int[] list, int number){
        //list = new int[]{12, 22, 33, 44, 55};
        //number = 33;

        boolean ab = false;

        for(int i:list) {
            if(i==number) {
                ab = true;
                break;
            }
        }
         if (ab==true){
             System.out.println("number found");
         }
         else {
             System.out.println("no int found");
         }
        /**
        for (int i=0; i >= a.length; i++){
            if (b==  ){
                System.out.println("asss");
            }
            else{
                System.out.println("Bbbbb");
            }

         **/

    }
}
