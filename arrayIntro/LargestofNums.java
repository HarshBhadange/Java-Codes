package arrayIntro;


import java.util.Scanner;

public class LargestofNums {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter array size");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("element at " + i + " th index");
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }}
            return max;
        }


    public static void main(String[] args){
        int[] arr=takeInput();
        int lar=largest(arr);
        System.out.println(lar);
    }




}