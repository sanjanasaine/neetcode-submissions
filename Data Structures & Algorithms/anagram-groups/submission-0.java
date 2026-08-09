class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String ,  List<String>> map = new HashMap<>();
        
        for(int i = 0; i < strs.length ; i++)
        {
            String word = strs[i];
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            
            String Key = new String(arr);
            if(!map.containsKey(Key))
            {
                map.put(Key, new ArrayList<>());
            }
            
            map.get(Key).add(word);
        }
       return new ArrayList<>(map.values());
      
    }
}
