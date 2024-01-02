class Solution {
    public int[] getConcatenation(int[] nums) {
//        int[]ans=new int[nums.length*2];
//       int[]nums1=new int[nums.length];
//       int[]nums2=new int[nums.length];
// for(int i=0;i<nums.length;i++)
// {
// nums1[i]=nums[i];
// nums2[i]=nums[i];
// }
// for(int j=0;j<ans.length/2;j++)
// {
// ans[j]=nums1[j];
// }
// for(int k=ans.length/2,l=0;k<ans.length;k++,l++)
// {
// ans[k]=nums2[l];
// }
// return ans;

        
// int n=nums.length;
// int []conc=new int[2*n];
// for(int i=0;i<n;i++)
// {
//     conc[i]=nums[i];
// }
// for(int j=n,i=0;j<2*n;j++,i++)
// {
//     conc[j]=nums[i];
// }
// return conc;
        
        
        int[]ans=new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[i];
        }
        for(int i=0,j=nums.length;i<nums.length;i++,j++)
        {
            ans[j]=nums[i];
        }
        return ans;
    }
}