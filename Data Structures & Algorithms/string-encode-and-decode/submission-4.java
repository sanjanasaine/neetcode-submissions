class Solution {

    public String encode(List<String> strs) 
    {
        // encode the string length + seperator + string
        StringBuilder encoded = new StringBuilder();
        for(int i = 0 ; i < strs.size(); i++)
        {
            encoded.append(strs.get(i).length());
            encoded.append("#");
            encoded.append(strs.get(i));
        }

        return encoded.toString();
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
            StringBuilder word = new StringBuilder();
            int j = i + 1;
            while(count < num)
            {
                word.append(str.charAt(j));
                count++;
                j++;
            }

            ans.add(word.toString());
            i= j;
        }
       
     return ans;

    }
}
