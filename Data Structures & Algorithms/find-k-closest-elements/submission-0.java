class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) 
    {
       PriorityQueue<int[]> pq = new PriorityQueue<>(
        (a,b) -> {
            int disA = Math.abs(x - a[0]);
            int disB = Math.abs(x - b[0]);
           
           if(disA != disB)
            return disB - disA;

           else
             return b[0] - a[0];
             
        }
       );
      
       for(int i = 0; i < arr.length; i++)
       {
          pq.add(new int[]{arr[i], Math.abs(x - arr[i])});

          if(pq.size() > k)
             pq.poll();
       }
       
       ArrayList<Integer> list = new ArrayList<>();
       while(!pq.isEmpty())
       {
            list.add(pq.poll()[0]);
       } 
       Collections.sort(list);
       return list;   
    }
}