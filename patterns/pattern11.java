package patterns;

import java.util.Scanner;

public class pattern11  {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        int rownum=1;
        while(rownum<=n){
            int colnum=1;
            char p=(char)('A'+rownum-1);
            while(colnum<=rownum){
                System.out.print(p);
                colnum++;
                p++;
            }
            System.out.println();
            rownum++;
        }

    }
}
