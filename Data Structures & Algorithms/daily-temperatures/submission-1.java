class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
       int n = temperatures.length;
       int[] arr = new int[n];
       Stack<Integer> stack = new Stack<>();
       stack.push(0);
       for(int i = 1; i < n; i++)
       {
          while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])
          {
            int prev = stack.pop();
            arr[prev] = i - prev;
          }
          stack.push(i);
       }

       return arr;    
    }
}
