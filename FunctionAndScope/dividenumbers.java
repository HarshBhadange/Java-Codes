package FunctionAndScope;

public class dividenumbers {
    public static int division(int num,int deno){
        if (deno==0){
            return Integer.MIN_VALUE;
        }
        System.out.println("outside if");
        int ans=num/deno;
        return ans;
    }
    public static void main(String[] args){
        int x=division(20,0);
            System.out.println(x);
        }
    }

