import math
from utils import *

class Solution:
    def log_divide(self, dividend, divisor):
        if dividend < divisor:
            return 0
        
        log_dividend = math.log(dividend)
        log_divisor = math.log(divisor)
        
        log_quotient = log_dividend - log_divisor
        _quotient = math.exp(log_quotient)
        
        quotient = math.floor(_quotient)
        error = _quotient - math.floor(quotient)
        if error > 0.999999999:
            quotient += 1
        
        return quotient
    
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == 0:
            return 0
        
        dividend, divisor, sign = get_abs(dividend, divisor)    
        quotient = self.log_divide(dividend, divisor)
        
        return bound(quotient, sign)
