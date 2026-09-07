class Solution {
    public int leastInterval(char[] tasks, int n) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Map<Character ,  Integer> map = new HashMap<>();
        for(int i = 0; i < tasks.length; i++)
        {
            if(!map.containsKey(tasks[i]))
                map.put(tasks[i], 1);

            else
              map.put(tasks[i] , map.get(tasks[i]) + 1);    
        }

       for(int frequency : map.values() )
           pq.add(frequency);

        int time = 0;

        while(!pq.isEmpty())
        {   
            ArrayList<Integer> temp = new ArrayList<>();
           for(int i = 0; i <= n; i++)
           {
             
              
              if(!pq.isEmpty())
              {
                 int frequency = pq.poll();
                 frequency--;
                
                if(frequency > 0)
                   temp.add(frequency);

                time++;
  
              }

              else
              {
                if(temp.isEmpty())
                  break;

                time++;  
              }     
           }   
       

          for(int i = 0; i < temp.size(); i++)
          {
          pq.add(temp.get(i));
          } 
        }
       return time;
    }      
}
