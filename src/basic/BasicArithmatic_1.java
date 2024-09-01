package basic;

import java.util.Scanner;

public class BasicArithmatic_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Enter two number: ");
        a=input.nextInt();
        b=input.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        float f=(float)a/(float)b;
        int g=a%b;
        System.out.println("summation="+c+"\nsubstraction="+d+"\nmultiplication="+e+"\ndivition="+f+"\nmodulas="+g);

    }
}
