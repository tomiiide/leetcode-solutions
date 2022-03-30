class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        choice = x
        while choice * choice > x:
            choice = (choice + x // choice) // 2
        return choice
        