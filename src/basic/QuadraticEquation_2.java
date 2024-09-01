package basic;

import java.util.Scanner;

public class QuadraticEquation_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter a,b and c");
        a=input.nextDouble();
        b= input.nextDouble();
        c= input.nextDouble();
        double x1=0,x2=0;
        double d=b*b-4*a*c;
        boolean possible=true;
        if(d<0){
            System.out.println("the root is imaginery");
            possible=false;

        }
        else if(d==0){
            x1=x2=-(b/2*a);
        }
        else if(d>0){
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
        }
        if(possible){
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }

    }
}
