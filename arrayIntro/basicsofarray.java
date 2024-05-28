package arrayIntro;

public class basicsofarray {
    public static void main(String[] args){
    int arr[]=new int[10];
    // giving value to the index is done by the following code
    arr [0]=5;
    arr[0]=10;//new initialised value of array at 0th position gets printed
    arr [5]=12;
        System.out.println(arr[0]);
        //arr[-1] negative index is not allowed/array index exceeds n-1 ; it will give error array index out of bound

        //by default values if array are initialised as 0
        System.out.println(arr[3]);


    char[] cArray=new char[10];
    double[] dArray=new double[10];
        System.out.println(cArray[0]);// print null value as it is initialised  as null char
        System.out.println(dArray[0]);// prints 0.0
        // by default array values are intialised by 0 or equivalent to 0;
        //#### For an array of size n, indexes of the array range from 0 to (n - 1).
        // So here for array of size 15, valid indices are from 0 to 14.
        // This chArray[15] is trying to access an invalid index which gives ArrayIndexOutOfBoundsException.
        boolean barr[] = new boolean[5];
        System.out.println(barr[0]);
        //####Whenever an boolean array is created, all elements are initialised to false.
        int[] yukti=new int[10];
        yukti[1]=4;
        yukti=new int[2];
        System.out.println(yukti[0]);
        //arr initially refers to an array of size 5, line 2 assigns 10 to arr[1] but in line 3 arr is made
        // to point to a new array of size 2.
        // By /default all elements of integer array are initialized to 0. Hence line 4 will print 0.

    }
}
