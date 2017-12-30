public class Solution {
    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        int totalPos = m + n - 1;
        int aPos = m - 1;
        int bPos = n - 1;

        while(aPos >= 0 && bPos >= 0){
            if(A[aPos] < B[bPos]){
                A[totalPos--] = B[bPos--];
            }
            else{
                A[totalPos--] = A[aPos--];
            }
        }

        while (bPos >= 0){
            A[totalPos--] = B[bPos--];
        }

    }
}