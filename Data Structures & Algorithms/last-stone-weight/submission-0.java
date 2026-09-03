class Solution 
{
    public int lastStoneWeight(int[] stones) 
    {
        int n = stones.length;

        while(n > 1)
        {
            Arrays.sort(stones, 0 , n);

            int x = stones[n - 1];
            int y = stones[n - 2];

            if(x == y)
              n = n - 2;

            else
            {
                stones[n - 2] = x - y;
                n--;
            }  
        }
        
        if(n == 0)
          return 0;

        else
          return stones[0];  

    }
}
