def solution(my_string):
    answer = ''
    x = my_string.upper()
    for i in range(len(my_string)):
        if my_string[i] == x[i]:
            t1 = my_string[i].lower()
            answer += t1
        else:
            t2 = my_string[i].upper()
            answer += t2
    return answer
            
            