package FunctionAndScope;

import java.util.Scanner;

public class MoreOnFUnctions {
    public static int sum(int a,int b){
        int ans=a+b;
        return a+b;
    }
//    public static void printeven(int start,int end){
//        if (start%2!=0){
//            start++;
//        }
//        for (int i=start;i<=end;i+=2){
//            System.out.println(i);
//        }
//        public static double add(int a,int b)
//        {
//            float c=a+b;
//            return c;
//        }
//        public static void main (String[] args) {
//            System.out.print(add(10,3));
//        }

//    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int ans = sum(a, b);
        System.out.println(ans);

//        printeven(3,17);
//    }
//
//}
    }}