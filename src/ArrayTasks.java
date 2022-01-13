import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTasks {


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



    public void hr_2dArray_for(){
	    ArrayList<Integer> arrayList = new ArrayList<Integer>();
	    int[] abcd = {1,2,3,4,5,6};
        arrayList.add(2);
	    arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        //arrayList.add(2,5);

        int b = 0;
        for (int i=0; i<=arrayList.size() ; i++){
           System.out.println(arrayList);

            break;
        }
        System.out.println("the list is"+b);
    }

    public void hr_2dArray_forEach(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(8);
        arrayList.add(11);
        arrayList.add(9);
        arrayList.add(5);
        arrayList.add(99);
        arrayList.add(77);
        arrayList.add(66);

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        //arrayList.add(2,5);

        int b = 0;

        for (int i:arrayList) {
            System.out.println("Result of foreach loop" + i);
            if (i == 5 || i == 66) {
                /*
                b=i;
                System.out.println("right"+b);
                */
                arrayList2.add(i);
                arrayList3.add(arrayList.indexOf(i));
                System.out.println("Filtered array values are: " + arrayList2);
                System.out.println("Index of filtered array values are: " + arrayList3);
            } else {
                System.out.println("wrong" + i);
            }
        }
        System.out.println("Before sorting"+arrayList);
        //Collections.sort(arrayList, Collections.reverseOrder());
        Collections.reverse(arrayList);
        System.out.println("After sorting"+arrayList);
    }


    public void arrayDeclare(){

	    int[] abcd = {1,2,3,4};
	    int[] abcd2= new int[5];
	    int abcd3[] = {4,5,6,6,6,7,7,9};

	    //ArrayList<Integer> abcd2 = {1,2,3,5,6};

        System.out.println(abcd3[1]+abcd[2]);
        System.out.println(abcd2.length);
        int b = 0;

    }

    public void TwoDArrayOne(){

	    int abcd[][] = {{1,2,3,4,5},{6,7,8,9,0}};
	    int firstArrayValue = abcd[0][2];
	    int secondArrayValue = abcd[1][2];

	    int abcd2[][];

        System.out.println("firstArrayValue: "+firstArrayValue);
        System.out.println("secondArrayValue: "+secondArrayValue);

        for(int i=0; i< abcd.length; i++){

            for (int j=0; j<abcd[i].length;j++){

                System.out.println("The result of the list1 is: "+abcd[i][j]);

            }

        }

    }

    public void arrayTask(){

	    Scanner sc = new Scanner(System.in);
	    int[] arrayOne = new int[5];
	    List<Integer> arrayTwo = new ArrayList<Integer>();
        arrayTwo.add(1);
        arrayTwo.add(2);
        arrayTwo.add(3);
        arrayTwo.add(4);
	    arrayOne[0] = 5; 
	    arrayOne[1] = 9;
        arrayOne[2] = 6;
        arrayOne[3] = 11;
        System.out.println("Before reverse"+arrayTwo);
        System.out.println("array list ans: "+ Arrays.toString(arrayOne));
        Collections.reverse(arrayTwo);
        System.out.println("after reverse"+arrayTwo);


    }

    public void array_oct(){
	    ArrayList<String> stringOne = new ArrayList<>();
	    stringOne.add("One");
        stringOne.add("Two");
        stringOne.add("Three");
        stringOne.add("Four");
        stringOne.add("Five");
        stringOne.add("Six");
        stringOne.add("Seven");
        System.out.println(stringOne);

        for(int i=0 ; i<stringOne.size(); i++){
            System.out.println(stringOne.get(i));
        }
    }

    public void newMethodDec2021(int breakpoint){

        int odd=0;
        int even = 0;
	    ArrayList<Integer> abc = new ArrayList<Integer>(
                Arrays.asList(23,24,65,34,78,34,75,
                        286,296,72107,141,122,
                        7135,124,7153,176,217,
                        148,149,2650));
        /*
        abc.add(3);
	    abc.add(4);
        abc.add(5);
        abc.add(6);
        abc.add(7);
        abc.add(8);
        abc.add(11);
        abc.add(2);
        abc.add(33);
        abc.add(44);
        abc.add(55);
        abc.add(66);
        abc.add(77);
        abc.add(88);
        abc.add(99);
        abc.add(101);
        */


        for (int i=0; i < abc.size(); i+= 1){

            int number = abc.get(i);

            if (number % 2 == 0 ) {
                System.out.println("The even numbers are: "+number);
            }

            else if (number % 2 != 0 ) {
                //number=odd;
                System.out.println("The odd numbers are: "+number);
            }
        }


    }

    public void forEachArray(){
        int[] arrayOne = {1,2,3,4,5,6,7,8,9};

        for (int i: arrayOne){
            System.out.println(i);
        }
    }

    public void nestedFor(){
        /*
        int a = 3;
        for(int i=1; i<=a; i++){
            for (int j=a; j>=1; j--) {
                System.out.println(i +"   "+j);
            }
        }

         */
        int[][] a = {{1,2,3,4},{11,22,33,44}};
        System.out.println("The first array is: "+Arrays.toString(a));

    }

    public void whileLoopOne() {
        int a = 10;
        while (a < 15) {
            System.out.println("this is a test");
            System.out.println(a);
            a++;
        }

        int b = 15;
        while (b < 20) {
            System.out.println("this is a test two");
            b++;
        }

        // for loop
        int[] arrayOne = {1, 2, 3, 4, 5, 6};
        int size = arrayOne.length;
        System.out.println("the size of the array is: " + size);
        for (int i : arrayOne
        ) {
            System.out.println(i);
        }


        int abc = 10;

        // First do while loop
        do {
            System.out.println("This is the do while loop output");
            abc++;
        }
        while (abc < 15);

        // Second do while loop
        do {
            System.out.println("This is the do while loop output two");
            break;
        }
        while (abc < 20);

        for (int g = 1; g<= 100; g++){
            if (g == 11) {
                break;
            }
            System.out.print(g + "]  [");
            }

        ArrayList<Integer> arrayOne2 = new ArrayList<Integer>(Arrays.asList(5,10,15,20));
        for (int i=0; i<= arrayOne2.size();  i++){
            for (int k = 0; k < i; k++) {
                System.out.println("The result is : " + arrayOne2.get(k));
            }
        }



    }

    public void E2EArrayPractice(){

        // initializing an arraylist of String
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Value1","testTwo","Value3","Value4","Value5"));
        //printing the whole arraylist of String
        System.out.println("The list of String is: "+list1);
        //printing a specific value of String arraylist
        System.out.println("The first value of String is: "+ list1.get(0));


        // initializing an arraylist of double
        ArrayList<Double> list3 = new ArrayList<Double>(Arrays.asList(234.0, 234.34,35.234,456.234));
        //printing the whole arraylist of double
        System.out.println("The list of double is: "+ list3);
        //printing a specific value of double arraylist
        System.out.println("The first value of of double is: "+ list3.get(0));


        // initializing an arraylist of integer
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(3,4,5,35,345,234));
        //printing the whole arraylist of integers
        System.out.println("The list of Integer is: "+ list2);
        //printing a specific value of integer arraylist
        System.out.println("The first value of Integer is: "+ list2.get(0));

        //declaring a linked list
        //List<Integer> abcde = new List<Integer>(Integer);

        for (int i=0; i<=list1.size();  i++){
            if(list1.get(i).contentEquals("Value1")){
                System.out.println("The whole data is: "+list1.get(i+1));
                break;
            }

        }

        for (int j :list2
        ) {
            if(5==5){

            }
            System.out.println("$$"+j);

        }

        ArrayList<Integer> forArray = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        int sumEven=0;
        int sumOdd=0;
        System.out.println("The array for test is: "+forArray);
        for (int i = 0; i < forArray.size(); i++) {
            //for (int p ; forArray)
            int j = forArray.get(i);
            if (j % 2 == 0) {
                sumEven+= j;
                evenList.add(j);
            } else {
                oddList.add(j);
                sumOdd+= j;
            }
        }
        System.out.println("The even list is: " + evenList);
        System.out.println("The odd list is: " + oddList);
        System.out.println("The sum of even is: " + sumEven);
        System.out.println("The sum of odd is: " + sumOdd);
        System.out.println("The sum of odd is: " + sumOdd);

        int[] a = {0,1,2,3,4,5,6,5};
        int t = 0;
        int q = 11;
        int[] bb;
        System.out.println("The initial array is: " +Arrays.toString(a));
        for(int i=0; i<a.length-1; i++){
            t = i+(i+1);
            System.out.println("result of array is: " +  t );
            if(t==q){
                System.out.println("result paisi "+i + (i+1));
            }
            else{
                System.out.println("result painai " );
            }
            /*
            if(i+i == t){
                System.out.println("the ressult is: "+i);
            }
            */
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide your size of array");
        int arraysize = sc.nextInt();

        int array[] = new int[arraysize];
        System.out.println("Provide your elements of array");
        for(int i=0; i<arraysize; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The elements of the array is: " );
        for(int j=0; j<arraysize; j++){
            System.out.print(array[j]+" ");
        }
        System.out.println("The final array is: "+Arrays.toString(array) );
    }

    public void arraychangeViaInput(){
	    int target = 9;
        int arrayOne[] = {1,2,3,4,5,6,7,8};
        int arrayTwo[] = {};
        System.out.println(Arrays.toString(arrayOne));
        arrayOne[2]=99;
        System.out.println(Arrays.toString(arrayOne));

        for (int i =0; i<arrayOne.length-1; i++){
            for (int j=i+1; j< arrayOne.length; j++){
                System.out.println("... "+i+" ..."+j);
                if(arrayOne[i]+arrayOne[j] == target){
                    System.out.println("...// "+i+" //..."+j);
                }
            }
        }

        int[] arrayThree = new int[5];
        int[] arrayFour = new int[5];
        int j=0;
        int k=0;
        arrayThree[0] = 10;
        arrayThree[1] = 654;
        arrayThree[2] = 400;
        arrayThree[3] = 87;
        arrayThree[4] = 800;
        System.out.println(Arrays.toString(arrayThree));
        System.out.println(arrayThree.length);

        /*
        for (int i =0; i< arrayThree.length; i++) {
            //System.out.print("___"+arrayThree[i]);
            if (arrayThree[i] > maxValue) {
                maxValue = arrayThree[i];
                //System.out.println("the max value1 is: " + maxValue);
            }
            //System.out.println("the max value2 is: " + maxValue);
        }
        */

        int maxValue= arrayThree[0];
        int minValue= arrayThree[0];
        for (int i =0; i< arrayThree.length; i++) {
            if (arrayThree[i] < minValue) {
                minValue = arrayThree[i];
            }
            else if(arrayThree[i] > maxValue){
                maxValue = arrayThree[i];
            }
        }
        System.out.println("the max value3 is: " + maxValue);
        System.out.println("the min value2 is: " + minValue);

        ArrayList<Integer> arrayListOne = new ArrayList<>(Arrays.asList(32,12,54,23,12));
        ArrayList<Integer> arrayListTwo = null;
        System.out.println("The initial arraylist before removing duplicate Item: "+arrayListOne);

        arrayListOne.remove(0);
        System.out.println("after one manual remove: "+arrayListOne);
        for (int i =0; i< arrayListOne.size(); i++){
            int m = arrayListOne.get(i);
            if(m==arrayListOne.get(i)){
                //arrayListOne.remove(arrayListOne.get(i));
                //int index = arrayListOne.get(i);
                arrayListOne.remove(i);
            }
        }
        System.out.println("The final arraylist after removing duplicate Item: "+arrayListOne);


    }

    public void rubyTest() {

	    ArrayList<Integer> arrayOne = new ArrayList<>(Arrays.asList(11,12,13,15,14,17,19));
        System.out.println("The first array is: "+arrayOne);

        ArrayList<Integer> arrayTwo = new ArrayList<>(Arrays.asList(14,15,16,17,13));
        System.out.println("The second array is: "+arrayTwo);

        //arrayOne.addAll(arrayTwo);
        //System.out.println("The array after addition is: "+arrayOne);

        ArrayList<Integer> arrayThree= new ArrayList<>();

        int initialValue =  arrayTwo.get(0);
/*
        for (int i = 0; i < arrayOne.size(); i++){
            int j = arrayOne.get(i);
            if(j==arrayOne.get(i)){
                arrayOne.remove(i);
                //arrayOne.remove(j);
            }
        }


        int j =0;
        int l =0;
        for (int i =0; i<arrayOne.size(); i++){
            j = arrayOne.get(i);
            for(int k = 0; k<arrayTwo.size(); k++){
                l =  arrayTwo.get(k);
                if(j!=l){
                    arrayThree.add(l);
                }
            }

        }
  */

        for (int i =0; i< arrayOne.size(); i++){
            if(!arrayTwo.contains(arrayOne.get(i))){
                arrayThree.add(arrayOne.get(i));
            }

        }

        for (int i =0; i< arrayTwo.size(); i++){
            if(!arrayOne.contains(arrayTwo.get(i))){
                if(!arrayThree.contains(arrayTwo.get(i)))
                arrayThree.add(arrayTwo.get(i));
            }

        }

        System.out.println("The final array is: "+arrayThree);

    }

}
