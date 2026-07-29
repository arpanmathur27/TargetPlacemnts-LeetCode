class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>res=new ArrayList<>();
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        
        while(top <= bottom && left <= right)
        {
            for(int a=left;a<=right;a++)
            {
                res.add(matrix[top][a]);
                
            }
            top++;
            for(int a=top;a<=bottom;a++)
            {
                res.add(matrix[a][right]);
                
            }
            right--;
            if(top<=bottom)
            {
            for(int a=right;a>=left;a--)
            {
                res.add(matrix[bottom][a]);
                
            }
            }
            bottom--;
            if(left<=right)
            {
            for(int a=bottom;a>=top;a--)
            {
                res.add(matrix[a][left]);
            }
            }
            left++;
        }
        return res;
        
    }
}