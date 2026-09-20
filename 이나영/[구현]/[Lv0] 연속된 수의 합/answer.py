def solution(num, total):
    answer = []
    mid = int(total/num)
    start = int(mid - (num-1)/2)
    makelist(num, start, answer)
    if sum(answer) != total:
        start += 1
        answer = []
        makelist(num, start, answer)
    return answer

def makelist(num, start, answer):
    for i in range(num):
        answer.append(start+i)