class Solution 
{
    public int findJudge(int n, int[][] trust) 
    {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i = 0; i < trust.length; i++)
       {
          if(!map.containsKey(trust[i][1]))
            map.put(trust[i][1], 1);
         
         else
          map.put(trust[i][1], map.get(trust[i][1]) + 1);   
       }
       int ans =  -1;
       for(Map.Entry<Integer, Integer> entry : map.entrySet())
       {
          if(entry.getValue().equals(n - 1))
             ans =  entry.getKey();

          for(int i = 0; i < trust.length; i++ )
          {
             if(trust[i][0] == ans)
               return -1;
          }  
       }
          
       return ans;
    }
}