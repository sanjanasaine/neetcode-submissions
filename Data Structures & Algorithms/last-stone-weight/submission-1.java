class Solution {
    public int lastStoneWeight(int[] stones) 
    {
      PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

      for(int i = 0; i < stones.length; i++)
      {
         heap.add(stones[i]);
      }

      while(heap.size() > 1)
      {
        int x = heap.poll();
        int y = heap.poll();

        if(x != y)
        {
            heap.add(x -y);
        }
      }

      if(heap.isEmpty())
        return 0;

      else
       return heap.peek();      
    }
}
