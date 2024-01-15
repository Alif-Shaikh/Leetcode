class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int[]target=new int[nums.length];
        List<Integer>list=new ArrayList<>();
        
// index: This parameter specifies the index at which we the given element is to be inserted.
// element: This parameter specifies the element to insert in the list
        
        for(int i=0;i<index.length;i++)
        {
           list.add(index[i],nums[i]);
        }
        for(int j=0;j<nums.length;j++)
        {
            target[j]=list.get(j);
        }return target;
        }
}