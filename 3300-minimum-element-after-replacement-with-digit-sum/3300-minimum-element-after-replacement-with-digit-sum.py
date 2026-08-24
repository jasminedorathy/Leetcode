class Solution:
    def minElement(self, nums: List[int]) -> int:
        nums1 = []
        for i in nums:
            total = 0
            for d in str(i):
                total += int(d)
            nums1.append(total)
        return min(nums1)