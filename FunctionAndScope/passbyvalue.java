package FunctionAndScope;

public class passbyvalue {
    public static void increment(int n){
        n++;
        System.out.println("increment"+n);
        return;
    }
    public static void main (String[] args){
        int n=100;
        increment(n);
        System.out.println("main"+n);
    }
}
//we guess that the value of n will be 11 but it is not the case main takes the value as 10 only but incre fun takes it as 11.
