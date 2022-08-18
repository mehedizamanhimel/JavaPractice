public class Sorting {

    public String sortSentence_1859(String s) {
        String str="", str2="", str3="";
        for(int i=0; i<s.length();i++){
            str2 = s.replaceAll(" ","\n");
            str3 = s.replaceAll("\\D+"," ");

        }
        return str3;
    }
}
