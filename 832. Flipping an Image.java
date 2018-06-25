class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = A[i][j];
                A[i][j] = A[i][n-j-1];
                A[i][n-j-1] = temp;
            }
            for(int j=0;j<n;j++){
                if(A[i][j]==0) A[i][j]=1;
                else if(A[i][j]==1) A[i][j]=0;
            }
        }
        
        return A;
    }
}
