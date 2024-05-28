package FunctionAndScope;

import java.util.Scanner;

public class function {
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();

        int factN=factorial(n);
        int factR=factorial(r);
        int factNR=factorial(n - r);
        int result=factN/(factR*factNR);
        System.out.println(result);
    }
//public static void func(int a, int b){
//    System.out.println(a + b);
//}
//
//    public static void main(String[] args) {
//        int a = 7;
//        func(a, 12);
//    }
//public static void demo(int a, int b){
//    System.out.println(a + " " + b);
//}
//
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 15;
//        demo(a);error as demo wants two int int
//    }


}
