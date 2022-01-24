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


    public void leetcode_One(){
	    ArrayList<Integer> arrayListOne = new ArrayList<>
                (Arrays.asList(1,1,2,2,3,2,3,4,4,5,1,5,1,6,6,7,6,6));
        System.out.println(arrayListOne);
        ArrayList<Integer> arrayListTwo = new ArrayList<>();

        int temp =0;
        int temp2 =0;
        int max = arrayListOne.get(0);

        for (int i=0 ; i<arrayListOne.size() ; i++){
            System.out.print(" //the regular value: "+arrayListOne.get(i));
            System.out.println(" //the +1 value: "+arrayListOne.get(i+1));


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
        for (int i=0; i<10; i++){
            System.out.println("    ");
            for (int j=1; j<=10; j++){
                System.out.print(" -");

            }
        }


        ArrayList<Integer> arrayOne = new ArrayList<>(Arrays.asList(15,21,32,0,565,4,5,89));

        int max = arrayOne.get(0);
        int min = arrayOne.get(0);


        System.out.println("the first array is: "+ arrayOne);

        // 07. Write a Java program to remove a specific element from an array.
        for (int i=0; i< arrayOne.size(); i++){
            if(arrayOne.get(i)==5){
                arrayOne.remove(arrayOne.get(i));
            }
        }

        // 10. Write a Java program to find the maximum and minimum value of an array.
        for (int i=0; i< arrayOne.size(); i++){
            if(max< arrayOne.get(i)){
                max=arrayOne.get(i);
            }
            if(min> arrayOne.get(i)){
                min=arrayOne.get(i);
            }
        }
        System.out.println("the biggest number of array is: "+ max);
        System.out.println("the smallest number of array is: "+ min);
        System.out.println("the array after removing element is: "+ arrayOne);
        // 11. Write a Java program to reverse an array of integer values.
        Collections.reverse(arrayOne);
        System.out.println("the array after reversing is: "+ arrayOne);


        //13. Write a Java program to find the duplicate values of an array of string values.
        ArrayList<String> arrayString = new ArrayList<>(Arrays.asList
        ("Rony", "Mony", "Tony", "Jony", "Bini", "Rony", "Jony","abc","abc"));

        ArrayList<String> arrayStringWithDuplicate = new ArrayList<>();
        System.out.println("The string arraylist is: "+ arrayString);

        String duplicate = "";

        for (int i=0; i< arrayString.size()-1; i++){
            for (int j=i+1; j< arrayString.size(); j++){
                //System.out.println("the duplicate strings are: " + arrayString.get(j));
                if (arrayString.get(i) == arrayString.get(j) && (i != j)) {
                    System.out.println("the duplicate strings are: " + arrayString.get(j));
                    arrayStringWithDuplicate.add(arrayString.get(j));
                }
            }
        }
        System.out.println("The arraylist with duplicate values are: "+ arrayStringWithDuplicate);

        // 14.  Write a Java program to find the common elements between two arrays (string values).
        ArrayList<String> commonArr1 = new ArrayList<>(Arrays.asList("aa","bb","cc","ee"));
        ArrayList<String> commonArr2 = new ArrayList<>(Arrays.asList("bb","cc","dd","ee"));
        ArrayList<String> finalarr = new ArrayList<>();

        HashSet<String> hash = new HashSet<>();

        for (int i=0; i< commonArr1.size(); i++){
            for (int j=0; j< commonArr2.size(); j++){
                if(commonArr1.get(i).equals(commonArr2.get(j))){
                    finalarr.add(commonArr1.get(i));
                }
            }
        }
        System.out.println("The arraylist of common String values are: "+ finalarr);

        // 15. Write a Java program to find the common elements between two arrays of integers.
        ArrayList<Integer> intarr1 = new ArrayList<>(Arrays.asList(11,22,33,44));
        ArrayList<Integer> intarr2 = new ArrayList<>(Arrays.asList(33,44,55,66,77));
        ArrayList<Integer> intarr3 = new ArrayList<>();
        for (int i =0; i< intarr1.size(); i++) {
            for (int j = 0; j < intarr2.size(); j++) {
                if (intarr1.get(i) == intarr2.get(j)) {
                    intarr3.add(intarr1.get(i));
                }
            }
        }
        System.out.println("The arraylist of two common int arrays are: " + intarr3);

        // 16. Write a Java program to remove duplicate elements from an array.
        ArrayList<Integer> intarr4 = new ArrayList<>(Arrays.asList(11,22,33,44,55,55,11,66,22,77));
        Collections.sort(intarr4);
        for (int i =0; i< intarr4.size(); i++) {
            for (int j = i+1; j < intarr4.size(); j++) {
                if (intarr4.get(i) == intarr4.get(j)) {
                    intarr4.remove(i);
                }
            }
        }
        System.out.println("The arraylist after removing duplicate elements: " + intarr4);

        // 17. Write a Java program to find the second largest element in an array

        ArrayList<Integer> intarr5 = new ArrayList<>(Arrays.asList(1,2,3,4,123,345,112,5,6,7,8,9));
        Collections.sort(intarr5);
        int largestNum = 0;
        int secondLargestNum = 0;
        for(int i=0; i< intarr5.size()-1 ; i++){
            for(int j= i+1; j<intarr5.size(); j++){
                    if(intarr5.get(i)!=intarr5.get(j)){
                        largestNum =    intarr5.get(j);
                        secondLargestNum =    intarr5.get(i);
                    }
            }
        }
        System.out.println("The Largest number is: " + largestNum);
        System.out.println("The second Largest number is: "+ secondLargestNum);

        // 18. Write a Java program to find the second smallest element in an array.
        Collections.reverse(intarr5);
        System.out.println("The Reverse array is: " + intarr5);

        int smallestNum = 0;
        int secondSmallestNum = 0;
        for(int i=0; i< intarr5.size()-1 ; i++){
            for(int j= i+1; j<intarr5.size(); j++){
                if(intarr5.get(i)!=intarr5.get(j)){
                    smallestNum =    intarr5.get(j);
                    secondSmallestNum =    intarr5.get(i);
                }
            }
        }
        System.out.println("The smallest number is: " + smallestNum);
        System.out.println("The second smallest number is: "+ secondSmallestNum);

        // 19. Write a Java program to add two matrices of the same size
        // 20. Write a Java program to convert an array to ArrayList.

        ArrayList<Integer> intarr6 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("The int arrayList before converting to array: "+ intarr6);
        int[] arr2= new int[5];
        for (int i =0; i < intarr6.size(); i++){
            arr2[i] = intarr6.get(i);
        }
        System.out.println("The int arraylist after converting to array: "+ Arrays.toString(arr2));

        // 21. Write a Java program to convert an ArrayList to an array.
        int arr3[] = {1,2,3,4,5,6};
        ArrayList<Integer> intarr7 = new ArrayList<>();
        System.out.println("The int array before converting to arraylist: "+ Arrays.toString(arr3));

        for (int i=0; i< arr3.length; i++){
            intarr7.add(arr3[i]);
        }

        System.out.println("The int array after converting to arraylist: "+ intarr7);

        // 22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.


        // 23. Write a Java program to test the equality of two arrays.
        // 24. Write a Java program to find a missing number in an array.
        // 25. Write a Java program to find common elements from three sorted (in non-decreasing order) arrays.

        ArrayList<Integer> searchArray1 = new ArrayList<>(Arrays.asList(4,1,5,3,2,6));
        Collections.sort(searchArray1);
        ArrayList<Integer> searchArray2 = new ArrayList<>(Arrays.asList(5,6,4,9,7,12));
        Collections.sort(searchArray2);
        ArrayList<Integer> searchArray3 = new ArrayList<>(Arrays.asList(12,12,13,14,5,4,21,6));
        Collections.sort(searchArray3);
        ArrayList<Integer> searchArray4 = new ArrayList<>();

        for (int i=0; i<searchArray1.size(); i++){
            for (int j=0; j<searchArray2.size(); j++){
                if(searchArray1.get(i)==searchArray2.get(j)) {
                    for (int k = 0; k < searchArray3.size(); k++) {
                        if (searchArray2.get(j)  == searchArray3.get(k)) {
                            searchArray4.add(searchArray3.get(k));
                            //System.out.println("The common elements are : " + searchArray4);
                        }
                    }
                }
            }
        }
        System.out.println("The common elements are : " + searchArray4);

        // 26. Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.




        // 27. Write a Java program to find the number of even and odd integers in a given array of integers.

        ArrayList<Integer> arrOddEven = new ArrayList<>(Arrays.asList(11,22,33,44,55,66));
        ArrayList<Integer> arrOdd = new ArrayList<>();
        ArrayList<Integer> arrEven = new ArrayList<>();
        for (int i =0; i< arrOddEven.size(); i++){
            if(arrOddEven.get(i)%2 == 0 && arrOddEven.get(i)!=0){
                arrEven.add(arrOddEven.get(i));
            }
            else {
                arrOdd.add(arrOddEven.get(i));
            }
        }
        System.out.println("arrOddEven: "+ arrOddEven);
        System.out.println("arrOdd: "+ arrOdd);
        System.out.println("arrEven: "+ arrEven);

        // 28. Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.

        // 29. Write a Java program to compute the average value of an array of integers except the largest and smallest values.

        // 30. Write a Java program to check if an array of integers without 0 and -1

        // 31. Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.

        // 32. Write a Java program to check if an array of integers contains two specified elements 65 and 77

        // 33. Write a Java program to remove the duplicate elements of a given array and return the new length of the array. Sample array: [20, 20, 30, 40, 50, 50, 50] After removing the duplicate elements the program should return 4 as the new length of the array.

        // 34. Write a Java program to find the length of the longest consecutive elements sequence from a given unsorted array of integers. Sample array: [49, 1, 3, 200, 2, 4, 70, 5] The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.

        // 35. Write a Java program to find the sum of the two elements of a given array which is equal to a given integer. Sample array: [1,2,4,5,6] Target value: 6.


    }
}
