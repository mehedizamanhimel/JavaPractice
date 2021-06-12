import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class arrayTasks {


    public void arList(){
        ArrayList<String> abcd = new ArrayList<String>();
        abcd.add("ab");
        abcd.add("bd");
        abcd.add("cd");
        abcd.add("de");
        System.out.println(abcd);
    }

    public void arList_int(){
        ArrayList<Integer> abcd = new ArrayList<Integer>();
        abcd.add(11);
        abcd.add(22);
        abcd.add(33);
        abcd.add(44);
        System.out.println(abcd);
    }

    public void arList_double(){
        ArrayList<Double> abcd = new ArrayList<Double>();
        abcd.add(11.0);
        abcd.add(22.0);
        abcd.add(33.0);
        abcd.add(44.0);
        System.out.println(abcd);
    }


    public void listSortStrint(){
        List<String> slist = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");
        List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    public void listSortStringTwo(){
        List<String> slist = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");
        List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    public void arrayoperations(){
        String abcd[] = {"mehedi","zaman","himel"};
        LinkedList<String> abcde = new LinkedList<String>();
        abcde.add("Mohammad");
        abcde.add("Mehedi");
        abcde.add("Zaman");
        abcde.add("Himel");
        System.out.println("the linked list item is: "+abcde);
        abcde.removeFirst();
        System.out.println("the linked list after deleting first item is: "+abcde);
        abcde.removeLast();
        System.out.println("the linked list after deleting last item is: "+abcde);
    }
}
