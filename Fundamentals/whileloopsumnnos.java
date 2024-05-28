package Fundamentals;

import java.util.Scanner;

public class whileloopsumnnos {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        //int sum = 0;

        int i=10;
        while(i>0)
        {
            if(i%2==0)
            {
                System.out.print(10-i);
            }
            i--;
        }

        }
    }