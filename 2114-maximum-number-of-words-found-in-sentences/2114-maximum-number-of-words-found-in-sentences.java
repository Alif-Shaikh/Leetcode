class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxVal=0;
        for(String str:sentences)
        {
            int cnt=1;
           for(int i=0;i<str.length();i++)
           {
               if(str.charAt(i)==' ')
               {
                   cnt++;
               }
               
           } maxVal=Math.max(maxVal,cnt);
        }
        return maxVal;
        
        
// int ans=0;
// for(String str:sentences)
// {
// int cnt=0;
//    String[] str1=str.split(" ");
//    for(String str2:str1)
//    cnt++;
//    ans=Math.max(ans,cnt);
// }return ans;



    }
}