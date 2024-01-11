class Solution {
    public String truncateSentence(String s, int k) {
        
       StringBuilder sb=new StringBuilder();
        String[]str=s.split(" ");
       
        for(int i=0;i<str.length;i++)
        {
            if(i<k)
            {
                sb.append(str[i]);
                if(i<k-1)
                sb.append(" ");
            }
        }return sb.toString();
       
        
        
//         String[]str=s.split(" ");
//         String[]ans=new String[k];
//         for(int i=0;i<str.length;i++)
//         {
//             if(i<k)
//             {
//                 ans[i]=str[i];
                
//             }
//         }return String.join(" ",ans);
        
        
 

   
    }
}