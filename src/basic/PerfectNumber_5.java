package basic;

import java.util.Scanner;

public class PerfectNumber_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number");
        long num=input.nextLong();
        if(CheckPerfect(num)){
            System.out.println(num+" is perfect");
        }
        else
            System.out.println(num+ "is not perfect");
    }
    static boolean CheckPerfect(long x){
        long sum=0;
        for(long i=1;i<=x/2;i++) if (x % i == 0) sum += i;
        if(sum==x)
            return true;
        else
            return false;
    }
}
