package pattern2;

import java.util.Scanner;

public class pat5 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int row=1;
        while (row<=n){

            int spaces=1;
            while (spaces<=n-row){
                System.out.print(' ');
                spaces=spaces+1;
            }
            int num=1;
            while(num<=row){
                System.out.print(num);
                num=num+1;
            }
            int dec=row-1;
            while (dec >= 1){
                System.out.print(dec);
                dec=dec-1;


            }

            System.out.println();
            row++;

    }
}
}
