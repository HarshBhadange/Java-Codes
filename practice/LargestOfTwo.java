package practice;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();

        if (a<b){
            System.out.println("bis greater");
        }
        else{
            System.out.println("a is greater");
        }System.out.println(" dont know outside loop");
    }
}
