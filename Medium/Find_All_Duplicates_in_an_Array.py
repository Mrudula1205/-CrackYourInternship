class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        new = set()
        result = []
        for i in nums:
            if(i not in new):
                new.add(i)
            else:
                result.append(i)
        return result