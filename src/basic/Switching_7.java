package basic;

import java.util.Scanner;

public class Switching_7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char c=input.next().charAt(0);

        switch (c){case 'a':
                System.out.println(c+" is a vowel");
                break; case 'e':
                System.out.println(c+" is a vowel");
                break; case 'i':
                System.out.println(c+" is a vowel");
                break;case '0':
                System.out.println(c+" is a vowel");
                break;case 'u':
                System.out.println(c+" is a vowel");
                break; default:
            System.out.println(c+" is not a vowel");

        }
    }
}
