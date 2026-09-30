class Solution 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {
       int n = temperatures.length;
       int[] arr = new int[n];

       for(int i = 0; i < n; i++)
       {
          arr[i] = 0;
          for(int j = i + 1; j < n; j++)
          {
             if(temperatures[j] > temperatures[i])
             {
                 arr[i] = j - i;
                 break;
             }
          }
       }     
       return arr;   
    }
}
