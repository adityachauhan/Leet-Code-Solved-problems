class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] ar = new int[row*col];
        int[] ac = new int[col*row];
        int mat=0;
        int c=0;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    ar[mat] = i;
                    ac[mat] = j;
                    mat++;
                }
            }
        }
        for(int i=0;i<mat;i++){
            int row_index = ar[i];
            for(int j=0;j<col;j++){
                matrix[row_index][j] = 0;
            }
        }
        for(int i=0;i<mat;i++){
            int col_index = ac[i];
            for(int j=0;j<row;j++){
                matrix[j][col_index] = 0;
            }
        }
        
    }
}
