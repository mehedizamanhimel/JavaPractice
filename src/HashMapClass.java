import java.util.*;

public class HashMapClass {

    public void hashSetOne(){
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(11,22,33));

        HashMap<Integer, String> capitalCities = new HashMap<Integer, String>();
        capitalCities.put(3,"Three");
        capitalCities.put(4,"Four");
        capitalCities.put(1,"One");
        capitalCities.put(2,"Two");

        System.out.println(hashSet);
        System.out.println(capitalCities);
        System.out.println(capitalCities.get(4));

        HashMap<Integer, String> capitalCities2 = new HashMap<Integer, String>();
        ArrayList<String> arrStr = new ArrayList<>(Arrays.asList(
                "One", "Two", "Three", "Four", "Five"));

        for (int j =0 ; j <arrStr.size(); j++ ) {
            for (int i =0 ; i <j; i++ ){
                capitalCities2.put(i, arrStr.get(j));
            }
        }
        System.out.println(capitalCities2);
    }

}
