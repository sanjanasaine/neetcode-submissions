class Solution {
    public int[] asteroidCollision(int[] asteroids) 
    {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < asteroids.length; i++)
        {
           int j = asteroids[i];
           if(j > 0)
             stack.push(j);

           else
           {
              while(!stack.isEmpty() && j < 0 && stack.peek() > 0)
              {
                 if(stack.peek() < Math.abs(j))
                 {
                     stack.pop();
                     
                 }
                 else if(stack.peek() == Math.abs(j))
                 {
                    stack.pop();
                    j = 0;
                     break;
                 }
                 else
                 {
                    j = 0;
                    break;
                 }
                 
                 
              }
              if(j !=0)
                stack.push(j);
           }  
        }
        int[] arr = new int[stack.size()];
        for(int i = arr.length - 1; i >= 0; i--)
        {
         
            arr[i] = stack.pop();
         
        } 

        return arr;
    }
}