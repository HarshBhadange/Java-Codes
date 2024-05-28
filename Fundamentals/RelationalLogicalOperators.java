package Fundamentals;

public class RelationalLogicalOperators {
    public static void main(String[] args){
        int a=10,b=10;
        System.out.println(a > b);
        //a is greater than
        System.out.println(a < b);
        //less than or equal to
        System.out.println(a == b);
        //compare check weather lhs is equal to rhs
        System.out.println(a!=b);
        //not equal to
        System.out.println(a>=b);
        System.out.println(a<=b);
        //end if relational operator

        //start logical
        /*and operator &&
         condition...&&...condition is the syntax
         is true if both cond are true otherwise false
         or operator -> ||
         cond || cond
         true is any one condition is true only false when both are false

         */
        System.out.println(a==b && a==b);
        System.out.println(a>=b || a>b);
        System.out.println(!(a==b));



    }
}
