package Fundamentals;

public class TypeCasting {
    public static void main(String[] args) {
        short s =100;
        int i=s;
        s=(short)i;
        System.out.println(s);
        int r=(int)10.6;
        //float f=1.7; invalid
        float f=(float)1.7;
        System.out.println((double)2/5);
        System.out.println(2/5);


        /*char ch ='a';
        int i = ch;
        //ch=i this will throw error because we are trying to store 4 byte in 2 bytes
        //so to resolve it we do explicit conversion as below
        ch=(char)i;
        System.out.println(ch);
        System.out.println(ch+1);*/
    }
}
