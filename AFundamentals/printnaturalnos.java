package AFundamentals;

import java.util.Scanner;

public class printnaturalnos {
    public static void main(String[] args)

    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        int i=1;
        while (i<=n){
            System.out.println(i);
            i++;
        }
    }

}
