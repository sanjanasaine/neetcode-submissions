class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())
            return false;

        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String word1 = "";
        String word2 = "";
        for(int i = 0; i< ch.length; i++)
        {
            char c = ch[i];
            word1 = word1 + c;
        }

        char[] ct = t.toCharArray();
        Arrays.sort(ct);
        for(int i = 0; i< ct.length; i++)
        {
            char cs = ct[i];
            word2 = word2 + cs;
        }

        if(word1.equals(word2))
           return true;
        else
           return false;
    }
}
