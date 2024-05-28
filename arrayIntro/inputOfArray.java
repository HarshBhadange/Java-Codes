package arrayIntro;

import java.util.Scanner;

public class inputOfArray {
    public static void main (String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of arr");
        int n=s.nextInt();
        int[] arr=new int[n];

        for (int i=0;i<n;i++) {
            System.out.println("enter elelment at " + i + "th index");
            arr[i] = s.nextInt();
        }

        for (int i=0;i<n;i++){
                System.out.println("element at"+i+"th index is "+ arr[i]);

        }

    }
}
