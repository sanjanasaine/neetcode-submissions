class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left <= right) 
        {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)  
                return mid;

            if (nums[left] <= nums[mid])  //case1
            { 
                if(target >= nums[left] && target < nums[mid])
                    right = mid - 1;

                else
                  left = mid + 1;    
            }
            else    //case2
            {
                if(target > nums[mid] && target <= nums[right])
                      left = mid + 1;

                 else
                   right = mid - 1;     
            }
        }

        
        return -1;
    }
}
