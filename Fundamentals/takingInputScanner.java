package Fundamentals;

import java.util.Scanner;

public class takingInputScanner {
    public static void main(String[] args) {
        int a,b;

        Scanner s =new Scanner(System.in);
       /* a = s.nextInt();
        b = s.nextInt();
        int c = a+b;
        System.out.println(c);*/

        //String str= s.next();
        //System.out.print(str);

        //String str= s.nextLine();
        //System.out.print(str);

        String str =s.next();
        char ch = str.charAt(0);
        System.out.print(ch);


    }
}
