class Solution {
    public String sortSentence(String s) {
       String str[]= s.split(" ");
       String[]ans=new String[str.length];
       int n=0;int len=0;
        for(int i=0;i<str.length;i++)
        {
            n=(int)str[i].charAt(str[i].length()-1)-'0';
            len=str[i].length()-1;
            ans[n-1]=str[i].substring(0,len);
                }
        return String.join(" ",ans);
        
        
        
//         String[] str=s.split(" ");
        
//         String[] sort=new String[str.length];
//         for(String ans:str)
//         {
//             for(int i=0;i<ans.length();i++)
//             {
//             int num=ans.charAt(ans.length()-1)-'0';
//                 sort[num-1]=ans.substring(0,ans.length()-1);
//             }
//         }
//         return String.join(" ",sort);
    }

}