import java.util.*;

public class List {

    public HashMap<String, Integer> returnBoth(int a, int b, int c, int d){
        int sum = a+b+c+d;
        int mul = a*b*c*d;
        int div = d/b;
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(sum);
        intArray.add(mul);


        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Summetion", sum );
        hashMap.put("Multiplication", mul);
        hashMap.put("Division", div);
        //return intArray;
        System.out.println(hashMap.get("Summetion"));
        return hashMap;
    }

    public void removeDuplicate(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 1, 4, 6, 3));
        LinkedList<Integer> list3 = new LinkedList<>();

        for(int i = 0 ; i < list3.size(); i++){
            if(list3.get(i)==list3.get(i)+1){
                list3.remove(list3.get(i));
                System.out.println("");
            }
        }

        Collections.sort(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0 ; i < list.size(); i++){
            for (int j = i+1 ; j < list.size()-1; j++) {
                if (list.get(i) != list.get(i) + 1) {
                    list.remove(list.get(j));
                }
            }
        }
        System.out.println("The list without duplicate value is: "+list);
    }






}
