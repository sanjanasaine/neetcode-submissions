class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
       int n = nums.length; 
       int left = 0;
       int right = n - 1;

      for(int i = 0; i < n; i++)
      {
         for(int j = i + 1; j < n ;j ++)
         {
            int sum = nums[i] + nums[j];

            if(sum == target)
               return new int[]{i,j};
              
         }
      }

       
      return new int[]{};
    }
}
