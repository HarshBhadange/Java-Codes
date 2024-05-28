package patterns;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int rowno=1;
        while (rowno<=n) {
            int columnno=1;
            while (columnno<=rowno){
                System.out.print(columnno);
                columnno++;
            }
            System.out.println();
            rowno++;

        }
    }
}
