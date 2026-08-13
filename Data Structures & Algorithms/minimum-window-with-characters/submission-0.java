class Solution 
{
    public String minWindow(String s, String t) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) 
        {
            char ch = t.charAt(i);
            if (!map.containsKey(ch))
                map.put(ch, 1);

            else
                map.put(ch, map.get(ch) + 1);
        }
        int count_req = t.length();
        int left = 0;
        int min_len = Integer.MAX_VALUE;
        int right = 0 , start = 0;
        while (right < s.length()) 
        {
            char ch = s.charAt(right);
            if (map.containsKey(ch)) 
            {
                if(map.get(ch) > 0)
                    count_req--;

                map.put(ch, map.get(ch) - 1);    
            } 
           

            while(count_req == 0) //window valid hai store it
            {
               int length = right - left + 1;  //find length
               if(length < min_len)
               {
                  min_len = length;
                  start = left;
               }

               //remove left character WINDOW SHRINK
               char left_char = s.charAt(left);
               if(map.containsKey(left_char))
               {
                  map.put(left_char, map.get(left_char) + 1);

                  if(map.get(left_char) > 0)
                     count_req++;
               }
               left++;
            }
            right++;
        }
        if(min_len == Integer.MAX_VALUE)
          return "";

        return s.substring(start ,  start + min_len);  
    }
}
