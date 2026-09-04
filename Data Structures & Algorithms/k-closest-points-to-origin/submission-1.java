class Solution {
    public int[][] kClosest(int[][] points, int k) 
    {
       PriorityQueue<int[] > pq =  new PriorityQueue<>((a,b) -> {
         
         int disA = a[0] * a[0] + a[1] * a[1];
         int disB = b[0] * b[0] + b[1] * b[1];

         return disB - disA;
       });

       for(int i = 0; i < points.length; i++)
       {
           pq.add(points[i]);
           
           if(pq.size() > k)
             pq.poll();
       }

       int ans[][] = new int[k][2];

       for(int i = 0; i < k; i ++)
       {
          ans[i] = pq.poll();
       }

       return ans;    

    }
}
