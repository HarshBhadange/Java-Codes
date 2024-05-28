package arrayIntro;

public class PrimitiveAndNonprimitive {

//    public static void increment(int i){
//        i++;
//    }
    public static void printarray(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        return;
    }
    public static void incrementArray(int[] input){
        System.out.println(input);
        input=new int[7];
        for (int i=0;i<input.length;i++){
            input[i]=input[i]+1;
        }
    }
    public static void main(String[] args){

//        int i=10;
//        increment(i);
//        System.out.println(i);
        int[] arr={1,2,3,4,5};
        System.out.println(arr);
        incrementArray(arr);
        printarray(arr);

    }
}
//in non-primitive reference and main arr  are same as they store reference of memory of array and length..