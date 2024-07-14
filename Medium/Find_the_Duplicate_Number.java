class Solution {
    public int findDuplicate(int[] nums) {
        int[] duplicate = new int[1000000];
        int dup = 0;
        for (int i=0; i<nums.length; i++){
            if (duplicate[nums[i]]!=nums[i])
                duplicate[nums[i]]=nums[i];
            else 
                dup = nums[i];
        }
        return dup;
    }
}