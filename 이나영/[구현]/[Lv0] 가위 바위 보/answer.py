def solution(rsp):
    answer = ''
    for you in list(rsp):
        match you:
            case "2":
                answer += "0"
            case "0":
                answer += "5"
            case _:
                answer += "2"
    return answer