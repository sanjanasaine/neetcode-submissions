class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

       for(int right = 0; right < nums.length; right++)
       {
           sum = sum + nums[right];

          while(sum >= target)
          {
            sum = sum - nums[left];
            minLen = Math.min(right - left + 1, minLen);
            left++;

           
          }
       } 
       if(minLen == Integer.MAX_VALUE)
          return 0;

       else
         return minLen;    
    }
}