package pattern2;

import java.util.Scanner;

public class pat3 {
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
            int stars=1;
            while(stars<=row){
                System.out.print('*');
                stars=stars+1;
            }
            System.out.println();
            row++;
        }
    }
}
