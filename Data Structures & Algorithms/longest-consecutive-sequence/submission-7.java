class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();

        // nums ke saare elements Set mein daalo
        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }

        int max = 0;

        // Set ke elements ko normal for loop se access karna
        ArrayList<Integer> arr = new ArrayList<>(set);

        for(int i = 0; i < arr.size(); i++)
        {
            int num = arr.get(i);

            // check karo ki sequence yahin se start ho raha hai
            if(!set.contains(num - 1))
            {
                int count = 1;

                // consecutive numbers check karo
                while(set.contains(num + count))
                {
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}