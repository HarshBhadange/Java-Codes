package pattern2;


import java.util.Scanner;

public class pat2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int rowno=1;
        while (rowno<=n){
            int colno=1;
            while (colno<=n-rowno+1){
                System.out.print(n-rowno+1);
                colno++;
            }
            System.out.println();
            rowno++;
        }

    }

    }

