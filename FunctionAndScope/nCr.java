package FunctionAndScope;

import java.util.Scanner;

public class nCr {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int r=s.nextInt();
//
//        int factN=1;
//        for (int i=1;i<=n;i++){
//            factN=factN*i;
//        }
//        int factR=1;
//        for (int j=1;j<=r;j++){
//            factR=factR*j;
//        }
//        int factNR=1;
//        for (int j=1;j<=n-r;j++){
//            factNR=factNR*j;
//    }
//            int result=factN/(factR*factNR);
//        System.out.println(result);
        int n=5,r=3;
        int factn=1,factr=1,factnr=1;
        for(int i=2;i<=n;i++)
        {
            factn*=i;
            if(i<=r)
                factr*=i;
            if(i<=n-r)
                factnr*=i;
        }
        int ncr=factn/(factr*factnr);
        System.out.print(ncr);

}}
