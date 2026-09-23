class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
      HashSet<Integer> set = new HashSet<>();
      int left = 0;
      for(int i = 0; i < nums.length ; i ++)
      {
        if(set.contains(nums[i]))
           return true;
           
        set.add(nums[i]); 

        if(i - left >= k)
        {
          set.remove(nums[left]);
          left++;
        }  

      }

      return false;
    }
}