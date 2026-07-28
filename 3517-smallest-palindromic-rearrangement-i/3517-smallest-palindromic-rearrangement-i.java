class Solution {
    public String smallestPalindrome(String s) {
        int freq[]= new int[26];
        for(int i=0;i<26;i++)
        {
            freq[i]=0;
        }
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder z=new StringBuilder();
        StringBuilder mid=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            int hf=freq[i]/2;
            for(int j=0;j<hf;j++)
            {
                z.append((char)(i+'a'));
            }
            if(freq[i]%2!=0)
            {
                mid.append((char)(i+'a'));
            }
        }
        return z.toString()+mid.toString()+z.reverse().toString();
        
        
    }
}