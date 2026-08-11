class Solution {
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length == 0)
             return 0;
        

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        Arrays.sort(nums);

        
        for(int i = 0; i < nums.length; i ++)
        {
           if(!map.containsKey(nums[i]))
               map.put(nums[i] , 1);

           else
              map.put(nums[i], map.get(nums[i]) + 1);

        }

        ArrayList<Integer> arr = new ArrayList<>(map.keySet());
        int min = arr.get(0);
        int count = 1;
        int max = 1;
        for(int i = 1; i < arr.size(); i++)
        {
            if( arr.get(i) == min +1)
               count++;
            else
               count = 1;  

            min = arr.get(i);

            if(count > max)
                max = count;
        }

        return max;
    }
}
