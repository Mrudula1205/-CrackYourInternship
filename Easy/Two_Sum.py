class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        out = []
       
        for i in range (len(nums)):
            nex = target-nums[i]
            if(target-nums[i] in nums[i+1:]):
                nums[i] = -1000000001
                nextnum = nums.index(nex)
                
                out.extend([i, nextnum])
                break
        return out