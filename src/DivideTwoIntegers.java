import java.util.ArrayList;

public class DivideTwoIntegers {
    public int divide(int A, int B) {
        if(A == Integer.MIN_VALUE && B == -1) return Integer.MAX_VALUE;
        int negatives = 2;
        if (A > 0) {
            negatives--;
            A = -A;
        }
        if (B > 0) {
            negatives--;
            B = -B;
        }

        ArrayList<Integer> doubles = new ArrayList<>();
        ArrayList<Integer> Po2 = new ArrayList<>();
        int P2 = -1;
        while(A>=B){

        }



        return 1;

    }

}
