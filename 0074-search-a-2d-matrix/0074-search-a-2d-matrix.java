class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        
        int row=-1;
        while(top<=bottom)
        {
            int mid=top+(bottom-top)/2;
            if(matrix[mid][left]<=target && target<=matrix[mid][right])
            {
                row=mid;
                break;
            }
            if(target<matrix[mid][left])bottom=mid-1;
            else top=mid+1;
        }
        if(row==-1)return false;
        
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(target==matrix[row][mid])return true;
            if(target<matrix[row][mid])right=mid-1;
            if(target>matrix[row][mid])left=mid+1;   
        }
        return false;
        
    }
}