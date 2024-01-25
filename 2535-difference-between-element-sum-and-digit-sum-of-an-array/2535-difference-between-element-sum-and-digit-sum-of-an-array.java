class Solution {
    public int differenceOfSum(int[] nums) {
    
        
        int sum1=0,sum2=0;
        for(int i=0;i<nums.length;i++)
           {
           sum1=sum1+nums[i];
           }
        
        for(int j=0;j<nums.length;j++)
           {
           while(nums[j]>0)
              {
             int a=nums[j]%10;  //134=>4
             sum2=sum2+a;
            nums[j]=nums[j]/10; //13
           }
        }
        return Math.abs(sum1-sum2);
    }
}