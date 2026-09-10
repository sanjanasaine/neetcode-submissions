class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) 
    {
      int n = profits.length; 
      int[][] arr = new int[n][2];

      for(int i = 0; i < n; i++)
      {
         arr[i][0] = capital[i];
         arr[i][1] = profits[i];
      }

     Arrays.sort(arr, (a,b) -> a[0] - b[0]);

     PriorityQueue<int[] > pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);
     
     int noOfProjects = 0;
     int i = 0;
     while( noOfProjects < k )
     {
        while(i < n && arr[i][0] <= w )
        {
          
            pq.add(arr[i]);
            i++;

        }

        if(pq.isEmpty())
          return w;
        
        if(!pq.isEmpty())
        {
          int[] max = pq.poll();
          w = w + max[1];
          noOfProjects++;
        }  
     }
      return w;
    }
}