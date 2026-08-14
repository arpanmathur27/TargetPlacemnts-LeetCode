class Solution {
    public int maximumLengthSubstring(String s) {
        int[]freq=new int[26];
        for(int i=0;i<26;i++)
        {
            freq[i]=0;
        }
        int left=0,right=0,res=0;
        while(right<s.length())
        {
            freq[s.charAt(right)-'a']+=1;
            while(freq[s.charAt(right)-'a']>2&&left<s.length())
            {
                freq[s.charAt(left)-'a']--;
                left++;
            }
            right++;
            res=Math.max(res,(right-left));
        }
        res=Math.max(res,(right-left));
        return res;

        
    }
}