package arrayIntro;

import java.util.Scanner;

public class InsertionSort {

    public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void insertionSort(int[] arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            //INsert ith element in sorted position
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter ArraySize");
        int n=s.nextInt();
        int[] arr=new int[n];

        for (int i=0;i<n;i++){
            System.out.println("enter array at"+i+"th position");
            arr[i]=s.nextInt();
        }
        insertionSort(arr);
        printArray(arr);
    }
}
