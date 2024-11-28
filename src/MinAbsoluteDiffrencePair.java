import java.util.*;
public class MinAbsoluteDiffrencePair {
    public static void main(String[] args) {
        int A[] = {1,2,3};
        int B[] ={2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int MinAbs = 0;
        for(int i = 0; i < A.length; i++){
            MinAbs = Math.max(MinAbs, Math.abs(A[i] - B[i]));
        }
        System.out.println("Minimum Absolute Value = "+MinAbs);

    }
}
