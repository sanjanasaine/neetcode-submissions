class Solution {
    public int majorityElement(int[] nums) 
    {
       HashMap<Integer , Integer> map = new HashMap<>();
       for(int i = 0; i < nums.length; i++)
       {
          if(!map.containsKey(nums[i]))
            map.put(nums[i] , 1);
          else
             map.put(nums[i] , map.get(nums[i]) + 1);  
       }

       ArrayList<Integer> arr = new ArrayList<>(map.keySet());
       arr.sort((a,b) -> map.get(b) - map.get(a));
       return arr.get(0);
    }
}