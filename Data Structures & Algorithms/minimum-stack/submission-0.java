class MinStack 
{
    Stack<Integer> s;
    Stack<Integer> min;
    int r;
    public MinStack() 
    {
       s = new Stack<>();   
       min = new Stack<>();
    }
    
    public void push(int val) 
    {
       s.push(val);  

       if(min.isEmpty() || val <= min.peek())  
        min.push(val);
    }
    
    public void pop() 
    {
       
       if(!s.isEmpty())
       {
           r = s.pop();
       } 
       if(r == min.peek())
         min.pop();     
    }
    
    public int top() 
    {
        return s.peek();    
    }
    
    public int getMin() 
    {
       return min.peek();    
    }
}
