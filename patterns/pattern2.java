package patterns;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(i);
                j++;

            }
            System.out.println();
            i++;
        }

        int a = 1;
        while (a <= n) {
            int b=1;
            while (b<=n){
                System.out.print(b);
                b++;
            }
            System.out.println();
            a++;

        }
    }
}
