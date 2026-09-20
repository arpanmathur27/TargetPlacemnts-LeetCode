class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int a=s.charAt(i)-'a'+1;
            System.out.print("\n"+a+" ");
            int b=27-a;
            System.out.println(i+1);
            sum+=(i+1)*b;
        }
        return sum;
        
    }
}