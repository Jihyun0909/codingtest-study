def solution(s):
    answer, start = 0, 0
    while start < len(s):
        x = s[start]
        x_num, y_num = 0, 0,
        while start < len(s):
            if s[start] == x:
                x_num += 1
            else:
                y_num += 1
            start += 1
            if x_num == y_num:
                break 
        answer += 1
    return answer