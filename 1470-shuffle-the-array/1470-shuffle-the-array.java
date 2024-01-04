class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[]ans=new int[n*2];
      
        for(int i=0,j=0;i<n;i++,j+=2)
        {
           ans[j]=nums[i];
        }
        for(int k=n,l=1;k<2*n;k++,l+=2)
        {
            ans[l]=nums[k];
        }
        return ans;
        
    //     int[]arr=new int[nums.length];
    //     int j=0;int q=1;
    //    for(int i=0;i<nums.length;i++)    //2,3,5,7,8,9//o/p- 2,7,3,8,5,9
    //    {
    //       if(i<n){
    //       arr[j]=nums[i];j+=2;}
    //       else
    //       {
    //          arr[q]=nums[i];q+=2;
    //       }
    //    } 
       
    //    return arr;

    


    // int ans[]=new int[2*n];
    // int k=1;
    
    // for(int i=0,j=0;i<nums.length;i++,j+=2)
    // {
        
    //  if(i<n)  
    //   { 
    //     ans[j]=nums[i];
    //   }  
    //   else
    //     {
    //       ans[k]=nums[i];k+=2;
    //     }
    // }return ans;
    }
}