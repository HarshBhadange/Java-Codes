package pattern2;

import java.util.Scanner;

public class pat8 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();

        int half=(n+1)/2;
        int nHalf=n/2;

        //half
        int curRow=1;

        while(curRow<=half) {
            int spaces = 1;
            while (spaces <= half - curRow) {
                System.out.print(' ');
                spaces = spaces + 1;
            }
            int curCol = 1;
            while (curCol <= (2 * curRow) - 1) {
                System.out.print("*");
                curCol++;
            }
            System.out.println();
            curRow++;
        }
            //nHalf
            curRow=nHalf;

            while (curRow>=1){
                int spaces=1;
                while (spaces<=(nHalf-curRow+1)){
                    System.out.print(" ");
                    spaces+=1;
                }
                int curCol=1;
                while (curCol<=(2*curRow)-1){
                    System.out.print("*");
                    curCol++;
                }
                System.out.println();
                curRow--;
            }
        }
    }
    

