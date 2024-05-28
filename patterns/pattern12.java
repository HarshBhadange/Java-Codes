
package patterns;
import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int row=1;
        int num=n;
        while(row<=n){
            int col=1;
            char p=(char)('A'+num-1);
            while(col<=row){

                System.out.print(p);
                col++;
                p++;
            }
            System.out.println();

            num--;
            row++;

        }

    }
}
