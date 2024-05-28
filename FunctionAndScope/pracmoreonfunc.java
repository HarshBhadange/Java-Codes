package FunctionAndScope;

public class pracmoreonfunc {
    public static int Sum(int a,int b){
        int Sum=a+b;
        return Sum;
    }
    public static void printEvenno(){
        for (int i=2;i<=100;i+=2){
        System.out.println(i);

    }
    }
    public static void printEven(int start,int end){
        if (start%2!=0){
            start+=1;
        }for (int i=start;i<=end;i+=2){
            System.out.println(i);

    }}
    public static void main(String[] args){
//        int a=1234;
//        int b=567;
//        int ans= Sum(a,b);
//        System.out.println(ans);
//        printEvenno();

            printEven(3,17);


    }
}
