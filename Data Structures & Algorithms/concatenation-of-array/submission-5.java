class Solution {
    public int[] getConcatenation(int[] nums) 
    {
          int n = nums.length;
          int y = n + n ;
          int arr[] = new int[y];

          for(int i = 0; i < n; i++)
          {
            arr[i] = nums[i];
            arr[n + i] = nums[i];
          }

          
          return arr;
    }
}