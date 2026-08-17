class Solution {
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length == 0)
          return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }
        
        
        int max =1;
        for(int i = 0; i < nums.length; i++)
        {
            
            if(!set.contains(nums[i] - 1))
            {
               int count = 1;
               int num = nums[i];
                while(set.contains(num + 1))
                {
                  num++;
                  count++;
                }

                max = Math.max(max , count) ;  
            }        
        } 

        return max;   
    }
}