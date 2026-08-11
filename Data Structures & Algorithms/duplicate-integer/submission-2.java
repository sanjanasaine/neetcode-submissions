class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        Arrays.sort(nums);  //O(logn)
        for(int i = 1; i < nums.length; i++ )  //O(n)
        {
            if(nums[i] == nums[i -1])
               return true;
        }
        
        return false;
    }
}                             //overall O(nlogn)