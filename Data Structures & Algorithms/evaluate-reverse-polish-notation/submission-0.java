class Solution {
    public int evalRPN(String[] tokens) 
    {
       Stack<Integer> stack = new Stack<>();
       for(int  i = 0; i < tokens.length; i++)
       {
         String ch = tokens[i];

         if(ch.equals("+"))
         {
            int first = stack.pop();
            int second = stack.pop();

            stack.push(first + second);
         }
        else if(ch.equals("-"))
         {
            int first = stack.pop();
            int second = stack.pop();

            stack.push(second - first);
         }

        else if(ch.equals("*"))
         {
            int first = stack.pop();
            int second = stack.pop();

            stack.push(first * second);
         }
        else if(ch.equals("/"))
         {
            int first = stack.pop();
            int second = stack.pop();

            stack.push(second/first);

         }

         else
         {
            stack.push(Integer.parseInt(ch));
         }  
       }

       return  stack.peek();  
    }
}
