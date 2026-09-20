def solution(chicken):
    answer = 0
    remain = 0
    while chicken != 0:
        remain += chicken % 10
        answer += chicken // 10
        chicken = chicken // 10
        
    while remain >= 10:
        bonus = remain // 10
        answer += bonus
        remain = remain % 10 + bonus
    return answer