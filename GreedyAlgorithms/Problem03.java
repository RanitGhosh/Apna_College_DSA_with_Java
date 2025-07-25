
// Min Absolute Difference Pairs   :

// Given two arrays A and B of equal length n. Pair each element of array A to an element
// in array B, such that sum S of absolute differences of all the pairs is minimum.
// A: [1, 2, 31
// B: [2, 1, 31
// ans = 0


import java.util.*; 
public class Problem03 {
    
    public static void main(String[] args) {
        int A[]={1, 2, 3};
        int B[]={2, 1, 3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff=0;

        for(int i= 0; i<A.length;i++){
            minDiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println("Minmum Absolute Diff of Pairs : "+minDiff);
        
    }
}
