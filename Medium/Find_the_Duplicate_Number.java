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

/*
 * Brute Force Approach : time complexity O(n^2)
 * Sortig and searching : time complexity O(nlogn)
 * Using Hashing : time complexity O(n) and space complexity O(n)
 * Floyd 
 * Convert the array into linked list and find the cycle
 * Fast and slow pointer
 * slow = nums[slow]
 * fast = nums[nums[fast]]
 * till slow and fast meet
 * 
 * them slow = nums[0]
 * then move slow and fast one step at a time
 * when they meet that is the duplicate number
 * return slow
 */