class Solution 
{
    public int[] getOrder(int[][] tasks) 
    {
       int n = tasks.length;
       int[][] arr = new int[n][3];
       for(int i = 0; i < n; i ++)
       {
          arr[i][0] = tasks[i][0];
          arr[i][1] = tasks[i][1];
          arr[i][2]=  i;
       }

       Arrays.sort(arr, (a,b) -> a[0] - b[0]);

       PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->
         { 
           if(a[1] != b[1])
             return a[1] - b[1];

           return a[2] - b[2];  
         }
       );

       int[] ans = new int[n];
       int ansIndex = 0;
       int i = 0;
       long time = 0;

       while(ansIndex < n)
       {
         if(pq.isEmpty() && time < arr[i][0])
            time = arr[i][0];

         while(i < n && arr[i][0] <= time)
         {
            pq.add(arr[i]);
            i++;
         }

         int[] shortpt = pq.poll();
         ans[ansIndex] = shortpt[2];
         ansIndex++;

         time = time + shortpt[1];
       }

       return ans;
       
    }
}