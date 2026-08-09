class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i = 0 ; i < strs.length ; i++)
        {
            int[] freq =  new int[26];
            String word = strs[i];
            
            for(int j = 0; j <  word.length(); j++)
            {
                 char ch =word.charAt(j);
                 freq[ch - 'a']++;            
            }

            String key = "";

            for(int j = 0; j < 26; j++)
            {
                key = key + freq[j] + ",";
            }
          if(!map.containsKey(key))
          {
            map.put(key, new ArrayList<>());
          }

          map.get(key).add(word);

        }

        return new ArrayList<>(map.values());
        
    }
}
