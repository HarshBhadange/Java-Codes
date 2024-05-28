package pattern2;

import java.util.Scanner;

public class pat6 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int row =1;
        while (row <= n) {
            int spaces =1;
            while (spaces<=n-row){
                System.out.print(' ');
                spaces++;
            }
            int stars=1;
            while (stars<=row){
                System.out.print('*');
                stars++;
            }
            int decstars=row-1;
            while (decstars>=1){
                System.out.print('*');
                decstars--;
            }
            System.out.println();
            row++;
        }
    }
}
