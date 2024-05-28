package FunctionAndScope;

public class updatevalue {
    public static int increment(int n){
        n++;
        return n;//returned n from callee

    }
    public static void main (String[] args){
        int n=10;
        n=increment(n);//passed arguement
        System.out.println(n);
    }
}
