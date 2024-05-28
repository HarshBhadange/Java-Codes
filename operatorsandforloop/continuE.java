package operatorsandforloop;

public class continuE {
    public static void main(String[] args){
        int i = 1;
        while(i < 3) {
            int j = 0;
            while(j < 5) {
                j++;
                if(j == 3) {
                    continue;
                }
                System.out.print(j + " ");
            }
            i++;
//        int i = 1;
//        while(i < 3) {
//            int j = 1;
//            while(j < 5) {
//                if(j == 3) {
//                    break;
//                }
//                System.out.print(j + " ");
//                j++;
//            }
//            i++;
//        int n=5;
//        for (int i=1;i<=n;i++){
//            if(i==4){
//                continue;
//            }
//            System.out.println(i);
//
//
//        }
//
////    int i=1;
//    int n=5;
//    while(i<=n){
//        i++;
//        if (i==4){
//            continue;
//        }
//        System.out.println(i);
//    }
    }
}}
