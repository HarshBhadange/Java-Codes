package Fundamentals;

import java.util.Scanner;

public class ConditionalAndRelational {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b,c,d;
        a = s.nextInt();
        b = s.nextInt();

        if (a>0 && b>0){
            System.out.println("both the numbers are positive");
        }else {
            System.out.println("both are not positive");
        }
        //case 2: to evaluate weather 1 is positive we take ||operator
        c=s.nextInt();
        d=s.nextInt();

        if(c>0 || d>0){
            System.out.println("atleast one is positive");
        }else{
            System.out.println("none is positive");
        }
        if(a==b){
            System.out.println("both are equal");
        }else{
            System.out.println("arent equal");
        }


    }
}
