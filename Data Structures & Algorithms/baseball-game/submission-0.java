class Solution {
    public int calPoints(String[] operations) 
    {
        Stack<Integer> stack =  new Stack<>();
        int ans = 0;
       for(int  i = 0; i < operations.length; i++)
       {
          String ch = operations[i];

          if(ch.equals("5"))
           stack.push(5);

          else if(ch.equals("D"))
            stack.push(stack.peek() * 2);

          else if(ch.equals("+"))
          {
             int first = stack.pop();
             int second = stack.peek();
             
             stack.push(first);
             stack.push(first + second);

          }     

          else if(ch.equals("C"))
            stack.pop();  

          else
            stack.push(Integer.parseInt(ch));  

          
            
       } 
       while(!stack.isEmpty())
          {
            ans = stack.pop() + ans;

          } 

       return ans;       
    }
}