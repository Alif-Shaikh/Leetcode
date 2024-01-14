class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int[]ans1=new int[nums.length];
        int[]ans2=new int [nums.length];
        int[]ans=new int[nums.length];
        int sum1=0,sum2=0;
        for(int i=0,m=1;i<nums.length-1;i++,m++)
        {
            ans1[0]=0;
            sum1=sum1+nums[i];
            ans1[m]=sum1;
        }
        
         for(int j=nums.length-1,n=nums.length-2;j>0;j--,n--)
        {
             ans2[nums.length-1]=0;
            sum2=sum2+nums[j];
             ans2[n]=sum2;
        }
        for(int k=0;k<nums.length;k++)
        {
            ans[k]=Math.abs(ans1[k]-ans2[k]);
        }return ans;
        
//         int n=nums.length;
//         int[]left=new int[n];
//         int[]right=new int[n];
//         int[]ans=new int[n];
//         int sum1=0,sum2=0;
//      for(int i=0;i<nums.length;i++)
//      {
// sum1=sum1+nums[i];
// left[i]=sum1;
//      }

//       for(int j=n-1;j>=0;j--)
//      {
// sum2=sum2+nums[j];
// right[j]=sum2;
//      }
     
//      for(int k=0;k<n;k++)
//      {
//          ans[k]=Math.abs(left[k]-right[k]);
//      }
//      return ans;
     
     
     
     
        // int sum1=0,sum2=0;
        // int n=nums.length;
        // int diff[]=new int[n];
        // int nums1[]=new int[n];
        // int nums2[]=new int[n];
        // nums1[0]=0;
        // nums2[nums.length-1]=0;

        // for(int i=0;i<n-1;i++)
        // {
       
        // sum1=sum1+nums[i];
        //     nums1[i+1]=sum1;
        // }
        // for(int j=n-1;j>0;j--)
        // {
        //  sum2=sum2+nums[j];
        //     nums2[j-1]=sum2;
        // }
      
        // for(int m=0;m<nums.length;m++)
        // {
        //     diff[m]=Math.abs(nums1[m]-nums2[m]);
        // }
        // return diff;
    }
}