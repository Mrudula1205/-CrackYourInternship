class Solution {
    public void sortColors(int[] nums) {
        int start =0, end=nums.length-1, i=0;
        int temp;
        while(i<=end){
            if(nums[i]==0){
                temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                start++;
                i++;
            }
            else if(nums[i]==1){
                i++;
            }
            else if(nums[i]==2){
                temp = nums[end];
                nums[end] = nums[i];
                nums[i] = temp;
                end--;
            }
            
            
        }
    }
}

/*Again accurate approach, now improve on the code style.
         */