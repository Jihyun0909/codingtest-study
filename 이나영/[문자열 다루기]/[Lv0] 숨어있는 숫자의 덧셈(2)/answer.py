def solution(my_string):
    answer = 0
    num = ""
    for c in my_string:
        if ord(c) < 65:
            num += c
        elif ord(c) >= 65 and len(num) != 0:
            answer += int(num)
            num = ""
            
    if len(num) != 0:
        answer += int(num)
    return answer 