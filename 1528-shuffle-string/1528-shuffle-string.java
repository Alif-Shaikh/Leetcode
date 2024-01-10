class Solution {
    public String restoreString(String s, int[] indices) {
        
        
     
        char []c=s.toCharArray();
           char[]ans=new char[c.length];
        for(int i=0;i<c.length;i++)
        {
           // ans[i]=c[indices[i]];
          ans[indices[i]]  =c[i];
        }
        return new String(ans);

    }
}