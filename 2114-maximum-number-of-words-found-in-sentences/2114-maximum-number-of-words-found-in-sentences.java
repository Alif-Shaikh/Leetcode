class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String str:sentences)
        {
            String[]str1=str.split(" ");
            int cnt=0;
            for(int i=0;i<str1.length;i++)
            {
                cnt++;
            }
            max=Math.max(cnt,max);
        }return max;
        }
}