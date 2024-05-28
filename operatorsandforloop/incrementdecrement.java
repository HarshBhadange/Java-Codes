package operatorsandforloop;

public class incrementdecrement {
    public static void main(String[] args){
        int a=42;
        int b=~a;
        //a++;
        //--b;
        //System.out.println(a);
        //System.out.println(b);
        //int c=a--+b--;
        //System.out.println(++c);
        //int f=a^b;
        System.out.println(a+" "+b);
        int x=15;
        int y=x++;
        int z=++x;
        System.out.println(y+" "+z);

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
