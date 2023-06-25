def solution(my_string):
    answer = 0
    for i in range(len(my_string)):
        a = my_string[i]
        b = [1,2,3,4,5,6,7,8,9]
        if a in str(b):
            a = int(a)
            answer += a
        else:
            pass
    return answer