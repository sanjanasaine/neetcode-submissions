class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        int n = nums.length;
        HashMap<Integer, Integer> map =  new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            if(!map.containsKey(nums[i]))
              map.put(nums[i], 1);
            else
               map.put(nums[i], map.get(nums[i]) + 1);  
        }

        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        ArrayList<Integer> number = new ArrayList<>(map.keySet());

        for(int i = 0; i < number.size(); i++)
        {
              
              int num = number.get(i);
              int freq = map.get(num);

              if(bucket[freq] == null)
                 bucket[freq] = new ArrayList<>();

              bucket [freq].add(num);  
        }

        int[] ans = new int[k];
        int index = 0;

        for(int i = bucket.length -1; i >= 0; i--)
        {
            if(bucket[i] != null)

            for(int j =0; j < bucket[i].size(); j++)
            {
                ans[index] = bucket[i].get(j);
                index++;

                if(index == k)
                   return ans;
            }

        }
    return ans;

        
    }
}
