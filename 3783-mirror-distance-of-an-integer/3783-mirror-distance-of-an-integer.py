class Solution(object):
    def mirrorDistance(self, n):
        """
        :type n: int
        :rtype: int
        """
        rev = int(str(n)[::-1])
        ans = abs(n - rev)
        return ans