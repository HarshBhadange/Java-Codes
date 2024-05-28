package AFundamentals;


import java.util.Scanner;

public class loop {
    public static void main(String[] args)

    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();


        int i = 1;
        while (i <= n) {
            System.out.println("hello");
            i = i + 1;
        }

    }
}
// int i=1;
// while (condition) {
//            System.out.println("something);
//           i = i + 1;-->this is used due to check the condition till it is false

//        }