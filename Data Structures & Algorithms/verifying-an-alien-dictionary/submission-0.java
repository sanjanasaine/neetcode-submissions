class Solution {
    public boolean isAlienSorted(String[] words, String order) 
    {
      
      HashMap<Character, Integer> map = new HashMap<>();
      for(int i = 0; i < order.length(); i++)
      {
         char ch = order.charAt(i);
         map.put(ch, i);
      } 

     
      for(int i = 0; i < words.length - 1; i++)
      {
         String word1 = words[i];
         String word2  = words[i + 1];

         int len = Math.min(word1.length() , word2.length());
         boolean different  = false;

         for(int j = 0; j < len; j++)
         {
            char ch1 = word1.charAt(j);
            char ch2 = word2.charAt(j);
             
            if(ch1 == ch2)
               continue;

             
            int rank1 = map.get(ch1);
            int rank2 = map.get(ch2);

            if(rank1 > rank2)
                return false;

            different =  true;
             break;

           }

            if (!different && word1.length() > word2.length()) {
                return false;
                
         }
      }

      return true;   
    }
}