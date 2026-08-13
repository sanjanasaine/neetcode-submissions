class Solution {
    public int characterReplacement(String s, int k) 
    {
        int max = 0;
        int[] freq = new int[26];
        int max_freq = 0;
        int left = 0;
        for(int right =0 ; right < s.length(); right++)
        {
            char ch = s.charAt(right);
            freq[ch - 'A']++;
            max_freq = Math.max(max_freq , freq[ch - 'A']);
            int length = right - left + 1;
           
            int changes = length - max_freq;

            if(changes > k)
            {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        
        return max;
    }
}

