import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class arrayTasks {



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
