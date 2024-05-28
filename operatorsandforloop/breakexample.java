package operatorsandforloop;

public class breakexample {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i = i + 1) {
            for (int j = 0; j < 2; j = j + 1) {
                if (j == 1)
                    break;
                System.out.print(j + " ");

//                for (int i = 1; ; i++) {
//                    if (i > 5) {
//                        break;
//                        System.out.print("break statement reached");
//                    }
//                    System.out.print(i);
//                }


            }
        }}}

