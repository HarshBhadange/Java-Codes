package operatorsandforloop;

import java.util.Scanner;

public class breakstatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i+1==j){
                   // break; only exits the loop that to the immediate loop but return exits the main loop too.

                return;
                }
                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }
}