package pattern2;

import java.util.Scanner;

public class pat7 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=1;
        int row =1;
        while (row <= n) {
            int spaces =1;
            while (spaces<=n-row){
                System.out.print(' ');
                spaces++;
            }
            int incno=1;
            int y=row;
            while (incno<=row){
                System.out.print(y);
                y++;
                incno++;

            }

            int r=2*(row-1);
            while (r>=row){
                System.out.print(r);
                r--;
            }
            System.out.println();
            row++;
        }
    }
}
