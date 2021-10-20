public class Constructor {
    int abd=98;
    public Constructor(){

    }

    public Constructor(int i){
       i=this.abd;
        //i = 9;
        //abd=8;
        System.out.println("From constructor int: "+i);
    }

    public Constructor(String S){
        S = "this is a String";
        System.out.println("From constructor String: "+S);
    }

    public Constructor(char c){
        //abd=10;
        System.out.println("From constructor char: "+abd);
    }

    public Constructor(boolean b){
        //abd=11;
        System.out.println("From constructor boolean: "+abd);
    }

    public Constructor(String S, int y){
        //y = this.abd;
        System.out.println("From constructor S n i: "+y);
    }
}
