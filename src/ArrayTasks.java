import javax.swing.tree.TreeNode;
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
        if (n==0){
            return null;
        }

        for (int i = n-1 ; i>=0 ; i--){
            if(digits[i]<9){
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
        int[][] arr = {{1},{1}};
        for (int i = 0 ; i <mat.length; i++ ){
            for (int j = 0 ; j <mat[i].length; j++ ){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println(k);
        return k;
    }


    public void merge() {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3,n=3;

        int newSize = m+n;
        int[] arr = new int[newSize];

        for(int i =0; i< m; i++){
            for(int j =0; j< n; j++){
                arr[i] = nums1[i];
                //arr[j] = nums2[j];

            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public void moveZeroes(int[] nums) {
        /*
        algorithm:
        1. run a for loop over the array.
        2. initialize int i for first element
        3. initialize int j for second element where j=i+1
         */

    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i =0; i<nums.length; i++){
         if(nums[i]<=k){
             return true;
            }
        }
        return false;
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

        int[] res = new int[2*n];
        for(int i = 0; i < n; i++){
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[n+i];
        }
        return res;
    }

}

/*

  Write an algorithm to find the Number of occurrences of char in the array
  Find the max occurrence in a string

 */


