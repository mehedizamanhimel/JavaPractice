import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class arrayTasks {


	public void arrayAdd() {
		ArrayList<String> employee = new ArrayList<String>();
		employee.add("Mehedi");
		employee.add("Zaman");
		employee.add("Himel");
		System.out.println("after adding full name"+employee);
		employee.remove(1);
		System.out.println("after removing 2nd string"+employee);
	}

    public void arList(){
        ArrayList<String> abcd = new ArrayList<String>();
        abcd.add("ab");
        abcd.add("de");
        abcd.add("cd");
        abcd.add("bd");

        System.out.println("The arraylist before sorting"+abcd);

        Iterator i = abcd.iterator();

        while (i.hasNext()) {
			System.out.println(i.next());

		}

        Collections.sort(abcd);
        System.out.println("The arraylist after sorting"+abcd);

        Collections.sort(abcd, Collections.reverseOrder());
        System.out.println("The arraylist after reverse sorting"+abcd);


    }

    public void arList_int(){
        ArrayList<Integer> abcd = new ArrayList<Integer>();
        abcd.add(11);
        abcd.add(44);
        abcd.add(33);
        abcd.add(22);

   System.out.println("The arraylist before sorting"+abcd);

        Collections.sort(abcd);
        System.out.println("The arraylist after sorting"+abcd);

        Collections.sort(abcd, Collections.reverseOrder());
        System.out.println("The arraylist after reverse sorting"+abcd);
    }

    public void arList_double(){
        ArrayList<Double> abcd = new ArrayList<Double>();
        abcd.add(11.0);
        abcd.add(44.0);
        abcd.add(33.0);
        abcd.add(22.0);
        System.out.println("The list of array before sorting"+abcd);

        Collections.sort(abcd);

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

    public static void arMerge(){
	    int [] fistArray = {1,2,3,4};
        int [] secondArray = {5,6,7,8};
        int fal = fistArray.length;
        int sal = secondArray.length;
        int[] sumlength = new int[fal+sal];
        System.arraycopy(fistArray,0,sumlength,0, fal);
        System.arraycopy(secondArray,0,sumlength,fal, sal);

        System.out.println(Arrays.toString(sumlength));

        int length = sumlength.length;
        int mid = length/2;
        System.out.println(sumlength[mid]);

    }

    public void foundELementLocation(){
	    int[] a = {1,2,3,4,5,6};
	    int b = 4;

	    int c = a.length;
	    int d;
	    for (int i=0; i >= c; i++){
	        }
        }

    public void findSmallestInArray(){
	    int a[]={23,23,11,24,53,6354, 8, 0};
	    int b[]={21,12,31231,123213};
	    Arrays.sort(a);
	    System.out.println("The smallest array is: "+a[0]);
    }

    public void SumofTwoArray(){
        int a[]={23,23,11,24,53,6354, 8, 0};
        int b[]={21,12,31231,123213};
        int c = a[0]+b[0]+a[3];
        System.out.println("The sum of two array element is: "+c);

    }


}
