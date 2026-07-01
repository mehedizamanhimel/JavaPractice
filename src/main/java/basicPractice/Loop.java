package basicPractice;

public class Loop {

    public void whileLoopOne(){
        int i= 5;
        while (i < 10){
            System.out.println("This is it");
            i++;
        }
    }

    public void DoWhileLoop(){
        int i = 0;
        int ab[] = {1,2,3,4,5};

        do {
            System.out.println("the DoWhileLoop is: "+ab[i]);
            i++;
        }
        while (i <ab.length);


    }
}
