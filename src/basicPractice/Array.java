package basicPractice;

public class Array {

    public void arrays_taskOne(){

    }

    public int[] array_firstMethod(int[] ints) {
        for(int i = 0 ; i < ints.length ; i++){
            ints[i]+=5;
        }
        return ints;
    }

    public void printresult(int [] result){
        int[] ab = array_firstMethod(result);
        for (int i : ab){
            System.out.println(i);
        }
    }


    // the below two methods are for printing a multidimensional array element as a table
    public  int[][] array_multi_dimension(int[][] mularray){
        for(int i =0; i <mularray.length; i++){
            for(int j = 0 ; j < mularray[i].length; j++){
                System.out.print(mularray[i][j]+" \t");
            }
            System.out.println("");
        }
        return mularray;
    }

    public void accessData_multi_dimension(int [][] a){

       int mularray3[][]=new int[5][5];

       mularray3[0][0]=11;
       mularray3[1][1]=22;
       mularray3[2][2]=33;
       mularray3[3][3]=44;
       mularray3[4][4]=55;

       int mularray2[][]={{2,2},{3,3}};
       int mularray[][]={{5,5},{6,6}};

       System.out.println("The first array is: ");
        accessTheArray(mularray);

        System.out.println("\n"+"The second array is: ");
        accessTheArray(mularray2);

        System.out.println("\n"+"The third array is: ");
        accessTheArray(mularray3);


    }

    public void accessTheArray(int[][] mArray){
        for (int i = 0; i < mArray.length; i++){
            for(int j=0; j <mArray[i].length;j++){
                System.out.print(mArray[i][j]+"\t");
            }
            System.out.println("");
        }
    }

}
