class Solution {
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length == 0)
          return 0;

        HashSet<Integer > set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }
        
        int max = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int num = nums[i];

            if(!set.contains(num - 1) )
            {
                int count = 1;
                while(set.contains(num + 1))
                {
                    num++;
                    count++;
                }

                if(count > max)
                   max = count;
            }  
                
        }

        return max;
        
    }
}
