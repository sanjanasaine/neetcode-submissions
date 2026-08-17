class Solution {

    public String encode(List<String> strs) 
    { 
       //encoding by length + seperator + string
       String encoded = "";
       for(int i = 0; i < strs.size(); i++)
       {
         
             encoded =  encoded + strs.get(i).length() + "#" + strs.get(i);
          
       }

       return encoded;

    }

    public List<String> decode(String str) 
    {
        ArrayList<String> ans = new ArrayList<>();  
        int i = 0;
        while(i < str.length())
        {
            String number = "";
            while(str.charAt(i) !=  '#' )
            {
               number =  number + str.charAt(i);
               i++;
            }
            
            ArrayList<String> arr = new ArrayList<>();
            int num = Integer.parseInt(number);
            int count  = 0;
            int j = i + 1;
            String decoded = "";
            while(count < num)
            {
               decoded = decoded + str.charAt(j);
               count ++;
               j++;
               
               

            }
            ans.add(decoded);
            i = j;
            
        }

        return ans;
    }
}
