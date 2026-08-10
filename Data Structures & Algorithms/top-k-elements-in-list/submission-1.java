class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        //frequency count
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i = 0; i < nums.length ; i++)
       {
          if(!map.containsKey(nums[i]))
              map.put(nums[i],1);

          map.put(nums[i], map.get(nums[i]) + 1);    
       }

        //create min heap
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        ArrayList<Integer> number =  new ArrayList<>(map.keySet());

        for(int i = 0; i < number.size(); i++)
        {
            int num = number.get(i);
            heap.add(num);

            if(heap.size() > k)
               heap.poll();
        }
        
        int[] ans =  new int[k];
        for(int i = 0; i < k; i++)
        {
            ans[i] = heap.poll();
        }

         return ans;
    }
    
}
