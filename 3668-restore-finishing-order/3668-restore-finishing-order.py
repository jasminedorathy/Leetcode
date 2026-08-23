class Solution(object):
    def recoverOrder(self, order, friends):
        return [x for x in order if x in friends]