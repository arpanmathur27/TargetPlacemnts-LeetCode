class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,right=0,maxLen=0,maxFreq=0,n=s.length();
        int freq[]=new int[26];
        while(right<n)
        {
            int c=s.charAt(right)-'A';
            freq[c]+=1;
            maxFreq=Math.max(maxFreq,freq[c]);
            while((right-left+1)-maxFreq>k)
            {
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxLen=Math.max(maxLen,(right-left+1));
            right++;
        }
        return maxLen;
    }
    
}