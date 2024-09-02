package Array;

public class TwoDTo1D {
    public static void main(String[] args) {
        int [][] twoDArray={
                {1,2,3},
                {3,4,5},
                {7,8,9}
        };
        int [] oneDArray=convert(twoDArray);
        System.out.println("1D Array: ");
        for (int num:oneDArray)
            System.out.print(num+" ");
    }
    static int[] convert(int[][] TD) {
        int[] OneDarray = new int[TD.length * TD.length];
        int index = 0;
        for (int i = 0; i < TD.length; i++) {
            for (int j = 0; j < TD.length; j++) {
                OneDarray[index++] = TD[i][j];
            }
        }
        return OneDarray;
    }
}
