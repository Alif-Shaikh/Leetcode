class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int ans=0;
        for(int i=0;i<accounts.length;i++)
        {
            int sum=0;
           for(int j=0;j<accounts[i].length;j++)
           {
               sum=sum+accounts[i][j];
           }
         ans= Math.max(ans,sum);
        }return ans;   

        

        // int maxVal=0;
        // for(int[]arr:accounts)
        // {
        //     int sum=0;
        //     for(int num:arr)
        //     sum=sum+num;
        //     maxVal=Math.max(sum,maxVal);
        // }return maxVal;
        


    //     int ans = 0;
    //     int n=accounts.length;
    //   //  int[][]arr=new int[n][];  n=2 here ->description
    //     for (int[] arr1 : accounts) {
            
    //         int s = 0;
    //         for (int v : arr1) {
    //             s += v;
    //         }
    //         ans = Math.max(ans, s);
    //     }
    //     return ans;
    }
}