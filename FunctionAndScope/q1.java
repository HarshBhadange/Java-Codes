package FunctionAndScope;

public class q1 {
//    public static void doubleValue(int a ){
//        a = a * 2;
//    }
public static int func(int a){
    a += 10;
    return a;
}

    public static void main(String[] args) {
            int a = 5;
            a= func(a);
            System.out.println(a);
        }



    }
//        int a = 5;
//        func(a);
//        System.out.println(a);
//    }
//
//    public static void main(String[] args) {
//        int a = 8;
//        doubleValue(a);
//        System.out.println(a);
//    }

