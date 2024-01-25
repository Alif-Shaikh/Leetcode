class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter=0;
      
    List<Character>set=new ArrayList<Character>();
        for(int i=0;i<allowed.length();i++)
        {
           set.add(allowed.charAt(i));
        }
        
        for(int j=0;j<words.length;j++)
        {
            boolean flag=false;
            for(int k=0;k<words[j].length();k++)
            {
               if(!set.contains(words[j].charAt(k)))
               {
                  flag=true;
               }
            }
            if(!flag) counter++;
        }return counter;
    }
}