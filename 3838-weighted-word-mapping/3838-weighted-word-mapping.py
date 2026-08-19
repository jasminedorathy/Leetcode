class Solution(object):
    def mapWordWeights(self, words, weights):
        """
        :type words: List[str]
        :type weights: List[int]
        :rtype: str
        """
        ans=""
        for word in words:
            total = 0

            for ch in word:
                total += weights[ord(ch) - ord('a')]
            total = total % 26
            ans += chr(ord('z') -total)
        return ans