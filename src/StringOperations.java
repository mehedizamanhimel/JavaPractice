import java.util.*;

public class StringOperations {

    public void removeSubString() {
        ArrayList<String> listString1 = new ArrayList<>(Arrays.asList("mass", "as", "hero", "superhero"));
        System.out.println(listString1);
        ArrayList<String> listString2 = new ArrayList<>(Arrays.asList());
        String str = String.join(" ", listString1);
        for (int i = 0; i < listString1.size(); i++) {
            for (int j = i + 1; i < listString1.size(); i++) {
                if (listString1.get(i).charAt(i) == listString1.get(j).lastIndexOf(i)) {
                    listString2.add(listString1.get(i));
                }
            }
            break;
        }
        System.out.println(listString2);
    }

    public ArrayList<String> removeSubstring2(String[] words){
        String[] str1 = {"a","b","c"};
        String[] str2 = {"c","d","e"};
        String str3 = String.join("0", str2);
        System.out.println(str3);
        String str = String.join(" ", words);
        System.out.println(Arrays.asList(words));
        System.out.println(str);
        ArrayList<String> res = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(str.indexOf(words[i])!= str.lastIndexOf(words[i])){
                res.add((words[i]));
            }
        }

        return res;
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        /*
        if(str1.length()==0 && str2.length()==0){
            return false;
        }
        */
        String str2 = String.join("", word2);
        String str1 = String.join("", word1);

        boolean bul = false;
        System.out.println(str1);
        System.out.println(str2);
        for(int i = 0 ; i < str1.length(); i ++){
            for(int j = 0 ; j < str2.length(); j ++){
                if(str1.charAt(i)!=str2.charAt(j)){
                    bul= false;
                }
                else {
                    bul = true;
                }
            }
            //break;
        }
        return bul;
    }

    public String restoreString(String s, int[] indices) {
       /*
        String str = "";
        char characterToMove = 0;
        int count = 0;
        for(int i = 0 ; i < s.length(); i++){
            for(int j = 0 ; j < indices.length; j++){
                characterToMove = s.charAt(i);
                count = indices[j];
                str = s.replace(characterToMove , (char) count);
            }
        }
        System.out.println("the final string is: "+str);

        return str;




        char temp[] = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            temp[indices[i]] = s.charAt(i); //
        }
        return new String(temp);
        */

        char[] ch = new char[s.length()];
        for(int i =0 ; i < indices.length ; i++){
            ch[indices[i]] = s.charAt(i);
        }
        return String.valueOf(ch);
    }


    public String restoreString2(String codeleet, int[] ints) {
        char[] cset = new char[codeleet.length()];
        for (int i = 0 ; i < ints.length; i++){
            cset[ints[i]] = codeleet.charAt(i);
        }

        return String.valueOf(cset);
    }

    public boolean rotateString_796(String s, String goal) {
        /*
        if(s.length()!=goal.length()){
            return false;
        }

        if(s.equals(goal)==true) {
            return true;
        }

        for(int i=0;i<s.length();i++)
        {
            s=s.substring(1)+s.substring(0,1);
            if(s.equals(goal)==true)
                return true;

        }

        return false;

         */

        return (s.length()==goal.length() && (s+s).contains(goal));

        /*
        another method

        return s.concat(s).contains(goal) && s.length() == goal.length();

        */

    }

    public boolean repeatedSubstringPattern_459(String s) {

        return false;
    }

    public void CountWords(){

        String str = "this is a sample string";
        int wordcount = new StringTokenizer(str).countTokens();

        System.out.println("the total word count is: " + wordcount);

    }
}
