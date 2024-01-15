class Solution {
    public boolean checkIfPangram(String sentence) {
        
      
      int cnt=0;
      boolean[]b=new boolean[26];
      boolean flag=false;
      int index=0;
        for(int i=0;i<sentence.length();i++)
        {
          for(char c='a';c<='z';c++)
          {
             index= sentence.charAt(i)-'a';
                 
          }b[index]=true;
        }
        for(int j=0;j<=25;j++)
        {
          if(b[j]!=true)
          {
           flag=true;
          }
        }
        if(flag)
        {
          return false;
          }
        else
        {
          return true;}
      
    }
}