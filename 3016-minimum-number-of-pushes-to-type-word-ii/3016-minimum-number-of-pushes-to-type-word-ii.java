class Solution {
    public int minimumPushes(String word) {
        int []freq= new int[26];
        int n=word.length();
        for(int i=0;i<n;i++)
        {
            freq[word.charAt(i)-'a']++;
        }

        Arrays.sort(freq);
        int presses=0;
        
        for(int i=25;i>=0;i--)
        {
            if (freq[i] == 0) break;
            presses+=freq[i]*((25-i)/8+1);
        }
        return presses;        
    }
}