class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]>merge= new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        int []prev= intervals[0];
        for(int i=0;i<intervals.length;i++)
        {
            if(prev[1]>=intervals[i][0])
            {
                prev[1]=Math.max(prev[1],intervals[i][1]);
            }
            else
            {
                merge.add(prev);
                prev=intervals[i];
            }
        }
        merge.add(prev);
        return merge.toArray(new int[merge.size()][]);
        
    }
}