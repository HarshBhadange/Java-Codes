package patterns;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int rownum=1;
        while(rownum<=n){
            int colnum=1;
            while(colnum<=rownum){
                char jthChar=(char)('A'+rownum-1);
                System.out.print(jthChar);
                colnum++;
            }
            System.out.println();
            rownum++;
        }

    }
}
