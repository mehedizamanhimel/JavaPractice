public class StringBuilder {

    public void practiceOne(){
        //StringBuilder stringBuilder = new StringBuilder();
        String string = "abcdefghijklmnopqrstuvwxyz";
        String str = new String();
        str = string.toUpperCase();
        System.out.println(str);
        str = string.toLowerCase();
        System.out.println(str);
    }

    public void practiceTwo(){
        String string = "abc";
        String string2 = "";
        int[] arrayInt = {1,2,3};
        for(int i=0; i < string.length(); i++){

            for(int j=0; i < arrayInt.length; i++){
                //string2 = string
            }
        }
    }

    public String reverseWords_557(String s) {
        // this class shadows java.lang.StringBuilder, so name the JDK one explicitly
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = new java.lang.StringBuilder(words[i]).reverse().toString();
        }
        return String.join(" ", words);
    }
}
