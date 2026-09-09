class Solution {
    public int leastInterval(char[] tasks, int n) 
    {
      HashMap<Character, Integer> map = new HashMap<>();
      for(int i = 0; i < tasks.length; i++)
      {
         if(!map.containsKey(tasks[i]))
            map.put(tasks[i], 1);

         else
           map.put(tasks[i], map.get(tasks[i]) + 1);
      }

      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

      for(int frequency : map.values())
          pq.add(frequency);
      
      int time = 0;
      while(!pq.isEmpty())
      {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i <= n; i ++)
        {
            if(!pq.isEmpty())
            {
                int freq = pq.poll();
                freq--;
                
                if(freq > 0)
                  arr.add(freq);

                time++;  
            }
            else
            {
                if(arr.isEmpty())
                  break;

                time++;  
            }
        }

        for(int  i = 0; i < arr.size(); i++)
        {
            pq.add(arr.get(i));
        }
      }
     return time;   
    }
}
