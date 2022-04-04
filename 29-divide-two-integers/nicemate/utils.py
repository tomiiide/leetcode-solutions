def negate(x):
    return 0 - x
    
def get_abs(dividend, divisor):
    sign = 1
    if dividend < 0:
        sign = negate(sign)
        dividend = negate(dividend)

    if divisor < 0:
        sign = negate(sign)
        divisor = negate(divisor)

    return dividend, divisor, sign

def bound(quotient, sign):
    if sign == -1:
        quotient = negate(quotient)

    limit = 2147483647
    if quotient > limit:
        quotient = limit

    limit = (-1 - limit)
    if quotient < limit:
        quotient = limit

    return quotient
