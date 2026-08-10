class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=0;int n=0;
        int mm=matrix.length;
        int nn=matrix[0].length;
        for(int i=0;i<mm;i++)
        {
            for(int j=0;j<nn;j++)
            {
                if(target==matrix[i][j])return true;
            }
        }
        return false;
        
    }
}