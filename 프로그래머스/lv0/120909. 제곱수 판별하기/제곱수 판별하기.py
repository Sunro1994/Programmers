def solution(n):
    x =n**(1/2)
    if n%x == 0:
        answer = 1
    else:
        answer = 2
    return answer