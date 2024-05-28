package FunctionAndScope;

import java.sql.SQLOutput;

public class Divdenum {
    public static int division(int num,int deno){
        if (deno==0){
            return Integer.MIN_VALUE;
        }
        System.out.println("inside function");
        return num/deno;
    }
    public static void divisionResult(int num,int deno){
        if (deno==0){
            return;
        }
        System.out.println(num/deno);
    }
    public static void main (String[] args){
        int num=30;
        int deno=7;
//        print divisionResult(num,deno);
//        System.out.println(ans);
        divisionResult(num,deno);
        
    }
}
