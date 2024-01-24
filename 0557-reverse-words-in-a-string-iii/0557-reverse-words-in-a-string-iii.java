class Solution {
    public String reverseWords(String s) {
        
        String[] str=s.split(" ");
        String[] ans=new String[str.length];
        String rev="";
        for(int i=0;i<str.length;i++)
        {
            rev="";
            for(int j=0;j<str[i].length();j++)
            {
                char c=str[i].charAt(j);
                    rev=c+rev;
            }
            ans[i]=rev;
        }return String.join(" ",ans);
            
            
            
        
//          String[]str=s.split(" ");
//         String[]reverse=new String[str.length];
       
        
//         for(int i=0;i<str.length;i++)
//         {
//              String s1="";
//             for(int j=0;j<str[i].length();j++)
//             {
//                 char c=str[i].charAt(j);
//                 s1=c+s1;
//             }
//             reverse[i]=s1;
//         }
//         return String.join(" ",reverse);
    }
}