
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        // Store all indices for each number
        for (int i = 0; i < nums.length; i++) {

            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }

            map.get(nums[i]).add(i);
        }

        // Check each number's index list
        for (List<Integer> indices : map.values()) {

            // Check consecutive indices
            for (int i = 0; i < indices.size() - 1; i++) {

                if (indices.get(i + 1) - indices.get(i) <= k) {
                    return true;
                }
            }
        }

        return false;
    }
}