def solution(hp):
    answer = 0
    general = hp//5
    soldier = (hp%5)//3
    normal = (hp-(general*5 + soldier*3))
    answer = general + soldier + normal
    return answer