package Fundamentals;

import java.util.Scanner;

public class largestof2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();

        if (a>b){
            System.out.println("1st number is greater");

        }else
            if (a==b)  {
            System.out.println("both are equal");

        }
        else {
            System.out.println("2nd number is greater");
        }
    }

    }

