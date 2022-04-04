from utils import *
    
class Solution:
    def get_shifts(self, x, y):
        res = 0
        while x >= y:
            y <<= 1
            res += 1
        
        return res - 1
    
    def recursive_divide(self, dividend, divisor):
        if dividend < divisor:
            return 0
        
        n = self.get_shifts(dividend, divisor)
        quotient = 1 << n
        dividend -= divisor << n
        
        return quotient + self.recursive_divide(dividend, divisor)
    
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == 0:
            return 0
        
        dividend, divisor, sign = get_abs(dividend, divisor)
        quotient = self.recursive_divide(dividend, divisor)

        return bound(quotient, sign)
    