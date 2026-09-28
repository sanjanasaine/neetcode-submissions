class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) 
    {
      int left = 0;
      int right = arr.length - 1;
      ArrayList<Integer> list =  new ArrayList<>();
     
     while(right - left + 1 > k )
     {
        int leftdiff = Math.abs(arr[left] - x);
        int rightdiff = Math.abs(arr[right] - x);

        if(leftdiff > rightdiff)
          left++;

        else
          right--;  
     }

     for(int i = left; i <= right; i ++)
     {
       list.add(arr[i]);
     }
      
      return list;
    }
}