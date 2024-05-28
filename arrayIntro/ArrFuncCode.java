package arrayIntro;

import java.util.Scanner;

public class ArrFuncCode {

    public static void printarr(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);

        }
    }
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
    public static void main(String[] args){
            int[] arr=takeInput();
            printarr(arr);
        }

    }

