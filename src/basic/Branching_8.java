package basic;

public class Branching_8 {
    public static void main(String[] args) {
        int i=10;
        if(i==10 || i<15){
            if(i<15) System.out.println(i+" is smaller than 15");
            if(i<12) System.out.println(i+" is smaller than 12");
        }
        else System.out.println(i+" is greater than 15");
    }
}
