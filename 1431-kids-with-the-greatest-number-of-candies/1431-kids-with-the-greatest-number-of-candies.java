class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
   List<Boolean>list=new ArrayList<>();
        int max=0;
        for(int m=0;m<candies.length;m++)
        {
            if(candies[m]>max)
            {
                max=candies[m];
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
        
        
        
    
    
    
    
    //     List<Boolean>list=new ArrayList<Boolean>();
    //    // Arrays.sort(candies);
    //     boolean flag=false;
    //     int max=0;
    //     int n=candies.length;
    //     for(int i=0;i<n;i++)
    //     {
    //         if(candies[i]>max)
    //         {
    //             max=candies[i];
    //         }
    //     }
    //     for(int j=0;j<n;j++){
    //    flag=false;
    //         if((candies[j]+extraCandies)>=max)
    //         {
    //             flag=true;
    //         }

    //         if(flag)
    //             {
    //                  list.add(true);
    //             }else
    //             {
    //                 list.add(false);
    //             }

    //     }
       
    //     return list;





    //     List<Boolean>ans=new ArrayList<>();
        
    //     int n=candies.length;
    //      int max=0;
    //      for (int j=0;j<n;j++)
    //      {
    //          if(candies[j]>max)
    //          {
    //              max=candies[j];
    //          }
    //      }
    //     for(int i=0;i<n;i++)
    //     {
    //         if((extraCandies + candies[i])>=max)
    //         {
    //             ans.add(true);
    //         }else
    //         {
    //             ans.add(false);
    //         }
    //     }
    //    return ans; 
    }
}