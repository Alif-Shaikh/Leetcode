class Solution {
    public String truncateSentence(String s, int k) {
        
      String str[]=s.split(" ");
        String[] ans=new String[k];
        for(int i=0;i<k;i++)
        {
         ans[i]=str[i];   
        }
        return String.join(" ",ans);
       
        
        
 

   
    }
}