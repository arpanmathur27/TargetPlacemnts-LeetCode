class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>1)
            {
                char x=s.charAt(left);
                map.put(x,(map.get(x)-1));
                left++;
            }
            max=Math.max(max,(i-left)+1);
        }
        return max;

        
    }
}