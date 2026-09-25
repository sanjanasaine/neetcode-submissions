class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
       HashMap<Character, Integer> map = new HashMap<>();
       for(int i = 0; i < s1.length() ; i++)
       {
          char ch = s1.charAt(i);
          if(!map.containsKey(ch))
             map.put(ch, 1);
          else
             map.put(ch, map.get(ch) + 1);   
       } 

       int left = 0;
       int count = s1.length();

       for(int right = 0 ; right < s2.length(); right++)
       {
         char ch = s2.charAt(right);
          if(map.containsKey(ch))
          {
            if(map.get(ch) > 0)
               count--;

             map.put(ch, map.get(ch) - 1);
          }
          if(right - left + 1 > s1.length())
         {
            char remove = s2.charAt(left);

            if(map.containsKey(remove))
            {
               if(map.get(remove) >= 0)
                  count++;

               map.put(remove, map.get(remove) + 1);
               
            } 

            left++; 

            
         }

         if(count == 0)
            return true;
           
       } 
       

      return false;   
        
    }
}
