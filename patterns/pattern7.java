package patterns;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();

        int rownum=1;

        while(rownum<=n){
            int colnum=1;
            int p=rownum;
            while (colnum<=rownum){
                System.out.print(p);
                p++;
                colnum++;

            }
            System.out.println();
            rownum++;
        }
    }
}
