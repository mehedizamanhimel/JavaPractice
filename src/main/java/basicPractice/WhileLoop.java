package basicPractice;

public class WhileLoop {

    public void While_First(){
        int i = 8;
        while (i <10){
            System.out.println("My first while Loop");
            i++;
        }
    }

    public void while_second(){
        int i = 10;
        int b = 12;
        while (i < 15){

            if (b==i){
                System.out.println("My third while Loop");
                b++;
            }
            //System.out.println("My second while Loop");
            i++;
        }


    }
}
