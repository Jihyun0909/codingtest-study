def solution(quiz):
    answer = []
    for i, q in enumerate(quiz):
        token = q.split(" ")
        if token[1] == "+":
            result = int(token[0]) + int(token[2])
        else:
            result = int(token[0]) - int(token[2])
            
        if result == int(token[4]):
            answer.insert(i, "O")
        else:
            answer.insert(i, "X")
            
    return answer
