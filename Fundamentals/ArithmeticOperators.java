package Fundamentals;

public class ArithmeticOperators {
    public static void main(String[] args){
        //divide,multiplication and mod has equal precedence
        //bodmass rule is followed

        /*double a = 10;
        double b  =3;
        double c = a/b;
        System.out.print(c);*/

       /*int a =10;
       int b= 3;
       int c= 2+3/5;
       System.out.print(c);*/

        int a=10;
        int b=3;
        int c=2*3/5;
        System.out.println(c);
        //In case there are multiple operands with same precedence then it is evaluated from left to right
        // that is associativity

        int x=100;
        int y=3;
        int q=100/(2*3);
        System.out.println(q);
        // Bracket has highest precedence



    }
}
