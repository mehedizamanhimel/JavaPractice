

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTasks {

    public void arrayAdd() {
        ArrayList<String> employee = new ArrayList<String>();
        employee.add("Mehedi");
        employee.add("Zaman");
        employee.add("Himel");
        System.out.println("after adding full name" + employee);
        employee.remove(1);
        System.out.println("after removing 2nd string" + employee);
    }

    public void arList() {
        ArrayList<String> abcd = new ArrayList<String>();
        abcd.add("ab");
        abcd.add("de");
        abcd.add("cd");
        abcd.add("bd");

        System.out.println("The arraylist before sorting" + abcd);

        Iterator i = abcd.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());

        }

        Collections.sort(abcd);
        System.out.println("The arraylist after sorting" + abcd);

        Collections.sort(abcd, Collections.reverseOrder());
        System.out.println("The arraylist after reverse sorting" + abcd);


    }

    public void arList_int() {
        ArrayList<Integer> abcd = new ArrayList<Integer>();
        abcd.add(11);
        abcd.add(44);
        abcd.add(33);
        abcd.add(22);

        System.out.println("The arraylist before sorting" + abcd);

        Collections.sort(abcd);
        System.out.println("The arraylist after sorting" + abcd);

        Collections.sort(abcd, Collections.reverseOrder());
        System.out.println("The arraylist after reverse sorting" + abcd);
    }

    public void arList_double() {
        ArrayList<Double> abcd = new ArrayList<Double>();
        abcd.add(11.0);
        abcd.add(44.0);
        abcd.add(33.0);
        abcd.add(22.0);
        System.out.println("The list of array before sorting" + abcd);

        Collections.sort(abcd);

    }


    public void listSortStrint() {
        List<String> slist = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");
        List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    public void listSortStringTwo() {
        List<String> slist = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");
        List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    public void arrayoperations() {
        String abcd[] = {"mehedi", "zaman", "himel"};
        LinkedList<String> abcde = new LinkedList<String>();
        abcde.add("Mohammad");
        abcde.add("Mehedi");
        abcde.add("Zaman");
        abcde.add("Himel");
        System.out.println("the linked list item is: " + abcde);
        abcde.removeFirst();
        System.out.println("the linked list after deleting first item is: " + abcde);
        abcde.removeLast();
        System.out.println("the linked list after deleting last item is: " + abcde);
    }

    public static void arMerge() {
        int[] fistArray = {1, 2, 3, 4};
        int[] secondArray = {5, 6, 7, 8};
        int fal = fistArray.length;
        int sal = secondArray.length;
        int[] sumlength = new int[fal + sal];
        System.arraycopy(fistArray, 0, sumlength, 0, fal);
        System.arraycopy(secondArray, 0, sumlength, fal, sal);

        System.out.println(Arrays.toString(sumlength));

        int length = sumlength.length;
        int mid = length / 2;
        System.out.println(sumlength[mid]);

    }

    public void foundELementLocation() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int b = 4;

        int c = a.length;
        int d;
        for (int i = 0; i >= c; i++) {
        }
    }

    public void findSmallestInArray() {
        int a[] = {23, 23, 11, 24, 53, 6354, 8, 0};
        int b[] = {21, 12, 31231, 123213};
        Arrays.sort(a);
        System.out.println("The smallest array is: " + a[0]);
    }

    public void SumofTwoArray() {
        int a[] = {23, 23, 11, 24, 53, 6354, 8, 0};
        int b[] = {21, 12, 31231, 123213};
        int c = a[0] + b[0] + a[3];
        System.out.println("The sum of two array element is: " + c);

    }


    public void hr_2dArray_for() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] abcd = {1, 2, 3, 4, 5, 6};
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        //arrayList.add(2,5);

        int b = 0;
        for (int i = 0; i <= arrayList.size(); i++) {
            System.out.println(arrayList);

            break;
        }
        System.out.println("the list is" + b);
    }

    public void hr_2dArray_forEach() {
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

        for (int i : arrayList) {
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
        System.out.println("Before sorting" + arrayList);
        //Collections.sort(arrayList, Collections.reverseOrder());
        Collections.reverse(arrayList);
        System.out.println("After sorting" + arrayList);
    }


    public void arrayDeclare() {

        int[] abcd = {1, 2, 3, 4};
        int[] abcd2 = new int[5];
        int abcd3[] = {4, 5, 6, 6, 6, 7, 7, 9};

        //ArrayList<Integer> abcd2 = {1,2,3,5,6};

        System.out.println(abcd3[1] + abcd[2]);
        System.out.println(abcd2.length);
        int b = 0;

    }

    public void TwoDArrayOne() {

        int abcd[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}};
        int firstArrayValue = abcd[0][2];
        int secondArrayValue = abcd[1][2];

        int abcd2[][];

        System.out.println("firstArrayValue: " + firstArrayValue);
        System.out.println("secondArrayValue: " + secondArrayValue);

        for (int i = 0; i < abcd.length; i++) {

            for (int j = 0; j < abcd[i].length; j++) {

                System.out.println("The result of the list1 is: " + abcd[i][j]);

            }

        }

    }

    public void arrayTask() {

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
        System.out.println("Before reverse" + arrayTwo);
        System.out.println("array list ans: " + Arrays.toString(arrayOne));
        Collections.reverse(arrayTwo);
        System.out.println("after reverse" + arrayTwo);


    }

    public void array_oct() {
        ArrayList<String> stringOne = new ArrayList<>();
        stringOne.add("One");
        stringOne.add("Two");
        stringOne.add("Three");
        stringOne.add("Four");
        stringOne.add("Five");
        stringOne.add("Six");
        stringOne.add("Seven");
        System.out.println(stringOne);

        for (int i = 0; i < stringOne.size(); i++) {
            System.out.println(stringOne.get(i));
        }
    }

    public void newMethodDec2021(int breakpoint) {

        int odd = 0;
        int even = 0;
        ArrayList<Integer> abc = new ArrayList<Integer>(
                Arrays.asList(23, 24, 65, 34, 78, 34, 75,
                        286, 296, 72107, 141, 122,
                        7135, 124, 7153, 176, 217,
                        148, 149, 2650));
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


        for (int i = 0; i < abc.size(); i += 1) {

            int number = abc.get(i);

            if (number % 2 == 0) {
                System.out.println("The even numbers are: " + number);
            } else if (number % 2 != 0) {
                //number=odd;
                System.out.println("The odd numbers are: " + number);
            }
        }


    }

    public void forEachArray() {
        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i : arrayOne) {
            System.out.println(i);
        }
    }

    public void nestedFor() {
        /*
        int a = 3;
        for(int i=1; i<=a; i++){
            for (int j=a; j>=1; j--) {
                System.out.println(i +"   "+j);
            }
        }

         */
        int[][] a = {{1, 2, 3, 4}, {11, 22, 33, 44}};
        System.out.println("The first array is: " + Arrays.toString(a));

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

        for (int g = 1; g <= 100; g++) {
            if (g == 11) {
                break;
            }
            System.out.print(g + "]  [");
        }

        ArrayList<Integer> arrayOne2 = new ArrayList<Integer>(Arrays.asList(5, 10, 15, 20));
        for (int i = 0; i <= arrayOne2.size(); i++) {
            for (int k = 0; k < i; k++) {
                System.out.println("The result is : " + arrayOne2.get(k));
            }
        }


    }

    public void E2EArrayPractice() {

        // initializing an arraylist of String
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Value1", "testTwo", "Value3", "Value4", "Value5"));
        //printing the whole arraylist of String
        System.out.println("The list of String is: " + list1);
        //printing a specific value of String arraylist
        System.out.println("The first value of String is: " + list1.get(0));


        // initializing an arraylist of double
        ArrayList<Double> list3 = new ArrayList<Double>(Arrays.asList(234.0, 234.34, 35.234, 456.234));
        //printing the whole arraylist of double
        System.out.println("The list of double is: " + list3);
        //printing a specific value of double arraylist
        System.out.println("The first value of of double is: " + list3.get(0));


        // initializing an arraylist of integer
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 35, 345, 234));
        //printing the whole arraylist of integers
        System.out.println("The list of Integer is: " + list2);
        //printing a specific value of integer arraylist
        System.out.println("The first value of Integer is: " + list2.get(0));

        //declaring a linked list
        //List<Integer> abcde = new List<Integer>(Integer);

        for (int i = 0; i <= list1.size(); i++) {
            if (list1.get(i).contentEquals("Value1")) {
                System.out.println("The whole data is: " + list1.get(i + 1));
                break;
            }

        }

        for (int j : list2
        ) {
            if (5 == 5) {

            }
            System.out.println("$$" + j);

        }

        ArrayList<Integer> forArray = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        int sumEven = 0;
        int sumOdd = 0;
        System.out.println("The array for test is: " + forArray);
        for (int i = 0; i < forArray.size(); i++) {
            //for (int p ; forArray)
            int j = forArray.get(i);
            if (j % 2 == 0) {
                sumEven += j;
                evenList.add(j);
            } else {
                oddList.add(j);
                sumOdd += j;
            }
        }
        System.out.println("The even list is: " + evenList);
        System.out.println("The odd list is: " + oddList);
        System.out.println("The sum of even is: " + sumEven);
        System.out.println("The sum of odd is: " + sumOdd);
        System.out.println("The sum of odd is: " + sumOdd);

        int[] a = {0, 1, 2, 3, 4, 5, 6, 5};
        int t = 0;
        int q = 11;
        int[] bb;
        System.out.println("The initial array is: " + Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++) {
            t = i + (i + 1);
            System.out.println("result of array is: " + t);
            if (t == q) {
                System.out.println("result paisi " + i + (i + 1));
            } else {
                System.out.println("result painai ");
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

        for (int i = 0; i < arraysize; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("The elements of the array is: ");
        for (int j = 0; j < arraysize; j++) {
            System.out.print(array[j] + ": ");
        }

        System.out.println("The final array is: " + Arrays.toString(array));

    }

    public void arraychangeViaInput() {
        int target = 9;
        int arrayOne[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int arrayTwo[] = {};
        System.out.println(Arrays.toString(arrayOne));
        arrayOne[2] = 99;
        System.out.println(Arrays.toString(arrayOne));

        for (int i = 0; i < arrayOne.length - 1; i++) {
            for (int j = i + 1; j < arrayOne.length; j++) {
                System.out.println("... " + i + " ..." + j);
                if (arrayOne[i] + arrayOne[j] == target) {
                    System.out.println("...// " + i + " //..." + j);
                }
            }
        }

        int[] arrayThree = new int[5];
        int[] arrayFour = new int[5];
        int j = 0;
        int k = 0;
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

        int maxValue = arrayThree[0];
        int minValue = arrayThree[0];
        for (int i = 0; i < arrayThree.length; i++) {
            if (arrayThree[i] < minValue) {
                minValue = arrayThree[i];
            } else if (arrayThree[i] > maxValue) {
                maxValue = arrayThree[i];
            }
        }
        System.out.println("the max value3 is: " + maxValue);
        System.out.println("the min value2 is: " + minValue);

        ArrayList<Integer> arrayListOne = new ArrayList<>(Arrays.asList(32, 12, 54, 23, 12));
        ArrayList<Integer> arrayListTwo = null;
        System.out.println("The initial arraylist before removing duplicate Item: " + arrayListOne);

        arrayListOne.remove(0);
        System.out.println("after one manual remove: " + arrayListOne);
        for (int i = 0; i < arrayListOne.size(); i++) {
            int m = arrayListOne.get(i);
            if (m == arrayListOne.get(i)) {
                //arrayListOne.remove(arrayListOne.get(i));
                //int index = arrayListOne.get(i);
                arrayListOne.remove(i);
            }
        }
        System.out.println("The final arraylist after removing duplicate Item: " + arrayListOne);
    }

    public void rubyTest() {

        ArrayList<Integer> arrayOne = new ArrayList<>(Arrays.asList(11, 12, 13, 15, 14, 17, 19));
        System.out.println("The first array is: " + arrayOne);

        ArrayList<Integer> arrayTwo = new ArrayList<>(Arrays.asList(14, 15, 16, 17, 13));
        System.out.println("The second array is: " + arrayTwo);

        //arrayOne.addAll(arrayTwo);
        //System.out.println("The array after addition is: "+arrayOne);

        ArrayList<Integer> arrayThree = new ArrayList<>();

        int initialValue = arrayTwo.get(0);

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

        for (int i = 0; i < arrayOne.size(); i++) {
            if (!arrayTwo.contains(arrayOne.get(i))) {
                arrayThree.add(arrayOne.get(i));
            }
        }

        for (int i = 0; i < arrayTwo.size(); i++) {
            if (!arrayOne.contains(arrayTwo.get(i))) {
                if (!arrayThree.contains(arrayTwo.get(i)))
                    arrayThree.add(arrayTwo.get(i));
            }
        }

        System.out.println("The final array is: " + arrayThree);

    }


    public void leetcode_One() {
        ArrayList<Integer> arrayListOne = new ArrayList<>
                (Arrays.asList(1, 1, 2, 2, 3, 2, 3, 4, 4, 5, 1, 5, 1, 6, 6, 7, 6, 6));
        System.out.println(arrayListOne);
        ArrayList<Integer> arrayListTwo = new ArrayList<>();

        int temp = 0;
        int temp2 = 0;
        int max = arrayListOne.get(0);

        for (int i = 0; i < arrayListOne.size(); i++) {
            System.out.print(" //the regular value: " + arrayListOne.get(i));
            System.out.println(" //the +1 value: " + arrayListOne.get(i + 1));


            /*
            else if (!arrayListOne.contains(temp)){
                arrayListOne.remove(temp);
            }

            if (temp==max){
                arrayListOne.remove(max);
            }
            */

        }
        System.out.println(arrayListTwo);
    }

    public void fullPhase() {
        Scanner sc = new Scanner(System.in);


	    /*
	    System.out.print("Enter your arrayLength: ");
	    int arraySize = sc.nextInt();
	    int[] arr = new int[arraySize];
	    int sum =0;

	    //Inserting array data via scanner input
	    for (int i=0; i< arraySize; i++){
            System.out.print("Enter your arraydata: ");
            int arrayData = sc.nextInt();
            arr[i] = arrayData;
        }

	    //printing out final array with data
        System.out.println("The first array is : "+ Arrays.toString(arr));

	    // 02. Write a Java program to sum values of an array
        for (int i: arr){
            System.out.println("---- The elements of array is: "+i);
            sum+=i;
        }

        // 04. Write a Java program to calculate the average value of array elements.
        System.out.println("---- The sum of array is: "+sum);
        System.out.println("---- The average of array is: "+sum/arraySize);

        // declaring arrayList1
        ArrayList<Integer> arrayIntOne = new ArrayList<Integer>();
        System.out.println("Enter your first arrayListSize: ");
        int Size_arrayIntOne = sc.nextInt();

        //inserting data via input method
        System.out.println("Enter your first arrayListdata: ");
        for (int i=0; i<Size_arrayIntOne ; i++){
            arrayIntOne.add(sc.nextInt());
        }
        System.out.println("Your first arrayList is: "+arrayIntOne);

        // 01. Write a Java program to sort a numeric array and a string array
        Collections.sort(arrayIntOne);
        System.out.println("Your sorted array is: "+arrayIntOne);


        //Create an array and filter different values from that array

        ArrayList<Integer> wholeList = new ArrayList<>(Arrays.asList
                (123,432,123,654,324,546,17,19,10, 21,22,25,11,12,16,35,33,32,5,8,2,1,1,124,123,23));
        ArrayList<Integer> arrayOf10s = new ArrayList<>();
        ArrayList<Integer> arrayOf20s = new ArrayList<>();
        ArrayList<Integer> arrayOf30s = new ArrayList<>();
        for(int i=0; i< wholeList.size(); i++){
            if (wholeList.get(i)<20 && wholeList.get(i)>9){
                arrayOf10s.add(wholeList.get(i));
                Collections.sort(arrayOf10s);
            }
            else if (wholeList.get(i)<30 && wholeList.get(i)>19){
                arrayOf20s.add(wholeList.get(i));
                Collections.sort(arrayOf20s);
            }
            //else if (wholeList.get(i)<40 && wholeList.get(i)>29){
            else if (wholeList.get(i)>29){
                arrayOf30s.add(wholeList.get(i));
                Collections.sort(arrayOf30s);
            }
        }

        System.out.println(wholeList+ "\n" +"Your sorted array is: "+
                "\n"+arrayOf10s+"\n"+arrayOf20s+"\n"+arrayOf30s);

        for (int i =0; i < arrayOf20s.size(); i++){
            System.out.println("The indexes are: "+i);
            System.out.println("The index based values are: "+arrayOf20s.get(i));
        }


	     */

        // 3. Write a Java program to print the following grid.

        int a = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("    ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(" -");

            }
        }


        ArrayList<Integer> arrayOne = new ArrayList<>(Arrays.asList(15, 21, 32, 0, 565, 4, 5, 89));

        int max = arrayOne.get(0);
        int min = arrayOne.get(0);


        System.out.println("the first array is: " + arrayOne);

        // 07. Write a Java program to remove a specific element from an array.
        for (int i = 0; i < arrayOne.size(); i++) {
            if (arrayOne.get(i) == 5) {
                arrayOne.remove(arrayOne.get(i));
            }
        }

        // 10. Write a Java program to find the maximum and minimum value of an array.
        for (int i = 0; i < arrayOne.size(); i++) {
            if (max < arrayOne.get(i)) {
                max = arrayOne.get(i);
            }
            if (min > arrayOne.get(i)) {
                min = arrayOne.get(i);
            }
        }
        System.out.println("the biggest number of array is: " + max);
        System.out.println("the smallest number of array is: " + min);
        System.out.println("the array after removing element is: " + arrayOne);
        // 11. Write a Java program to reverse an array of integer values.
        Collections.reverse(arrayOne);
        System.out.println("the array after reversing is: " + arrayOne);


        //13. Write a Java program to find the duplicate values of an array of string values.
        ArrayList<String> arrayString = new ArrayList<>(Arrays.asList
                ("Rony", "Mony", "Tony", "Jony", "Bini", "Rony", "Jony", "abc", "abc"));

        ArrayList<String> arrayStringWithDuplicate = new ArrayList<>();
        System.out.println("The string arraylist is: " + arrayString);

        String duplicate = "";

        for (int i = 0; i < arrayString.size() - 1; i++) {
            for (int j = i + 1; j < arrayString.size(); j++) {
                //System.out.println("the duplicate strings are: " + arrayString.get(j));
                if (arrayString.get(i) == arrayString.get(j) && (i != j)) {
                    System.out.println("the duplicate strings are: " + arrayString.get(j));
                    arrayStringWithDuplicate.add(arrayString.get(j));
                }
            }
        }
        System.out.println("The arraylist with duplicate values are: " + arrayStringWithDuplicate);

        // 14.  Write a Java program to find the common elements between two arrays (string values).
        ArrayList<String> commonArr1 = new ArrayList<>(Arrays.asList("aa", "bb", "cc", "ee"));
        ArrayList<String> commonArr2 = new ArrayList<>(Arrays.asList("bb", "cc", "dd", "ee"));
        ArrayList<String> finalarr = new ArrayList<>();

        HashSet<String> hash = new HashSet<>();

        for (int i = 0; i < commonArr1.size(); i++) {
            for (int j = 0; j < commonArr2.size(); j++) {
                if (commonArr1.get(i).equals(commonArr2.get(j))) {
                    finalarr.add(commonArr1.get(i));
                }
            }
        }
        System.out.println("The arraylist of common String values are: " + finalarr);

        // 15. Write a Java program to find the common elements between two arrays of integers.
        ArrayList<Integer> intarr1 = new ArrayList<>(Arrays.asList(11, 22, 33, 44));
        ArrayList<Integer> intarr2 = new ArrayList<>(Arrays.asList(33, 44, 55, 66, 77));
        ArrayList<Integer> intarr3 = new ArrayList<>();
        for (int i = 0; i < intarr1.size(); i++) {
            for (int j = 0; j < intarr2.size(); j++) {
                if (intarr1.get(i) == intarr2.get(j)) {
                    intarr3.add(intarr1.get(i));
                }
            }
        }
        System.out.println("The arraylist of two common int arrays are: " + intarr3);

        // 16. Write a Java program to remove duplicate elements from an array.
        ArrayList<Integer> intarr4 = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 55, 11, 66, 22, 77));
        Collections.sort(intarr4);
        for (int i = 0; i < intarr4.size(); i++) {
            for (int j = i + 1; j < intarr4.size(); j++) {
                if (intarr4.get(i) == intarr4.get(j)) {
                    intarr4.remove(i);
                }
            }
        }
        System.out.println("The arraylist after removing duplicate elements: " + intarr4);

        // 17. Write a Java program to find the second largest element in an array

        ArrayList<Integer> intarr5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 123, 345, 112, 5, 6, 7, 8, 9));
        Collections.sort(intarr5);
        int largestNum = 0;
        int secondLargestNum = 0;
        for (int i = 0; i < intarr5.size() - 1; i++) {
            for (int j = i + 1; j < intarr5.size(); j++) {
                if (intarr5.get(i) != intarr5.get(j)) {
                    largestNum = intarr5.get(j);
                    secondLargestNum = intarr5.get(i);
                }
            }
        }
        System.out.println("The Largest number is: " + largestNum);
        System.out.println("The second Largest number is: " + secondLargestNum);

        // 18. Write a Java program to find the second smallest element in an array.
        Collections.reverse(intarr5);
        System.out.println("The Reverse array is: " + intarr5);

        int smallestNum = 0;
        int secondSmallestNum = 0;
        for (int i = 0; i < intarr5.size() - 1; i++) {
            for (int j = i + 1; j < intarr5.size(); j++) {
                if (intarr5.get(i) != intarr5.get(j)) {
                    smallestNum = intarr5.get(j);
                    secondSmallestNum = intarr5.get(i);
                }
            }
        }
        System.out.println("The smallest number is: " + smallestNum);
        System.out.println("The second smallest number is: " + secondSmallestNum);

        // 19. Write a Java program to add two matrices of the same size
        // 20. Write a Java program to convert an array to ArrayList.

        ArrayList<Integer> intarr6 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Problem 20- The int arrayList before converting to array: " + intarr6);
        int[] arr2 = new int[5];
        for (int i = 0; i < intarr6.size(); i++) {
            arr2[i] = intarr6.get(i);
        }
        System.out.println("Problem 20- The int arraylist after converting to array: " + Arrays.toString(arr2));

        // 21. Write a Java program to convert an ArrayList to an array.
        int arr3[] = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> intarr7 = new ArrayList<>();
        System.out.println("Problem 21- The int array before converting to arraylist: " + Arrays.toString(arr3));

        for (int i = 0; i < arr3.length; i++) {
            intarr7.add(arr3[i]);
        }

        System.out.println("Problem 21- The int array after converting to arraylist: " + intarr7);

        // 22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.

        ArrayList<Integer> arrayProblem22 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int val = 6;

        for (int i = 0; i < arrayProblem22.size(); i++) {
            for (int j = i + 1; j < arrayProblem22.size(); j++) {
                if (arrayProblem22.get(i) + arrayProblem22.get(j) == val) {
                    System.out.println("The solution of problem 22 is: ");
                    System.out.println(arrayProblem22.get(i) + " + " + arrayProblem22.get(j) + " = " + val);
                }
            }
        }


        // 23. Write a Java program to test the equality of two arrays.
        // 24. Write a Java program to find a missing number in an array.
        // 25. Write a Java program to find common elements from three sorted (in non-decreasing order) arrays.

        ArrayList<Integer> searchArray1 = new ArrayList<>(Arrays.asList(4, 1, 5, 3, 2, 6));
        Collections.sort(searchArray1);
        ArrayList<Integer> searchArray2 = new ArrayList<>(Arrays.asList(5, 6, 4, 9, 7, 12));
        Collections.sort(searchArray2);
        ArrayList<Integer> searchArray3 = new ArrayList<>(Arrays.asList(12, 12, 13, 14, 5, 4, 21, 6));
        Collections.sort(searchArray3);
        ArrayList<Integer> searchArray4 = new ArrayList<>();

        for (int i = 0; i < searchArray1.size(); i++) {
            for (int j = 0; j < searchArray2.size(); j++) {
                if (searchArray1.get(i) == searchArray2.get(j)) {
                    for (int k = 0; k < searchArray3.size(); k++) {
                        if (searchArray2.get(j) == searchArray3.get(k)) {
                            searchArray4.add(searchArray3.get(k));
                            //System.out.println("The common elements are : " + searchArray4);
                        }
                    }
                }
            }
        }
        System.out.println("Problem 25- The common elements are : " + searchArray4);

        // 26. Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.


        // 27. Write a Java program to find the number of even and odd integers in a given array of integers.

        ArrayList<Integer> arrOddEven = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 66));
        ArrayList<Integer> arrOdd = new ArrayList<>();
        ArrayList<Integer> arrEven = new ArrayList<>();
        for (int i = 0; i < arrOddEven.size(); i++) {
            if (arrOddEven.get(i) % 2 == 0 && arrOddEven.get(i) != 0) {
                arrEven.add(arrOddEven.get(i));
            } else {
                arrOdd.add(arrOddEven.get(i));
            }
        }
        System.out.println("Problem 27- arrOddEven: " + arrOddEven);
        System.out.println("Problem 27- arrOdd: " + arrOdd);
        System.out.println("Problem 27- arrEven: " + arrEven);

        // 28. Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.

        ArrayList<Integer> listArray = new ArrayList<>(Arrays.asList(5, 4, 6, 9, 2, 3));
        int largest = listArray.get(0);
        int smallest = listArray.get(0);

        System.out.println("The array is: " + listArray);
        for (int i = 0; i < listArray.size(); i++) {

            if (largest < listArray.get(i)) {
                largest = listArray.get(i);
            }

            if (smallest > listArray.get(i)) {
                smallest = listArray.get(i);
            }
        }

        System.out.println("Problem 28- The largest number is: " + largest);
        System.out.println("Problem 28- The smallest number is: " + smallest);
        int difference = largest - smallest;
        System.out.println("Problem 28- The difference between largest and smallest number is: " + difference);
/*
        for (int i =0; i< listArray.size(); i++){
            for (int j =i+1; j< listArray.size(); j++){
                if(listArray.get(j)>listArray.get(i) && (i!=j)){
                    largest = listArray.get(j);

                }
            }
        }

        Collections.reverse(listArray);
        for (int i =0; i< listArray.size(); i++){
            for (int j =i+1; j< listArray.size(); j++){
                Collections.replaceAll(listArray, listArray.get(j), listArray.get(i));
                if(listArray.get(i)<listArray.get(j) && (j!=i) ){

                    smallest = listArray.get(i);
                }

            }
        }

 */


        // 29. Write a Java program to compute the average value of an array of integers except the largest and smallest values.

        ArrayList<Integer> listArray2 = new ArrayList<>(Arrays.asList(5, 4, 6, 9, 2, 3));

        Collections.sort(listArray2);
        int largest2 = listArray2.get(0);
        int smallest2 = listArray2.get(0);
        int index_max = 0;
        int index_min = 0;
        int sum = 0;

        System.out.println("The listArray2 array  is: " + listArray2);

        for (int i = 0; i < listArray2.size(); i++) {

            if (largest2 < listArray2.get(i)) {
                index_max = listArray2.indexOf(listArray2.get(i));
            }

            if (smallest2 > listArray2.get(i)) {
                index_min = listArray2.indexOf(listArray2.get(i));
            }

        }
        listArray2.remove(index_max);
        listArray2.remove(index_min);

        for (int i = 0; i < listArray2.size(); i++) {
            sum += listArray2.get(i);
        }

        System.out.println("Problem 29- The array is: " + listArray2);
        System.out.println("Problem 29- The sum is: " + sum);


        // 35. Write a Java program to find the sum of the two elements of a given array which is equal to a given integer. Sample array: [1,2,4,5,6] Target value: 6.


    }

    public void problem30() {
        ArrayList<Integer> arrayProb30 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, -1, -2));

        Boolean f = null;
        String S = "";

        for (int i = 0; i < arrayProb30.size(); i++) {
            if (arrayProb30.get(i).equals(1)) {
                S = "true";
                System.out.println(S);
            } else {
                S = "false";
                System.out.println(S);
            }
        }
        System.out.println("this is for testing the command line execution 1");
        System.out.println("this is for testing the command line execution 2");
        System.out.println("this is for testing the command line execution 3");
        System.out.println("this is for testing the command line execution 4");
        System.out.println("the result is: " + S);


        int[] array22 = {1, 2, 3, 4, 5, 6};
        int val = 6;
        for (int i = 0; i < array22.length; i++) {
            for (int j = i + 1; j < array22.length; j++) {
                if (array22[i] + array22[j] == val) {
                    System.out.println(array22[i] + " " + array22[j] + " " + val);
                }
            }
        }


        String initial_milage = "10.000 km";
        int final_Milage = 0;
        //milage = milage.replaceAll("abcdefghijklmnopqrstuvwxyz.,","#");
        initial_milage = initial_milage.replace(" km", "");
        initial_milage = initial_milage.replace(".", "");
        System.out.println("The milage values are: " + initial_milage);
        final_Milage = Integer.parseInt(initial_milage);
        System.out.println("The milage values in int are: " + final_Milage);


        // 30. Write a Java program to check if an array of integers without 0 and -1

        ArrayList<Integer> array30 = new ArrayList<>(Arrays.asList(1, 2, 0, 3, -1, 6));

        if (array30.contains(-1) && array30.contains(0)) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }


        // 31. Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.

        ArrayList<Integer> array31 = new ArrayList<>(Arrays.asList(1, 15, 15, 21, 5, 8, 9, 7));

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 30;
        //int s= scanner.nextInt();


        System.out.println("Started");
        for (int i = 0; i < array31.size(); i++) {
            if (array31.get(i) <= 10) {
                sum = sum + array31.get(i);

            }
        }

        if (sum == 30) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }


        int[] abcd = {1, 2, 3, 4};
        int[] abc = new int[2];
        for (int i = 0; i < abc.length; i++) {
            abc[i] = 5;
        }
        System.out.println(Arrays.toString(abcd));
        System.out.println(Arrays.toString(abc));


        System.out.println("ended");
    }


    public void arrT() {
        Scanner sc = new Scanner(System.in);
        boolean bool = false;

        int[] arr = {3, 1, 7, 11};
        System.out.println("initial" + Arrays.toString(arr));

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int second = arr[j];
                if (second == first * 2) {

                } else if (first % 2 == 0) {

                    if (second == first / 2) {

                    }


                }

            }

        }

        int palindrome = 1000021;
        System.out.println(palindrome);
        String str = String.valueOf(palindrome);
        System.out.println(str);

        String s1 = "";


        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                s1 = "false";
            }
        }

        System.out.println(s1);

        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<Integer> list3 = new LinkedList<>();
        LinkedList<Integer> list4 = new LinkedList<>();


        for (int i = 0; i < list1.size(); i++) {
            list3.add(list1.get(i));
            list4.add(list1.get(i));

        }
        for (int j = 0; j < list2.size(); j++) {
            list3.add(list2.get(j));
            list4.add(list2.get(j));
        }
        Collections.sort(list3);
        System.out.println(list3);
        System.out.println(list4);

        int whil = 5;
        int whil2 = 7;
        while (whil == whil2) {
            System.out.println("printing");
        }

        String testStr = "abcde";
        int int1 = -12333;
        String testStr2 = "";

        char ch;
        System.out.println("The initial string is : " + testStr);
        StringBuilder builder = new StringBuilder();


        System.out.println("The reverse output is : " + builder);


        for (int i = 0; i < testStr.length(); i++) {
            ch = testStr.charAt(i);
            testStr2 = ch + testStr2;
        }

        System.out.println("The reverse output 2 is : " + testStr2);

        String testStr3 = Integer.toString(int1);
        String sss = "";
        for (int i = 0; i < testStr3.length(); i++) {
            ch = testStr3.charAt(i); // defining the individual character from string
            sss = ch + sss;
        }

        System.out.println("The reverse int output is : " + sss);

        String abcd = "abde1erer2sf3tyuth4fgh5";
        ArrayList<Integer> arr2 = new ArrayList<>();
        char c;

        for (int i = 0; i < abcd.length(); i++) {

        }

        int a = 1, b = 2, d = 3, sum = a + b;
        System.out.println(sum);
        // FL6ZLNKTJMMF


        /*
        34. Write a Java program to find the length of the longest consecutive elements
        sequence from a given unsorted array of integers.
        Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
        The longest consecutive elements sequence is [1, 2, 3, 4, 5],
        therefore the program will return its length 5.
         */

        ArrayList<Integer> problem34 = new ArrayList<>(Arrays.asList(49, 1, 3, 200, 2, 4, 70, 5));
        ArrayList<Integer> problem34_2 = new ArrayList<>();
        Collections.sort(problem34);

        int[] array34 = {4, 2, 6, 1, 3, 7};
        System.out.println(Arrays.toString(array34));
        Arrays.sort(array34);
        System.out.println(Arrays.toString(array34));

        for (int i = 0; i < problem34.size(); i++) {
            for (int j = i + 1; j < problem34.size(); j++) {
                int k = problem34.get(i), l = problem34.get(j);
                if (l - k == 1) {
                    //problem34_2.add(l);
                    l = k;
                    problem34_2.add(k);
                }
            }
        }
        System.out.println("the solution of problem 34 is : " + problem34_2);


        int x = 12234;
        String str2 = Integer.toString(x);
        char e, f;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            d = d + c;
            System.out.print(d);
        }

        // 32. Write a Java program to check if an array of integers contains two specified elements 65 and 77
        int[] arr32 = {33, 44, 55, 77, 54, 65, 88};
        for (int i = 0; i < arr32.length; i++) {
            if (arr32[i] == 65 || arr32[i] == 77) {
                System.out.println("TRue");
            }
            System.out.println("false");
        }

        Arrays.equals(arr32, arr32);
        str2.indexOf(2);

        System.out.println(str2);


        // adding two list and adding the sum of element in anothet list


        String s = "abcde efghi \"striasfasdfasdng\"ijklmiiii";
        String ss[] = s.split(" ");
        System.out.println(Arrays.toString(ss));
        int size = ss[ss.length - 1].length();
        System.out.println(size);
        String[] parenthesis = {"}", "{", "(", ")", "[", "]"};
        for (int i = 0; i < parenthesis.length; i++) {
            for (int j = i + 1; j < parenthesis.length; j++) {
                if (parenthesis[i].contains("")) {

                }
            }
        }

    }


    public void merge2() {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        int m = 3, n = 3, newSize = m + n;
        m = nums1.length;
        n = nums2.length;
        int[] arr = new int[newSize];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

            }
        }
        System.out.print("The final array of merging: " + Arrays.toString(arr));


        String hello = "heeelloooo  kkkilll";
        //char charA = 'a' ;
        char[] c = {'a', 'b', 'c'};
        char dp[] = new char[3];
        dp[0] = 'f';
        dp[1] = 'c';
        dp[2] = 'd';
        char cc = 0;
        int count = 0;
        for (int i = 0; i < hello.length(); i++) {
            for (int j = i + 1; j < hello.length(); j++) {
                if (hello.charAt(i) == hello.charAt(j)) {
                    count = +1;
                    cc = hello.charAt(i);
                }
            }
        }
        System.out.println("the count: " + count + "" + cc);
        System.out.println("the count: " + Arrays.toString(c));
        System.out.println("the count new char array: " + Arrays.toString(dp));

        /*

        33. Write a Java program to remove the duplicate elements
        of a given array and return the new length of the array.
        Sample array: [20, 20, 30, 40, 50, 50, 50]
        After removing the duplicate elements the program
        should return 4 as the new length of the array.

        */

        ArrayList<Integer> arr33 = new ArrayList<>(Arrays.asList(20, 20, 30, 40, 50, 50, 50));
        int ar31[] = {20, 20, 30, 40, 50, 50, 50};

        ArrayList<Integer> arr33_2 = new ArrayList<>();
        System.out.println("The new array33 before sorted: " + arr33);
        Collections.sort(arr33);
        System.out.println("The new array33 before removing duplicate and sorted: " + arr33);

        int temp = 1;
        for (int i = 1; i < arr33.size(); i++) {
            if (arr33.get(i) == arr33.get(temp - 1)) {
                arr33.remove(arr33.get(i));
            }
        }

        for (int i = 1; i < ar31.length; i++) {
            if (ar31[i] != ar31[temp - 1]) {
                ar31[temp++] = ar31[i];
            }
        }
        //arr33_2.add(temp);
        System.out.println("The new array33 after removing duplicate value is: " + Arrays.toString(ar31));
        System.out.println("The new array33 length is: " + ar31.length);
        System.out.println("The new array33 length is: " + temp);


        // tech issue resolving with char

        /*

        ArrayList<Character> arr1 = new ArrayList<>();

        String abcd = "Heeellooo Evvvee";
        char ch[] = abcd.toCharArray();
        int num = 1;
        for (int i=0; i< ch.length; i++){
            for (int j=i+1; j< abcd.length(); j++){
                if (abcd.charAt(i)==abcd.charAt(j)){
                    arr1.remove(abcd.charAt(j));
                    break;
                }
            }
        }

        System.out.println("The char array without duplicate value is: "+ arr1);
        System.out.println("The length duplicate value is: "+ num);

         */

        /*
        65. Write a Java program to find maximum difference between two elements
        in a given array of integers such that smaller element appears
        before larger element.
         */

        int[] arr65 = {2, 3, 1, 7, 9, 5, 11, 3, 5, -1, -7};
        //Arrays.sort(arr65);
        int min = arr65[0], max = arr65[0];

        for (int i = 1; i < arr65.length; i++) {
            if (arr65[i] < min) {
                min = arr65[i];
            } else if (max < arr65[i]) {
                max = arr65[i];
            }
        }

        int sum = max - min;

        System.out.println("The min is: " + min + "\n" + "The max is: " + max + "\n" + "The gap is: " + sum);

        Integer.reverse(sum);
        int s = Integer.compare(1001, 2002);
        System.out.println(s);

        int[] leet1 = {1, 2, 3, 4, 5, 6, 7};
        int leet2 = 3;
        for (int i = leet2 + 1; i < leet1.length; i++) {

        }

        int[][] arrl2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arrl3 = {{2, 7, 9}, {3, 6, 1, 2, 3, 4}, {7, 4, 2}, {7, 4, 2}, {7, 4, 2}};

        ArrayList<Integer> multi1 = new ArrayList<>();

        System.out.println("the 1st iteration: " + Arrays.toString(arrl3[0]));
        System.out.println("the 2nd iteration: " + Arrays.toString(arrl3[1]));
        System.out.println("the 3rd iteration: " + Arrays.toString(arrl3[2]));

        for (int i = 0; i < arrl3.length; i++) {
            System.out.println(Arrays.toString(arrl3[i]));
            for (int j = i + 1; j < arrl3.length; j++) {
                System.out.println(Arrays.toString(arrl3[j]));
            }
        }

        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println("The initial hashset: " + hashSet);
        int in = 11;
        for (int i = 0; i <= 10; i++) {
            hashSet.add(i);
        }
        System.out.println("The final hashset1: " + hashSet);
        do {
            hashSet.add(in);
            in++;
        }
        while (in <= 20);
        System.out.println("The final hashset2: " + hashSet);

        int twice[] = {5, 2, 4, 5, 5, 3};
        int numb = 122;
        String s3 = " ";

        int ssss = Integer.reverse(numb);
        StringBuilder build = new StringBuilder();


        System.out.println(ssss);

        HashSet<Character> charset = new HashSet<>();
        /*
        charset.add('a');
        charset.add('b');
        charset.add('c');

         */
        String abcd3 = "String";
        int tem = abcd3.length();
        char ccc = 0;
        System.out.println(charset);

        for (int i = 0; i < abcd3.length(); i++) {
            ccc = abcd3.charAt(i);
            charset.add(ccc);
        }
        System.out.println(charset);

        List<Integer> l1 = new ArrayList<>(Arrays.asList(5, 8, 5));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(2, 6, 4));
        List<Integer> l3 = new ArrayList<>();
        List<Object> l4 = new ArrayList<>();
        int abcd = 0;

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i) + "");
            for (int j = 0; j < l2.size(); j++) {
                System.out.print(l2.get(j) + "");
                l3.add(l1.get(i) + l2.get(j));
            }
            break;
        }

        System.out.println("The int is: " + abcd);
        System.out.println("The summm is: " + l3);

        for (int i = 0; i < l1.size(); i++) {
            l4.addAll(Collections.singleton(l1.indexOf(i) + ""));
            System.out.println("the the " + l1.indexOf(i) + "");
        }
        //System.out.println("");

        String sstr = "A man, a plan, a canal: Panama";
        System.out.println(sstr);
        /*
        sstr = sstr.replace(",","");
        sstr = sstr.replace(":","");
        sstr = sstr.replace(" ","");
         */
        sstr = sstr.replaceAll("[^a-zA-Z0-9]", "");
        sstr = sstr.toLowerCase();
        System.out.println(sstr);

        int brr[] = {1, 2, 3};
        System.out.println(Arrays.toString(brr));

        Collections.reverse(Arrays.asList(brr));

        System.out.println(Arrays.toString(brr));

    }

    public boolean boopal(String sstr) {

        /*
        System.out.println(sstr);
        sstr = sstr.replaceAll("[^a-zA-Z0-9]","");
        sstr = sstr.toLowerCase();
        System.out.println(sstr);
        for(int i = 0, j = sstr.length()-1; i<j; i++,j-- ){
            if (sstr.charAt(i)!=sstr.charAt(j)){

            }
            break;
        }


        int[] arr = {1,2,3};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i]== arr[j]){
                    return true;
                }
            }
        }
        */
        int num = 1669;

        while (num > 9) {
            num = num / 10 + num % 10;
        }
        System.out.println("The num is: " + num);

        String str = Integer.toString(num);

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                i = Character.getNumericValue(str.charAt(i));
                j = Character.getNumericValue(str.charAt(j));
                System.out.println(i + "///");
                System.out.println(j + "///");
                if (((i * i) + (j * j)) == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void returnFirstDuplicate() {

        int[] array_s = {1, 2, 7, 3, 3, 4, 7, 8, 9, 9, 6, 6, 8};

        System.out.println(Arrays.toString(array_s));

        int item = 0;

        for (int i = 0; i < array_s.length - 1; i++) {
            for (int j = i + 1; j < array_s.length; j++) {

                if (array_s[i] == array_s[j]) {
                    item = array_s[i];
                    break;
                }

            }
            if (item != 0)
                break;
        }

        System.out.println("the first duplicate value is: " + item);

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 5, 2, 7, 3, 3, 4, 7, 8, 9, 9, 6, 6, 8, 5));

        int value = -1;

        for (int i = 0; i < arrList.size() - 1; i++) {
            for (int j = i + 1; j < arrList.size() - 1; j++) {

                if (arrList.get(i) == arrList.get(j)) {
                    value = arrList.get(i);
                    break;
                }
            }
            if (value != -1)
                break;
        }

        System.out.println("the first duplicate value from arraylist is: " + value);


        String charRepeat = "abcdefccd";
        char c = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < charRepeat.length(); i++) {
            c = charRepeat.charAt(i);
            if (hashMap.containsKey(c)) {

                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        int max = -1;
        String str_2 = "";
        //Character key;
        for (Character key : hashMap.keySet()) {
            if (hashMap.get(key) >= max) {
                max = hashMap.get(key);
                str_2 = key.toString();
            }

        }

        System.out.println(str_2 + " = " + max);


    }

    public int replaceDuplicatewithDash(int[] nums) {

        //ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(0,0,1,1,1,2,2,3,3,4));
        /*
        int numslength = nums.size();
        System.out.println("The initial array is: "+nums+" : and the length of the array is: "+numslength);
        for (int i=0 ; i<nums.size(); i++){
            for (int j=i+1 ; j<nums.size(); j++){
                if(nums.get(i)==nums.get(j)){
                    nums.remove(nums.get(i));
                }
            }
        }
        int numslength2 = nums.size();
        for(int i =0; i < numslength ; i ++){

        }
        System.out.println("The array2 is: "+nums+" : and the length of the array2 is: "+numslength2);

        for (int i = numslength2; i < numslength ; i++){
            nums.add(0);
        }
        int numslength3 = nums.size();
        System.out.println("The final array is: "+nums+" : and the length of the final array is: "+numslength3);

         */
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int j = 1; j < nums.length; i++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public void SumOfUnique() {
        int num1 = 0, num2 = 0, num3 = 0;

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 2));
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) != nums.get(j)) {
                    num1 = nums.get(i);
                    num2 = nums.get(j);
                }
                num3 = num1 + num2;
            }
            break;
        }
        System.out.println("the sum of unique number is: " + num3);
    }

    public static int TestingALoop(int num2) {
        int num = 0;

        for (int i = 0; i < 11; i++) {
            if (i != 0)
                num++;
        }
        System.out.println(num);
        if (num2 > 0) {
            return num2 + TestingALoop(num2 - 1);
        } else {
            return 0;
        }


    }

    public void removeDisSimilarValue() {
        ArrayList<Integer> fullArr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        int initial = 0;

        for (int i = 0; i < fullArr.size(); i++) {
            if (fullArr.get(i) % 2 == 0 && fullArr.get(i) != 0) {
                initial = initial + fullArr.get(i);

            }
        }
        System.out.println("The array is: " + fullArr);
        System.out.println("The total sum of even numbers are: " + initial);

    }

    public void SumOfEvenNumber() {

        ArrayList<Integer> fullArr = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6));

        int initial = 0;
        int count = 0;

        HashSet<Integer> hashSet = new HashSet<>();
        HashMap<Integer, Integer> hashMap = new HashMap();

        for (int i = 0; i < fullArr.size(); i++) {
            if (fullArr.get(i) % 2 == 0 && fullArr.get(i) != 0) {
                initial = initial + fullArr.get(i);
                count++;
                hashSet.add(fullArr.get(i));
                hashMap.put(count, initial);
            }
        }
        System.out.println("The array is: " + fullArr);
        System.out.println("The total sum of even numbers are: " + initial);
        System.out.println("The Hashset is: " + hashSet);
        System.out.println("The HashMap is: " + hashMap);
        System.out.println("The first value of HashMap is: " + hashMap.get(1));
        System.out.println("The second value of HashMap is: " + hashMap.get(2));
        System.out.println("The third value of HashMap is: " + hashMap.get(3));
        System.out.println("The fourth value of HashMap is: " + hashMap.get(4));
    }

    public void addingArrayNumbers() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> arr2 = new ArrayList<>();
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6};
        /*
        for(int i = arr.size(); i >=0 ; i--){
            System.out.println(arr.get(i));
        }
         */
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = array[i];
        }
        System.out.println("The final array is: " + Arrays.toString(array));
    }

    public int majority(int[] nums) {

        int majorityCount = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count += 1;
                }
            }
            if (count >= majorityCount) {
                return nums[i];
            }
        }

        return -1;

    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int major(int[] nums) {
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count > majorityCount) {
                return num;
            }

        }

        return -1;
    }

    public int[] removeElements(int[] head, int val) {
        int i = 0;
        System.out.println(Arrays.toString(head));
        for (int j = 0; j < head.length; j++) {

            if (head[j] != val) {

                head[i] = head[j];

                i++;

            }

        }
        System.out.println(Arrays.toString(head));
        return head;
    }


    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if (n == 0) {
            return null;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            }
//            digits[i]=0;
        }

        /*
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        return newNumber;
        */

        return digits;
    }

    public int kthSmallest(int[][] mat, int k) {
        int[][] arr = {{1}, {1}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println(k);
        return k;
    }


    public void merge_88(int[] nums1, int m, int[] nums2, int n) {



        for(int i=0;i<n;i++){
            nums1[m]=nums2[i];
            m++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }


    public int[] shuffle(int[] nums, int n) {

        /*
        int[] num2 = new int[2*n];
        for (int i = 0; i < nums.length-1; i++){
            for (int j = n; j < nums.length; j++){
                 nums[i+1] = nums[j];
            }
            break;
        }
         */

        int[] res = new int[2 * n];
        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[n + i];
        }
        return res;
    }

    public int maxProfit(int[] prices) {

        int profit = 0;
        int maxprofit = 0;
        int buy = Integer.MAX_VALUE;
        /*
        Method 1
        for( int i=0; i<prices.length; i++){
            for(int j = i+1; j<prices.length ; j++){
                profit = prices[j]-prices[i];
                if(profit > maxprofit){
                    maxprofit = profit;
                    //return maxprofit;
                }

            }
        }
        */

        // solution with faster route
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else {
                maxprofit = Math.max(maxprofit, prices[i] - buy);
            }
        }
        return maxprofit;
    }

    public int maximumDifference(int[] nums) {
        int maxmin = 0;
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    maxmin = Math.max(maxmin, nums[j] - nums[i]);
                }
            }
        }
        return maxmin;
    }

    public void arrayMaxMinTest() {
        int[] a = {5, 4, 3, 2, 1};
        int result = -1;
        int start = a[0];

        for (int i = 0; i < a.length; i++) {

            if (a[i] < start) {
                start = a[i];
            }
            if (a[i] > start) {
                result = Math.max(result, a[i] - start);
            }

        }
        System.out.println(result);
    }

    public void fiboprac() {
        int firstNum = 0, secondNum = 1, Sum = 0, totaldigit = 9;
        for (int i = 0; i < totaldigit; i++) {
            Sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = Sum;

            System.out.println(Sum);
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {


        return null;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k) {
                return true;
            }
            map.put(nums[i], i);
            /*
            Integer num = hashMap.put(nums[i], i);
            if(num!=0 && i-num<=k ){
                    return true;
            }

             */
            /*
            for(int j =i+1; j<nums.length; j++) {
                if (nums[i] == nums[j] && nums[i]-nums[j] <=k) {
                    return true;
                }
            }

             */

        }
        return false;
    }

    public int search(int[] nums, int target) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int getSum(int a, int b) {
        int ans = Math.addExact(a, b);
        int ans2 = Integer.sum(a, b);
        return ans2;
    }

    //{1,2,3,4,5,6}
    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));


        return result;
    }




    public List<Integer> reverseList(List<Integer> head) {

        List<Integer> next = new ArrayList<>();
        while (head != null) {


        }

        return next;
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("the total is: " + sum);
        return total - sum;
    }

    public int findDuplicate(int[] nums) {

        /*
        for (int i =0; i < nums.length ; i++){
            for (int j =i+1; j < nums.length ; j++){
                if (nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;

         */
        int length = nums.length;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (!hashSet.add(nums[i])) {
                return nums[i];
            }
        }
        return length;
    }

    public int[] findErrorNums(int[] nums) {

        /*

        int num = 0 ;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i:nums){
            if(hashSet.contains(i))
                num = i;
                hashSet.add(i);
        }

        for (int i =1; i <= nums.length; i++){
            if(!hashSet.contains(i)){
                return new int[]{num, i};
            }
        }
        return new int[]{};


        int num=0;
        HashSet<Integer> hashSet = new HashSet<>();

        for(int n : nums){
            if(hashSet.contains(n))
                num=n;
            hashSet.add(n);
        }

        for(int i=1;i<=nums.length;i++){
            if(!hashSet.contains(i))
                return new int[]{num,i};
        }

        return new int[]{};
        */


        int[] result = new int[2];
        int[] num2 = {1, 2, 3, 4, 5, 6, 6};

        System.out.println("1st print" + Arrays.toString(nums));

        int[] temp = new int[nums.length + 1];
        int[] temp2 = new int[num2.length + 1];

        System.out.println("2nd print" + Arrays.toString(temp));

        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
        }

        System.out.println("3rd print" + Arrays.toString(temp));

        for (int i = 0; i < num2.length; i++) {
            temp2[num2[i]]++;
        }
        System.out.println("4th print" + Arrays.toString(temp2));
        for (int i = 1; i <= nums.length; i++) {
            if (temp[i] == 2) result[0] = i;
            if (temp[i] == 0) result[1] = i;
        }

        return result;

    }

    public int[] finderror2(int[] nums) {
        int[] result = new int[2];
        int[] temp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
        }

        for (int i = 1; i < nums.length; i++) {
            System.out.println("@@" + i);
            System.out.println("**" + nums[i]);
            if (temp[i] == 2)
                // System.out.println(i);
                result[0] = i;

            if (temp[i] == 0)
                //  System.out.println(i);
                result[1] = i;
        }

        return result;
    }

    public int maxProductDifference(int[] nums) {

        Arrays.sort(nums);
        int max1 = 0, max2 = 0, min1 = 0, min2 = 0, sum = 0;


        /*
        for (int i :nums){
            max = Math.max(i, max);
            System.out.println("The max number "+max);
        }

        for (int i =0; i <nums.length; i++){
            min = Math.min(max, nums[i]);
            System.out.println("The min number "+min);
        }
        */
        for (int i = 0; i < nums.length; i++) {
            min1 = nums[0];
            min2 = nums[1];
            max1 = nums[nums.length - 2];
            max2 = nums[nums.length - 1];
            return (max1 * max2) - (min1 * min2);
        }

        return 0;
    }

    public void practice() {
        int num = 0;
        for (int i = 1; i < 10; i++) {
            num++;
        }
        System.out.println(num);
    }

    public void pointerCompare() {
        int[] nums = {1, 2, 3, 4

        };
        int[] nums2 = new int[2];
        int[] nums3 = new int[nums.length];
        int val = 5;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == val) {
                    nums2[0] = nums[i];
                    nums2[1] = nums[j];
                }
            }
        }
        System.out.println("The two pointer is: " + Arrays.toString(nums2));


        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] + nums[i + 1] == val) {
                nums2[0] = nums[i];
                nums2[1] = nums[i + 1];
            }

        }
        System.out.println("The two pointer2 is: " + Arrays.toString(nums2));

        // finding the sum of previous and current

        System.out.println("The initial array is: " + Arrays.toString(nums));

        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            result = nums[i - 1] + nums[i];
            nums[i] = result;
        }

        System.out.println("The sum array is: " + Arrays.toString(nums));

    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int value = 0;


        List<String> list = new ArrayList<String>(Arrays.asList("", ""));

        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) {
                value++;
            }
            if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) {
                value++;
            }
            if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) {
                value++;
            }
        }

        return value;
    }

    public int maxPower(String s) {
        int result = 0;
        int result2 = 0;
        if (s.length() == 1) {
            return 1;
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                result++;
            } else {
                result = 0;
            }
            result2 = Math.max(result2, result + 1);
        }


        return result2;
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int result2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                result++;
                result2 = Math.max(result2, result);
                /*
                if(result2<result){
                    result2=result;
                }

                 */
            } else {
                result = 0;
            }
        }
        return result2;
    }

    public boolean checkZeroOnes(String s) {
        int length0 = 0, length1 = 0, maxLen0 = 0, maxLen1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                length1++;
                length0 = 0;
                maxLen1 = Integer.max(maxLen1, length1);
            } else if (s.charAt(i) == '0') {
                length0++;
                length1 = 0;
                maxLen0 = Integer.max(maxLen0, length0);
            }
        }
        return maxLen1 > maxLen0;
    }

    public boolean checkOnesSegment(String s) {

        return !s.contains("01");
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        int length = strs.length;

        String firstVal = strs[0];
        String secondVal = strs[length - 1];
        String result = "";

        for (int i = 0; i < firstVal.length(); i++) {
            if (firstVal.charAt(i) == secondVal.charAt(i)) {
                result += firstVal.charAt(i);
            } else {
                break;
            }
        }
        return result;

    }

    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (int i = 0; i < sentences.length; i++) {
            String[] wordss = sentences[i].split(" ");
            max = Math.max(max, wordss.length);

        }
        System.out.println(max);


        return max;
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] newNums = new int[nums.length];
        List<Integer> list = new ArrayList<>();

        for (int i : nums)
            list.add(i);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        for (int i = 0; i < nums.length; i++)
            newNums[i] = list.indexOf(nums[i]);

        System.out.println(Arrays.toString(newNums));


        return newNums;

    }

    public int[] smallerNumbersThanCurrent2(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp[i]++;
                }
            }
        }
        return temp;

    }

    public int countValidWords(String sentence) {

        if (sentence.length() == 0) return 0;
        String[] newval = sentence.split("\\s+");
        int count = 0;
        int length = newval.length;
        for (int i = 1; i < length; i++) {

            count++;
        }
        return count;
    }


    public void twoOutOfThree2(int[] nums1, int[] nums2, int[] nums3) {

    }

    public List<String> commonChars(String[] words) {

        List<String> list = new ArrayList<>();
        if (words == null || words.length == 0)
            return list;
        String finalString = "";

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) {


                String first = Character.toString(words[i].charAt(i));
                String second = Character.toString(words[j].charAt(j));

                System.out.println("*" + first);
                System.out.println("**" + second);

                //             if(first.contentEquals(second))

                list.add(first);

            }
        }

        System.out.println("#" + list);

        return list;
    }


    public void arrpractice_July() {
        int[] arr = {2, 3, 4, 5, 6};
        int first = 0, second = 0;
        int val = 9;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] + arr[i + 1] == val) {
                first = arr[i];
                second = arr[i + 1];
            }

        }
        System.out.println(first + "!!!" + second);
    }

    public int minMaxGame(int[] nums) {
        int min = 0, max = 0, result = 0;
        if (nums.length == 1)
            return nums[1];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                min = nums[i - 1];
                //System.out.println("**"+min);
            } else {
                min = nums[i];
                //System.out.println("*&*"+min);
            }
            /*
            if (nums[i-2]>nums[i-1]){
                max = nums[i-2];
            }
            else {
                max = nums[i-1];
            }

             */

        }


        return min;
    }

    public boolean threeConsecutiveOdds(int[] arr) {

        if (arr.length == 0 || arr.length == 1 || arr.length == 2) {
            return false;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i - 2] % 2 != 0 && arr[i - 1] % 2 != 0 && arr[i] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] result = new int[1];
        int max = 0, min = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[0] = nums1[i];
                    break;
                }
            }
        }

        return result;
    }

    public int findGCD(int[] nums) {
        int result = 0;
        int length = nums.length;
        if (length == 0 || length == 1) {
            return nums[length];
        }
        Arrays.sort(nums);
        int min = nums[0], max = nums[length - 1];
        /*
        for(int i=0;i<nums.length;i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

         */
        result = findval(min, max);
        System.out.println("###" + min + "..." + max + "**" + result);
        return result;
    }

    public int findval(int min, int max) {
        if (max == 0) {
            return min;
        }
        return findval(max, min % max);
    }

    public String gcdOfStrings_1071(String str1, String str2) {
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
            }
        }
        return result;

    }

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> hashSet = new HashSet<>();

        int i = 0, j = 0, count = 0;

        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        while (j < s.length()) {
            if (!hashSet.contains(s.charAt(j))) {
                hashSet.add(s.charAt(j));
                j++;
                count = Math.max(count, hashSet.size());
            } else {
                hashSet.remove(s.charAt(i));
                i++;
            }

        }

        return count;
    }


    public boolean isThree_1952(int n) {

        return false;
    }



    public void rotate(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length + 1 / 2; i++) {
            for (int j = 0; i < matrix.length / 2; i++) {

            }

        }

        System.out.println(list);

    }


    public void moveZeroes(int[] nums) {
        /*
        algorithm:
        1. run a for loop over the array.
        2. initialize int i for first element
        3. initialize int j for second element where j=i+1
         */

        int i = 0;


        for (int num = 0; num < nums.length; num++) {
            if (nums[num] != 0) {
                nums[i++] = nums[num];
            }
        }

        while (i < nums.length) {
            nums[i++] = 0;
        }

        System.out.println(Arrays.toString(nums));

    }

    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length;i++){
            if(nums[i]==target){
                list.add(i);
            }
        }

        return list;
    }

    public int[] arrayRankTransform_1331(int[] arr) {
        int[] length = new int[arr.length];
        for(int i=1;i<arr.length;i++){
            length[i]=i;
        }
        return length;
    }

    public int[] intersection_349(int[] nums1, int[] nums2) {

        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        for (int i=0; i< nums1.length;i++){
            hashSet1.add(nums1[i]);
        }
        for (int j=0; j< nums2.length;j++){
            hashSet2.add(nums2[j]);
        }
        System.out.println(hashSet1);
        System.out.println(hashSet2);
        hashSet1.retainAll(hashSet2);
        int[] result = new int[hashSet1.size()];
        int id = 0;

        for(int i: hashSet1){
            result[id++] = i;
        }

        return result;
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        int differnce=arr[1]-arr[0];

        for (int i =0; i < arr.length-1; i++){
            int temp = arr[i+1]-arr[i];
            if(temp!=differnce){
                return false;
            }
        }

        return true;
    }

    public void samplePractice_1(){
        int[] arr = {5,6,7,8,9,10,11,12,13,14,15,20,21,22,23,25,26,26};

        List<Integer> list_10 = new ArrayList<>();
        List<Integer> list_20 = new ArrayList<>();
        List<Integer> list_30 = new ArrayList<>();
        for (int i=0; i<arr.length;i++){
            if (arr[i]<=10){
                list_10.add(arr[i]);
            }
            else if (arr[i]<=20 && arr[i]>10){
                list_20.add(arr[i]);
            }
            else if (arr[i]<=30 && arr[i]>20){
                list_30.add(arr[i]);
            }
        }

        System.out.println(list_10);
        System.out.println(list_20);
        System.out.println(list_30);

    }

    public int solution(int[] A) {
        // write your code in Java SE 11
        Arrays.sort(A);
        int result = 0, last = 0 , last2=0;

        for (int i =0; i<A.length-2; i++){
            if (A[i]<1){
                return 1;
            }
            if(A[i+2]-A[i+1]!=A[i+1]-A[i]){
                result = A[i+1]+1;
                last = Math.min(last, result);
            }
            if(A[i+2]-A[i+1]==A[i+1]-A[i]){
                last = A[i+2]+1;
                //last = Math.min(last, last2);
            }

        }

        return last;
    }

    public int strStr(String haystack, String needle) {

        int result = 0;
        if(haystack.length()==1 && needle.length()==1)
            return result;
        if(haystack.contains(needle))
           // result= needle.length();
            result = haystack.indexOf(needle);
        else {
            result= -1;
        }
        return result;
    }

    public String addBinary_67(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int firstBinary = Integer.parseInt(a,2);
        System.out.println("the first binary is:"+firstBinary);
        int secondBinary = Integer.parseInt(b, 2);
        System.out.println("the second int is:"+secondBinary);
        int result = firstBinary+secondBinary;
        System.out.println("the int sum is:"+result);
        String first = Integer.toBinaryString(result);

        return first;
    }

    public int mySqrt_69(int x) {
        double r = Math.sqrt(x);
        int  result = 0;
        return ((int)Math.sqrt(x));
    }

    public int sqroot(int i){
        if(i ==0 || i==1) return i;
        int temp=1, result=1;
        return 0;
    }

    public int[] sortedSquares_977(int[] nums) {

        for(int i =0; i< nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);

        return nums;
    }

    public double trimMean_1619(int[] arr) {
        double temp = 0;
        int count=0;
        //Arrays.sort(arr);
        for (int i=1; i<arr.length-1;i++){
            temp = arr[i]+arr[i+1];
            i++;
        }
        return temp;
    }

    public void merge_88_v2(int[] nums1, int m, int[] num2, int n) {
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(num2));
        for(int i =0; i<n; i++){
            nums1[m] = num2[i];
            m++;
        }
        System.out.println(Arrays.toString(nums1));
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public int sumOfFlooredPairs_1862(int[] nums) {
        int temp = 0;
        int result= 0;
        int result2= 0;
        /*
        for (int i=0; i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                result=result+nums[i];
        }
        */

        for (int i=0; i<nums.length;i++){
            for (int j=i+1; j<nums.length;j++){
                System.out.println("ggg"+nums[i]+"ggg"+nums[j]);
                temp = Math.floorDiv (nums[i],nums[j]);
                System.out.println("ffff"+temp);
                result2= result2+temp;
            }
        }

        //return result+nums[nums.length-1];
        return result2;

    }

    public int thirdMax_414(int[] nums) {
        SortedSet<Integer> set = new TreeSet<>();
        for (int i: nums){
            set.add(i);
        }
        if (set.size()==1){
            return set.first();
        }
        if (set.size()==2){
            return set.last();
        }
        set.remove(set.last());
        set.remove(set.last());
        return set.last();
    }

    public char nextGreatestLetter_744(char[] letters, char target) {
        char result=0;

        for (char c: letters){
            if(c > target){
                return c;
            }
        }

        return letters[0];
    }

    public String[] findRestaurant_599(String[] list1, String[] list2) {

        return null;
    }

    public int largestPerimeter_976(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 3; i >= 0; --i){
            if(nums[i]+nums[i+1]>nums[i+2]){
                return nums[i]+nums[i+1]+nums[i+2];
            }
        }
        return 0;
    }

    public int maximumWealth_1672(int[][] accounts) {
        int max =0;
        //int result =0;
        for(int i=0; i<accounts.length; i++){
            int result =0;
            for(int j=0; j<accounts[i].length ; j++){
                    result+=accounts[i][j];
            }
            //max = result > max ? result : max;
            if(result>max){
                max=result;

            }
        }
        return max;
    }

    public boolean canBeIncreasing_1909(int[] nums) {
        Arrays.sort(nums);

        HashSet<Integer> hashSet = new HashSet();

        for(int i =0; i < nums.length; i++){
            for(int j =i+1; j < nums.length; j++){
                if (hashSet.add(nums[j]-nums[i])){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isValid_20(String s) {

        Stack<Character> deque = new Stack<>();
        char c;

        for(int i =0 ; i < s.length(); i++){
            c = s.charAt(i);
            if(c=='('||c=='{'||c=='[')
            {
                deque.push(c);
                System.out.println("The second stack is: "+deque);
            }

            else {
                if(deque.empty())
                    return false;

                if(c==')' && deque.peek()!='(')
                    return false;
                if(c==']' && deque.peek()!='[')
                    return false;
                if(c=='}' && deque.peek()!='{')
                    return false;
                deque.pop();

            }
        }
        return deque.empty();
    }

    public List<Integer> twoOutOfThree_2032(int[] nums1, int[] nums2, int[] nums3) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        HashSet<Integer> temp = new HashSet<>();
        //ListNode<Integer> listNode = new ListNode<>();
        LinkedList<Integer> list = new LinkedList<>();



        for(int i:nums1){
            if(temp.add(i)){
                if(!set1.add(i)){
                    result.add(i);
                }
            }
        }

        temp.clear();
        for(int i: nums2){
            if(temp.add(i)){
                if(!set1.add(i)){
                    result.add(i);
                }
            }
        }

        temp.clear();
        for(int i: nums3){
            if(temp.add(i)){
                if(!set1.add(i)){
                    result.add(i);
                }
            }
        }

        System.out.println("name\tage");
        System.out.println("himel\t37");
        System.out.println("ruma\t34");

        return new ArrayList<>(result);
    }

    public int minDeletion_2216(int[] nums) {
        int count = 0;
        int size = nums.length;
        for(int i=0; i< nums.length-1;i++){
            if ((i-count) % 2 == 0 && nums[i]==nums[i+1]){
                count++;
            }
        }

        return 0;
    }

    // Starting of largest palindrome problem
    public String longestPalindrome(String s) {

        if (s == null || s.length() < 1) {
            return "";
        }
        int first = 0, last = 0;
        for (int i = 0; i < s.length(); i++) {
            int num1 = palindromemethod(s, i, i);
            int num2 = palindromemethod(s, i, i + 1);
            int finalVal = Math.max(num1, num2);
            if (finalVal > last - first) {
                first = i - (finalVal - 1) / 2;
                last = i + finalVal / 2;
            }

        }
        return s.substring(first, last + 1);
    }

    public int palindromemethod(String s, int left, int right) {


        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;

    }

    public int distributeCandies_575(int[] candyType) {
        int temp=1;

        for(int i=0; i< candyType.length ;i++) {
            for(int j=0; j< i;j++) {
                if (candyType[i] != candyType[j]) {
                    temp += 1;
                }
            }
        }

        return Math.min(temp, candyType.length/2);
    }

    public int distributeCandies_575_(int[] candyType) {
        Arrays.sort(candyType);
        int advisedCandy = candyType.length/2;
        int temp=1;

        for(int i=0; i< candyType.length-1 && temp < candyType.length/2;i++) {
            if(candyType[i]!=candyType[i+1]){
                temp+=1;
            }
        }

        return Math.min(temp, advisedCandy);
    }

    public int distributeCandies_575_hashset(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();

        int totalcandy= candyType.length;

        for(int i=0; i< totalcandy ;i++) {
            set.add(candyType[i]);
        }
        return Math.min(set.size(), totalcandy/2);
    }

    public String[] findRelativeRanks_506(int[] score) {
        String[] result = new String[score.length];

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        if(score.length==0) return null;
        for(int i =0; i<score.length; i++){
            hashMap.put(score[i], i);
        }
        Arrays.sort(score);
        return result;
    }

    public int sumOddLengthSubarrays_1588(int[] arr) {
        int result = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j+=2){
                for(int k=i;k<=j;k++){
                    result+=arr[k];
                }
            }
        }
        return result;
    }

    public boolean isPowerOfFour_342(int n) {
        return helper((double) n);

    }
    public boolean helper(double n){
        // int result = temp/2;
        //int temp= n/2;
        if(n==1||n==4) return true;
        if(n<4) return false;
        else return helper(n/4);
    }

    public boolean isPowerOfTwo_231(int n) {
        //return helper2((double) n);
        if(n<1)
            return false;
        if(n==1)
            return true;
        if(n%2==0)
            return isPowerOfTwo_231(n/2);
        else
            return false;

    }


    public boolean isPowerOfThree_326(int n) {

        //return helper3( n);
        if(n<1)
            return false;

        while (n%3==0)
            n=n/3;

        return n==1;
    }

    public boolean helper3(int n){

        if(n<1)
            return false;

        while (n%3==0)
            n=n/3;
        return n==1;
    }

    public boolean validPalindrome_680(String s) {

        for(int i=0, j=s.length()-1;i<j;){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
                continue;
            }
            else {
                return validPalindrome_680_helper(s, i+1, j)||validPalindrome_680_helper(s, i, j-1);
            }
        }
        return true;
    }

    private boolean validPalindrome_680_helper(String s, int fromIndex, int toIndex) {
        while (fromIndex<toIndex){
            if(s.charAt(fromIndex)!=s.charAt(toIndex)) {
                return false;
            }
            fromIndex++;
            toIndex--;
        }
        return true;
    }

    public String convertToBase7(int num) {
        String result="", negative="", zero="0";
        if(num==0){
            return zero;
        }
        if(num<0){
            negative="-";
        }
        num= Math.abs(num);
        while (num>0){
            result = num%7+result;
            num/=7;
        }
        return negative+result;

    }

    public boolean divisorGame_1025(int n) {
        if(n%2!=0){
            return false;
        }
        return true;
    }

    public boolean isSubsequence_392(String s, String t) {
        int i=0,j=0;
        while (i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else {
                j++;
            }
        }

        return i==s.length();
    }

    public int numMatchingSubseq_792(String s, String[] words) {
        int i=0,j=0;
        while (i<s.length()&&j<words.length){
            //if(s.charAt(i)==words.charAt(j)){
            if(s.contains(words[i])){
                i++;
                j++;
            }

        }
        return i;
    }

    public int maxArea(int[] height) {
        int length = height.length;
        int left = 0;
        int right = length-1;
        
        for(int i=1; i<height.length; i++){

        }
        return 0;
    }

    public void sortColors_75(int[] nums) {

        for(int i =0; i< nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                nums[i] =nums[i+1];
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    public void sortColors_75_swap(int x, int y, int[] nums){
        int temp= nums[x];
        nums[x]=nums[y];
        nums[y] = temp;
    }

    public static int findSumOfTwoLargestAdjacent_MIU(int[] numbers) {
        int largestSum = Integer.MIN_VALUE;
        //int largestSum = 0;
        System.out.println("the initial largestSum is: "+ largestSum);

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentSum = numbers[i] + numbers[i + 1];
            System.out.println("the second largestSum is: "+largestSum);
            System.out.println("the initial current sum is: "+currentSum);
            if (currentSum > largestSum) {
                largestSum = currentSum;
            }
        }

        return largestSum;
    }

    public int adjucentTwoSum(int[] nums){
        int lowestvalue =0;

        for(int i=0; i<nums.length-1;i++){
            int num=nums[i]+nums[i+1];
            if (lowestvalue<num){
                lowestvalue=num;

            }
        }

        return lowestvalue;
    }

}





/*

  Write an algorithm to find the Number of occurrences of char in the array
  Find the max occurrence in a string

 */


