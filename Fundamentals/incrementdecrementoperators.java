package Fundamentals;

public class incrementdecrementoperators {
    public static void main(String[] args){
        int a=60;
        int b=80;
        if (++a>60 || ++b>80)
        //here shortcircuiting occurs it only checks if the first statement is true or not then it goes without checking 2nd cond
            // 60 gets incremented but 80 does not
        {
            System.out.println("inside if");
        }else {
            System.out.println("inside else");


        }
        System.out.println( "a" + a + "b" + b );

   //     System.out.println(a++);
     //   System.out.println(a);
      //  System.out.println(++a);
      //  System.out.println(a);
      //  System.out.println(a);
      //  System.out.println(b);

    }
}
