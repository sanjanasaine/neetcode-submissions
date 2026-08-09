class Solution {
    public String longestCommonPrefix(String[] strs) 
    { 
        
        if(strs.length == 0)
           return  "";
        
        Arrays.sort(strs);

        String one = strs[0];
        String last = strs[strs.length - 1];
        int i =0;
         while( i < one.length() && i < last.length() && one.charAt(i) == last.charAt(i) )
         {
            i++;
         }
       return one.substring(0, i);

    }
}