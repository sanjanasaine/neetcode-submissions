class Solution {

    public String encode(List<String> strs) 
    {
        //lengths of all string
            int[] len = new int[strs.size()];
            for(int i = 0 ; i < strs.size(); i++)
            {
                 len[i] = strs.get(i).length();
            }
        //now encode the string length + seperator + string
        String encoded ="";
        for(int i = 0 ; i < strs.size(); i++)
        {
            encoded = encoded + len[i] + "#" + strs.get(i);
        }

        return encoded;
    }

    public List<String> decode(String str) 
    {

        //decode the string
        ArrayList<String> ans = new ArrayList<>();
        int i = 0;
        while( i < str.length())
        {   
            String number = "";
            
            while(str.charAt(i) != '#')
            {
               number = number + str.charAt(i);
               i++;
            }
            int num =Integer.parseInt(number);

            int count = 0;
            String word = "";
            int j = i + 1;
            while(count < num)
            {
                word = word + str.charAt(j);
                count++;
                j++;
            }

            ans.add(word);
            i= j;
        }
       
     return ans;

    }
}
