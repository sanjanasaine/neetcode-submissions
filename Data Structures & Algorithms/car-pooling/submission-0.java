class Solution 
{
    public boolean carPooling(int[][] trips, int capacity) 
    {
       int[] location = new int[1001];
       int car = 0;
       
          for(int j = 0; j < trips.length; j++)
          {
              int from = trips[j][1];
              location[from] = location[from] + trips[j][0];

              int to = trips[j][2];
              location[to] = -trips[j][0] + location[to]; 
          }     
       
         for(int i = 0; i < location.length; i++)
         {
             car = car + location[i];

             if(car > capacity)
               return false;
         }

         return true;
    }
}