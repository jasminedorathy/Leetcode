class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        temp = k 
        val = 1
        while True:
            if temp * val not in nums:
                return temp*val
            val+=1