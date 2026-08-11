class Solution {
    public boolean isPalindrome(String s) 
    {
       
       String key = "";
       String ans = "";
       for(int i = 0; i < s.length() ; i++)
       {
           char ch = s.charAt(i);
           if(Character.isLetterOrDigit(ch))
           {
              key = key + Character.toLowerCase(ch);
           }
       }

       for(int i = key.length() - 1; i >= 0 ; i-- )
       {
          ans = ans + key.charAt(i);
       }

       if(key.equals(ans))
          return true;

      return false;    
        
    }
}
