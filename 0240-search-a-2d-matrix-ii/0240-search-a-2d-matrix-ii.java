class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m=0,n=matrix[0].length-1,x=matrix.length;
        while(m<x&&n>=0)
        {
            if(matrix[m][n]==target)return true;
            if(matrix[m][n]>target)n--;
            else m++;
        }
        return false;
        
    }
}